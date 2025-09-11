package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class BoxLayout2 extends Application {
    Button tlacitko1;
    Button tlacitko2;
    Button tlacitko3;
    Button tlacitko4;
    Button tlacitko5;
    Button tlacitko6;

    @Override
    public void start(Stage primaryStage) {



        tlacitko1 = new Button("Klikni na mě uwu 1");
        tlacitko2 = new Button("Klikni na mě uwu 2");
        tlacitko3 = new Button("Klikni na mě uwu 3");
        tlacitko4 = new Button("Klikni na mě uwu 4");
        tlacitko5 = new Button("Klikni na mě uwu 5");
        tlacitko6 = new Button("Klikni na mě uwu 6");

        BorderPane pane = new BorderPane();
        HBox hbox1 = new HBox(tlacitko1);
        HBox hbox2 = new HBox(tlacitko3, tlacitko4, tlacitko5);
        HBox hbox3 = new HBox(tlacitko6);


        VBox root = new VBox(hbox1, hbox2, hbox3);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}