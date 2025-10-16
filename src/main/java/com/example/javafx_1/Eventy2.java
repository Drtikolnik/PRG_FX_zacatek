package com.example.javafx_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Eventy2 extends Application {
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

        txf1 = new TextField("Text1");
        txf2 = new TextField("Text2");

        btn1 = new Button("Prohodit");


        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                String a = txf1.getText();
                String b = txf2.getText();
                txf1.setText(b);
                txf2.setText(a);
            }
        }
        );



        root.add(txf1, 1, 0);
        root.add(txf2, 2, 0);

        root.add(btn1, 0, 1);


        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(txf1, txf2, btn1);

        Scene scene = new Scene(hbox1, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();






    }


}
