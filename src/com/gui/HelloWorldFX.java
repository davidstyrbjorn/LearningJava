package com.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

import java.awt.*;


public class HelloWorldFX extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Hello JavaFX");

        StackPane root = new StackPane();

        Text text = new Text(25, 25, "Hello.exe");
        text.setFill(Color.DARKCYAN);
        text.setFont(Font.font)

        primaryStage.setScene((new Scene(root, 300, 300)));
        primaryStage.show();
    }

}
