package com.example.pr8;
/*
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button givespisok;

    @FXML
   void initialize() {
        givespisok.setOnAction(actionEvent -> {
            System.out.println("Вы нажали на кнопку список");
        });
     }
}


 */

import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.ComboBox;

import javafx.collections.FXCollections;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox VBoxList;

   // @FXML
   // private Button givespisok;

    @FXML
    private Button addnew;

    @FXML
    private ComboBox<Pet> ComboBox;


    @FXML
    private TextField age;


    @FXML
    private TextField nickname;

    @FXML
    private TextField type;

    @FXML
    private TextField vaccines;

    @FXML
    private TextField DateofBirth;

    @FXML
    private Button Delete;

    @FXML
    private Button Save;

    @FXML
    private TextField typevaccines;

    @FXML
    private TextField datav;

    @FXML
    private TextField namev;

    @FXML
    void initialize() {

       addnew.setOnAction(actionEvent -> {
           addnew.getScene().getWindow().hide();
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(getClass().getResource("ggg.fxml"));

           try {
               loader.load();
           } catch (IOException e) {
               e.printStackTrace();
           }

           Parent root = loader.getRoot();
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.showAndWait();
       });

       Delete.setOnAction(actionEvent -> {
           if(HelloApplication.p != null)
           {
               HelloApplication.pets.remove(HelloApplication.p);
           }

           var cb = HelloApplication.GetComboBox();
           cb.getItems().clear();

           try {
               HelloApplication.okno(HelloApplication._stage);
           } catch (IOException e) {
               e.printStackTrace();
           }
       });


       Save.setOnAction(actionEvent -> {
           HelloApplication.Save();
       });




    }




}

