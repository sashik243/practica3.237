package ru.polkovnikova.polkovnikova_task18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class SumController {

    @FXML
    private Button ResultButton;

    @FXML
    private Label lblM;

    @FXML
    private Label lblY;

    @FXML
    private Label lblk;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtC;

    @FXML
    void ResultButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(txtA.getText());
        double b = Double.parseDouble(txtB.getText());
        double c = Double.parseDouble(txtC.getText());
        double m = (a + pow(b, 2)) / c;
        lblM.setText("" +m);
        double k = m % 3;
        lblk.setText("" +k);
        double y;
        if (k == 0) {
            y = floor(pow(E,m+c));
            lblY.setText("" +y);
        } else if (k == 1) {
            y = floor(log(a/b));
            lblY.setText("" +y);
        } else if (k == 2) {
            y = floor(sqrt(abs(pow(a+b,2)+c)));
            lblY.setText("" +y);
        }
    }
}


