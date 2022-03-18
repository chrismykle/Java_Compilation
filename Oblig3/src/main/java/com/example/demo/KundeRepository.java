package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository

public class KundeRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBilett(Bilett bilettReg) {
        String sql = "INSERT INTO Variabler (film, antall, fornavn, etternavn, mob, email) VALUES(?,?,?,?,?,?)";
        db.update(sql,bilettReg.getFilm(),bilettReg.getAntall(),bilettReg.getFornavn(),
                bilettReg.getEtternavn(),bilettReg.getMob(),bilettReg.getEmail());
    }

    public List<Bilett> hentAlleBilett(){
        String sql = "SELECT * FROM Variabler";
        List<Bilett> alleBilett = db.query(sql, new BeanPropertyRowMapper(Bilett.class));
        Collections.sort(alleBilett);
        return alleBilett;
    }

    public void slettAlleKunder() {
        String sql = "DELETE FROM Variabler";
        db.update(sql);
    }

}
