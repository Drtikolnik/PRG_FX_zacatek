package com.example.javafx_1;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class HelloController {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textPoleJmeno;
    @FXML
    private DatePicker datePoleDatum;
    @FXML
    private TextField textPolePrijmeni;
    @FXML
    private TextField textPoleLogin;
    @FXML
    private PasswordField heslo;
    @FXML
    private ColorPicker barva;

    @FXML
    private CheckBox checkAnglictina;
    @FXML
    private CheckBox checkCestina;
    @FXML
    private CheckBox checkNemcina;
    @FXML
    private CheckBox checkSpanelstina;

    @FXML
    private RadioButton ano;
    @FXML
    private RadioButton ne;

    ArrayList<Uzivatel> uzivatele = new ArrayList<Uzivatel>();



    @FXML
    protected void onButtonClick() {
        String jmeno = textPoleJmeno.getText();
        String prijmeni = textPolePrijmeni.getText();
        String datumNarozeni = datePoleDatum.getValue().toString();
        String vybranaBarva = barva.getValue().toString();
        String login = textPoleLogin.getText();
        String hesloText = heslo.getText();

        if (ano.isSelected()) {

            uzivatele.add(new Uzivatel(jmeno, prijmeni, datumNarozeni, vybranaBarva, login, hesloText));

            int pocetOvladanychJazyku = 0;
            if (checkAnglictina.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (checkCestina.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (checkNemcina.isSelected()) {
                pocetOvladanychJazyku++;
            }
            if (checkSpanelstina.isSelected()) {
                pocetOvladanychJazyku++;
            }

            textArea.setText("Registrace uživatele " + login + " se jménem " + jmeno + " " + prijmeni + ", datumem narození " + datumNarozeni + " a počtem ovládaných jazyků " + pocetOvladanychJazyku + " proběhla úspěšně");
            textArea.setStyle("-fx-text-fill: black;");

        } else {
            textArea.setText("Uživatele nelze registrovat");
            textArea.setStyle("-fx-text-fill: red;");
        }

    }

    @FXML
    protected void onButtonClickVypisUzivatele() {
        for (Uzivatel u : uzivatele) {
            System.out.println(u);
        }

    }








}







