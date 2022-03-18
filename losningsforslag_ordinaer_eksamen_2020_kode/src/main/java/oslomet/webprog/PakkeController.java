package oslomet.webprog;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.swing.undo.UndoableEdit;
import java.io.IOException;
import java.sql.PreparedStatement;


@RestController
public class PakkeController {


    @Autowired
    private JdbcTemplate db;

    private Logger logger = LoggerFactory.getLogger(PakkeController.class);

    @PostMapping("/lagre")
    @Transactional
    public void lagrePakke(Kunde sending, HttpServletResponse response) throws IOException {

        String sql1 = "INSERT INTO Kunde (PId,Fornavn,Etternavn,Adresse,Postnr,Telefonnr,Epost)" +
                " VALUES(?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO Pakke (KId,Volum,Vekt)" +
                " VALUES(?,?,?)";

        KeyHolder id = new GeneratedKeyHolder();
        KeyHolder id2 = new GeneratedKeyHolder();
        try{
            db.update(con -> {
                PreparedStatement par = con.prepareStatement(sql1, new String[]{"KId"});
                par.setInt(1,sending.getPId());
                par.setString(2,sending.getFornavn());
                par.setString(3,sending.getEtternavn());
                par.setString(4,sending.getAdresse());
                par.setString(5,sending.getPostnr());
                par.setString(6,sending.getTelefonnr());
                par.setString(7,sending.getEpost());
                return par;
            }, id);
            db.update(con -> {
                PreparedStatement par = con.prepareStatement(sql2, new String[]{"PId"});
                par.setInt(1,sending.getKId());
                par.setString(2,sending.getVolum());
                par.setString(3,sending.getVekt());
                return par;
            }, id2);
            int kid = id.getKey().intValue();
            int pid2= id2.getKey().intValue();
            db.update(sql2,kid,sending.getVolum(),sending.getVekt());
            db.update(sql1,pid2,sending.getFornavn(), sending.getEtternavn(),sending.getAdresse(),sending.getPostnr(),
            sending.getTelefonnr(), sending.getEpost());
        }

        catch(Exception e){
            String errorMessage = "Feil ved lagring av pakkesending: " + e;
            logger.error(errorMessage);
            response.sendError(HttpStatus.NON_AUTHORITATIVE_INFORMATION.value(), errorMessage);
        }
        String regex1 = "[a-øæååA-ZÆØÅ]{2,}";
        String regex2 = "[a-øæååA-ZÆØÅ]{2,}";
        boolean OK1 = Kunde.getFornavn().matches(regex1);
        boolean OK2 = Kunde.getEtternavn().matches(regex2);
        if(OK1 && OK2){
            String sql = "INSERT INTO Bruker(brukernavn,passord)" +
                    " VALUES(?,?)";
            try{
                db.update(sql,Kunde.getFornavn(),Kunde.getEtternavn());
            }
            catch(Exception e){
                logger.error("Feil i sening "+e);
            }
        }
        else{
            logger.error("Fe
    }



    @PostMapping("/postnr")

    public void sjekkPostnr(String postnr, Kunde kunde, HttpServletResponse response) throws IOException {

        String sql3 = "SELECT Postnr from Kunde WHERE Postnr=?";
        try {
            Kunde dbBruker = db.queryForObject(sql3,
                    BeanPropertyRowMapper.newInstance(Kunde.class),
                    new Object[]{Kunde.getPostnr()});
            if(sjekkPostnr(Kunde.getPostnr(), dbBruker.getPostnr())) {
                return true;
            } else {

                return false;
            }
        }
        catch(Exception e) {
            String errorMessage = "Feil i postnummer: " + e;
            logger.error(errorMessage);
            response.sendError(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
            return false;
        }
    }
}



