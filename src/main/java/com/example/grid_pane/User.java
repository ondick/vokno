package com.example.grid_pane;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<String> jazyky = new ArrayList<>();
    private String jmeno;
    private String prijmeni;
    private String login;
    private String heslo;
    private String datumNarozeni;
    private String oblibenaBarva;

    User(String jmeno, String prijmeni,String login, String heslo,String datumNarozeni,String oblibenaBarva) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.login = login;
        this.heslo = heslo;
        this.datumNarozeni = datumNarozeni;
        this.oblibenaBarva = oblibenaBarva;
    }

    public String getOblibenaBarva() {
        return oblibenaBarva;
    }

    public void setOblibenaBarva(String oblibenaBarva) {
        this.oblibenaBarva = oblibenaBarva;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "User{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", login='" + login + '\'' +
                ", heslo='" + heslo + '\'' +
                ", datumNarozeni='" + datumNarozeni + '\'' +
                ", oblibenaBarva='" + oblibenaBarva + '\'' +
                '}';
    }
}
