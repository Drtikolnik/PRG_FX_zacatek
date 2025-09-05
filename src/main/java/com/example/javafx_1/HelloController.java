package com.example.javafx_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    int kolikrat = 0;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("LUKÁŠ DRTINA");
            kolikrat++;
            System.out.println("Tlačítko bylo stisknuto " +kolikrat+ "x");
            if (kolikrat == 5) {
                welcomeText.setText("TLAČÍTKO JE VYČERPÁNO");
            }
    }
}