package com.example.demo;

public class Bilett implements Comparable<Bilett>{

    private String film;
    private String antall;
    private String fornavn;
    private String etternavn;
    private String mob;
    private String email;

    public Bilett(String film, String antall, String fornavn, String etternavn, String mob, String email) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.mob = mob;
        this.email = email;
    }

    public Bilett() {
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getAntall() {
        return antall;
    }

    public void setAntall(String antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return film + antall + fornavn + etternavn + mob + email;
    }

    @Override
    public int compareTo(Bilett bilett){
        return etternavn.compareTo(bilett.getEtternavn());
    }
}

