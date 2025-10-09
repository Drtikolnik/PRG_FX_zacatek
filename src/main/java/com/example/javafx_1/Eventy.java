package com.example.javafx_1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

public class Eventy extends Application {
    int numberOfPressesOfTheButtonThatIsOnTheScreen = 0;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Label lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13;

        GridPane grid = new GridPane();

        Button btn = new Button("Pozdrav");
        lbl1 = new Label("Pozdrav:");
        lbl2 = new Label("Počet stisknutí:");


        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                numberOfPressesOfTheButtonThatIsOnTheScreen++;
                System.out.println("Pozdrav");
                lbl1.setText("Pozdrav");
                lbl2.setText("Počet stisknutí: "+numberOfPressesOfTheButtonThatIsOnTheScreen);
            }
        });



        grid.add(btn, 0, 0);
        grid.add(lbl1, 1, 0);
        grid.add(lbl2, 2, 0);
        //grid.add(lbl2, 2, 0);

        Scene scene2 = new Scene(grid, 400, 200);
        stage.setTitle("Pozdrav");
        stage.setScene(scene2);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}
