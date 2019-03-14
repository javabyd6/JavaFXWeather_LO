package pl.sda.openweather.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {

    @FXML
    private Button search;

    @FXML
    private TextField city;

    @FXML
    private Label TemperatureIn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        city.setText("TEST123");
        TemperatureIn.setText("");

    }

    public void setCity() {
        System.out.println("KLIK KLIK KLIK");
    }
}
