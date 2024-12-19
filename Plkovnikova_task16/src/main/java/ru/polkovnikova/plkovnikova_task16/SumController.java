package ru.polkovnikova.plkovnikova_task16;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField NamberTextField;

    @FXML
    private Label ResultLbl;

    @FXML
    private Button TransformButton;

    @FXML
    void TransformButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(NamberTextField.getText().toString());
        int number;
        if (num > 0) {
            number = num - 8;
            ResultLbl.setText(""+number);
        } if (num < 0) {
            number = num + 6;
            ResultLbl.setText(""+number);
        } if (num == 0) {
            number = 10;
            ResultLbl.setText("" + number);

        }

    }}
