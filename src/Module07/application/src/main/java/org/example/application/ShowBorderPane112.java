package org.example.application;

import javafx.application.Application;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;


public class ShowBorderPane112 extends Application

{

    @Override

    public void start(Stage primaryStage)

    {

//create pane and set its properties

        BorderPane pane = new BorderPane();

//places nodes in the pane

        pane.setTop(new CustomPane("Top"));

        pane.setRight(new CustomPane("Right"));

        pane.setBottom(new CustomPane("Bottom"));

        pane.setLeft(new CustomPane("Left"));

        pane.setCenter(new CustomPane("Center"));





//Create a scene and place it in the stage

        Scene scene = new Scene(pane);

        primaryStage.setTitle("Show Border Pane");

        primaryStage.setScene(scene);

        primaryStage.show();






    }



    public static void main(String[] args)

    {

        Application.launch(args);


    }

}

class CustomPane extends StackPane

{ public CustomPane(String title)

{

    getChildren().add(new Label(title));

    setStyle("-fx-border-color:red");

    setPadding(new Insets(11.5,12.5,13.5,14.5));


}


}

