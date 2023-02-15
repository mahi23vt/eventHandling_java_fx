package com.example.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private Button sayHello;
    @FXML
    private Button sayBye;
    @FXML
    private CheckBox isChecked;

    @FXML
    public void initialize()
    {
        disableButtons();
    }
    public void disableButtons()
    {
        sayHello.setDisable(true);
        sayBye.setDisable(true);
    }
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
        try{
            Thread.sleep(10000);
    }
        catch (InterruptedException event)
        {
            // we dont care about this at the moment
        }
        if(isChecked.isSelected())
        {
            nameField.clear();
            disableButtons();
        }
    }
    @FXML
    public void handleKeyReleased()
    {
        // This function is to keep the buttons disabled until anything is entered in the text field button.
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        sayHello.setDisable(disableButtons);
        sayBye.setDisable(disableButtons);
    }
    public void handleChange()
    {
        System.out.println("The checkbox is: "+(isChecked.isSelected() ? "checked": "not checked"));
    }

}