package com.example.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField nameField;
    @FXML
    public Button sayHello;
    @FXML
    public Button sayBye;
    @FXML
    public void onButtonClicked(ActionEvent e)
    {
        if(e.getSource().equals(sayHello))
        {
            System.out.println("Hello, "+ nameField.getText());
        }
        else if(e.getSource().equals(sayBye))
        {
            System.out.println("Bye, "+ nameField.getText());
        }
    }


}