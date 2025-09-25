package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UkolHard extends Application {
    Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13;
    TextField txf1, txf2, txf3;
    TextArea txa1;
    PasswordField psw1;
    DatePicker dtp1;
    ColorPicker ctp1;
    Button btn1;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        //--

        lbl1 = new Label("Jméno:");
        lbl2 = new Label("Přijímení:");

        lbl3 = new Label("Datum narození:");
        lbl4 = new Label("Oblíbená barva:");

        lbl5 = new Label("Login:");
        lbl6 = new Label("Heslo:");

        lbl7 = new Label("Jazyky které ovládám:");
        lbl8 = new Label("Souhlas s podmínkami:");


        //--


        txf1 = new TextField();
        txf2 = new TextField();

        dtp1 = new DatePicker();
        ctp1 = new ColorPicker();

        txf3 = new TextField();
        psw1 = new PasswordField();
        //---

        checkBox1 = new CheckBox("Angličtina");
        checkBox2 = new CheckBox("Čeština");
        checkBox3 = new CheckBox("Němčina");
        checkBox4 = new CheckBox("Španělština");


        radioButton1 = new RadioButton("Ano");
        radioButton2 = new RadioButton("Ne");
        ToggleGroup radio1 = new ToggleGroup();
        radioButton1.setToggleGroup(radio1);
        radioButton2.setToggleGroup(radio1);

        //---
        txa1 = new TextArea();

        btn1 = new Button("Submit");


        root.add(lbl1, 0, 0);
        root.add(txf1, 1, 0);
        root.add(lbl2, 3, 0);
        root.add(txf2, 4, 0);

        root.add(lbl3, 0, 1);
        root.add(dtp1, 1, 1);
        root.add(lbl4, 3, 1);
        root.add(ctp1, 4, 1);

        root.add(lbl5, 0, 2);
        root.add(txf3, 1, 2);
        root.add(lbl6, 3, 2);
        root.add(psw1, 4, 2);
        //--

        root.add(lbl7, 0, 2);
        root.add(txf3, 1, 2);
        root.add(lbl6, 3, 2);
        root.add(psw1, 4, 2);
        root.add(btn1, 5, 4);

        //--


        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}