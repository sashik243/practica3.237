package ru.polkovnikova.polkovnikova_task20;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.InputStream;

public class SumController {

    @FXML
    private Button ButtonCheck;

    @FXML
    private ImageView imgV;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtX;

    @FXML
    private TextField txtY;

    @FXML
    void ButtonCheckOnAction(ActionEvent event) {
        double x = Double.parseDouble(txtX.getText().toString());
        double y = Double.parseDouble(txtY.getText().toString());
        InputStream image = getClass().getResourceAsStream("pig.bmp");
        imgV.setImage(new Image(image));
        if (y > Math.abs(x) && y < 12) {
            lblResult.setText("да внутри");

        } else if (y == Math.abs(x) || y == 12) {
            lblResult.setText("на границе");

        } else {
            lblResult.setText("нет");
       }


    }

}
