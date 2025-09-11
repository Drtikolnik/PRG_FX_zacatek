package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class BoxLayout1 extends Application {
    Button tlacitko1;
    Button tlacitko2;
    Button tlacitko3;
    Button tlacitko4;
    Button tlacitko5;

    @Override
    public void start(Stage primaryStage) {



        tlacitko1 = new Button("Klikni na mě uwu 1");
        tlacitko2 = new Button("Klikni na mě uwu 2");
        tlacitko3 = new Button("Klikni na mě uwu 3");
        tlacitko4 = new Button("Klikni na mě uwu 4");
        tlacitko5 = new Button("Klikni na mě uwu 5");

        BorderPane pane = new BorderPane();
        VBox vbox = new VBox(tlacitko1, tlacitko2);
        HBox hbox = new HBox(tlacitko3, vbox, tlacitko4, tlacitko5);




        Scene scene = new Scene(hbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}