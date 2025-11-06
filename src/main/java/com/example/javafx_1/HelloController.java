package com.example.javafx_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textPole;

    @FXML
    protected void onButtonClick() {
        textArea.setText(textPole.getText());
    }



    }
