package ru.polkovnikova.polkovnikova_task15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ButtonCompare;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtNumber;

    @FXML
    void ButtonCompareOnAction(ActionEvent event) {
        int num = Integer.parseInt(txtNumber.getText().toString());
            int second = (num / 10) % 10;
            int last = num % 10;
            if (second > last) {
                lblResult.setText("вторая больше последней " + second);
            } else if (second < last) {
                lblResult.setText("последняя больше последней " + last);
            }
        }
    }

