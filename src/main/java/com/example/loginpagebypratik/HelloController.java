package com.example.loginpagebypratik;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.Authenticator;

public class HelloController {
    public TextField user_name;
    public PasswordField password_field;
    public Label output;

     String myuser="prateek";
     String pass="661";
     Integer max_attempt=5;
     Integer counter=0;

    public void getlogin(ActionEvent actionEvent) {

        String username= user_name.getText();
        String password= password_field.getText();

        if (username.isEmpty() || password.isEmpty()) {
            output.setText("Please Provide Username or Password.");

        } else if (username.equals(myuser) && password.equals(pass)) {
            output.setText("Login Successful!");
        }
        else {
            output.setText("Wrong input! " +(max_attempt-counter)+ " attempts are left.");
            counter++;
            if (counter>= max_attempt) {
                output.setText("Sorry, Your Account is Locked!!!");
            }
        }

    }
}