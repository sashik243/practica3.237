package ru.polkovnikova.polkovnikova_task17;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button ResultButton;

    @FXML
    private TextField lblMax;

    @FXML
    private TextField lblMin;

    @FXML
    private TextField txtNam1;

    @FXML
    private TextField txtNam2;

    @FXML
    private TextField txtNam3;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double num1 = Double.parseDouble(txtNam1.getText().toString());
        double num2 = Double.parseDouble(txtNam2.getText().toString());
        double num3 = Double.parseDouble(txtNam3.getText().toString());
        double min = Math.min(num1, Math.min(num2, num3));
        double max = Math.max(num1, Math.max(num2, num3));
        lblMax.setText(""+max);
        lblMin.setText(""+min);

    }

}
