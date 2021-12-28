package com.example.pr8;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox CheckBoxCat;

    @FXML
    private CheckBox CheckBoxDog;

    @FXML
    private Button add;

    @FXML
    private TextField addage;

    @FXML
    private TextField adddateofbirth;

    @FXML
    private TextField adddatev;

    @FXML
    private TextField adddrugname;

    @FXML
    private TextField addtypev;

    @FXML
    private TextField addnickname;



    @FXML
    void initialize() {
       add.setOnAction(actionEvent -> {
           add.getScene().getWindow().hide();
           FXMLLoader l = new FXMLLoader();
           l.setLocation(getClass().getResource("hello-view.fxml"));

           try {
               l.load();
           } catch (IOException e) {
               e.printStackTrace();
           }

           String type;
           if(CheckBoxCat.isSelected()){
               type="Кошка";
           }
           else {
               type="Собака";
           }

           String nickname=addnickname.getText();
           Integer age = Integer.valueOf(addage.getText());
           String DofB = adddateofbirth.getText();
           String datev= adddatev.getText();
           String typev=addtypev.getText();
           String drugname = adddrugname.getText();
            Pet p = new Pet(type,nickname,age,DofB,datev,typev,drugname);
            p.number=HelloApplication.pets.size()+1;
            HelloApplication.pets.add(p);

           try {
               HelloApplication.okno(HelloApplication._stage);
           } catch (IOException e) {
               e.printStackTrace();
           }

       });
    }




}
