package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    KundeRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Bilett innBilett){
        rep.lagreBilett(innBilett);
    }

    @GetMapping("/hentAlle")
    public List<Bilett> hentAlle(){
        return rep.hentAlleBilett();
    }

    @GetMapping("/clearArray")
    public void clearArray(){
        rep.slettAlleKunder();
    }

}
