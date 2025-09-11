package com.example.javafx_1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class BoxLayout5padding extends Application {
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
        tlacitko8.setVisible(false);


        BorderPane pane = new BorderPane();
        VBox vbox1 = new VBox(tlacitko1, tlacitko2);

        HBox hbox2 = new HBox(tlacitko3, tlacitko4);
        hbox2.setPadding(new Insets(-12, 10, 1, 100));
        hbox2.setSpacing(20);


        VBox root = new VBox(vbox1, hbox2);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}