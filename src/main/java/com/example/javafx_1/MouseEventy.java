package com.example.javafx_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MouseEventy extends Application {
    Button btn = new Button();
    @Override

    public void start(Stage stage) throws IOException {

        GridPane root = new GridPane();

        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            public void handle(MouseEvent event){
                MouseButton button = event.getButton();
                if(button == MouseButton.PRIMARY){
                    System.out.println("Leve Tlacitko mysi");
                }else if(button == MouseButton.SECONDARY) {
                    System.out.println("Prave Tlacitko mysi");
                } else if (button == MouseButton.MIDDLE) {
                    System.out.println("Prostřední Tlacitko mysi");
                }
            }

        });


        Scene scene = new Scene(root, 1920, 1000);
        root.add(btn, 0, 0);
        stage.setTitle("Zasunout!");
        stage.setScene(scene);
        stage.show();


    }





    public static void main(String[] args) {
        launch();
    }



}

