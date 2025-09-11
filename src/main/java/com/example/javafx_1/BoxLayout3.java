package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class BoxLayout3 extends Application {
    Button tlacitko1;
    Button tlacitko2;
    Button tlacitko3;
    Button tlacitko4;
    Button tlacitko5;
    Button tlacitko6;
    Button tlacitko7;
    Button tlacitko8;

    @Override
    public void start(Stage primaryStage) {



        tlacitko1 = new Button("Click me uwu 1");
        tlacitko2 = new Button("Click me uwu 2");
        tlacitko3 = new Button("Click me uwu 3");
        tlacitko4 = new Button("Click me uwu 4");
        tlacitko5 = new Button("Click me uwu 5");
        tlacitko6 = new Button("Click me uwu 6");
        tlacitko7 = new Button("Click me uwu 7");
        tlacitko8 = new Button("Click me uwu 8");

        BorderPane pane = new BorderPane();
        HBox hbox1 = new HBox(tlacitko1);
        VBox vbox1 = new VBox(tlacitko2, tlacitko3, tlacitko4);
        HBox hbox2 = new HBox(tlacitko5, vbox1, tlacitko6);
        HBox hbox3 = new HBox(tlacitko7);


        VBox root = new VBox(hbox1, hbox2, hbox3);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}