package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller {

    private final List<Variabler> Kunder = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Variabler innKunde){
        Kunder.add(innKunde);
    }

    @GetMapping("/hentAlle")
    public List<Variabler> hentAlle(){
        return Kunder;
    }
    /*
    @GetMapping("/clearArray")
    public void clearArray(){
        Kunder.clear();
    }
    */
}
