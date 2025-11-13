package com.example.javafx_1;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    private String login;
    private String heslo;
    private String barva;

    public Uzivatel(String jmeno, String prijmeni, String datumNarozeni, String login, String heslo, String barva) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.barva = barva;
        this.login = login;
        this.heslo = heslo;
    }

    public String toString(){
        return "Uivatel: " + login + ", Jméno: " + jmeno + " " + prijmeni + ", Datumem narození: " + datumNarozeni + ", Vybraná barva: " +barva+ ", Login: " +login+ ", Heslo: " +heslo;
    }



}


