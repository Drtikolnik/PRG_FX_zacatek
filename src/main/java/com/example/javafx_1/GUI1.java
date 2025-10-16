package com.example.javafx_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI1 extends Application {

    public void start(Stage stage) {
        GridPane root = new GridPane();



        Button btn1 = new Button("Zadat");
        Label lbl1 = new Label("1. Známka");
        Label lbl2 = new Label("2. Známka");
        Label lbl3 = new Label("3. Známka");
        Label lbl4 = new Label("4. Známka");
        Label lbl5 = new Label("5. Známka");

        TextField txf1 = new TextField();
        TextField txf2 = new TextField();
        TextField txf3 = new TextField();
        TextField txf4 = new TextField();
        TextField txf5 = new TextField();


        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){

                double znamka1, znamka2, znamka3, znamka4, znamka5;

                try {
                    znamka1 = Double.parseDouble(txf1.getText());

                    znamka2 = Double.parseDouble(txf2.getText());
                    znamka3 = Double.parseDouble(txf3.getText());
                    znamka4 = Double.parseDouble(txf4.getText());
                    znamka5 = Double.parseDouble(txf5.getText());
                    if (znamka1 < 1 || znamka1 > 5 || znamka2 < 1 || znamka2 > 5 || znamka3 < 1 || znamka3 > 5 || znamka4 < 1 || znamka4 > 5 || znamka5 < 1 || znamka5 > 5) {
                        throw new ArithmeticException("Známky musí být mezi 1 a 5");
                    }


                    Double prumer = (znamka1 + znamka2 + znamka3 + znamka4 + znamka5) / 5;
                    Label vysledek = new Label(prumer.toString());
                    root.add(vysledek, 0, 7);

                } catch (NumberFormatException e) {
                    System.err.println("Známky musí být čísla!");
                } catch (Exception e) {
                    System.err.println("Chyba: " + e.getMessage());
                }

            }
        }
        );

        root.add(lbl1, 0, 0);
        root.add(txf1, 1, 0);
        root.add(lbl2, 0, 1);
        root.add(txf2, 1, 1);

        root.add(lbl3, 0, 2);
        root.add(txf3, 1, 2);
        root.add(lbl4, 0, 3);
        root.add(txf4, 1, 3);

        root.add(lbl5, 0, 4);
        root.add(txf5, 1, 4);
        root.add(btn1, 0, 6);


        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }











    public static void main(String[] args) {
        launch(args);
    }
}
