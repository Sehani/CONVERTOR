package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button kilometer;

    @FXML
    private Button fahrenheit;

    @FXML
    private Button celsius;

    @FXML
    private Button Meter;

    @FXML
    private Button lkr;

    @FXML
    private Button inr;

    @FXML
    private Button Volume;

    @FXML
    private Button clear;

    @FXML
    private TextField num;

    @FXML
    private Label screen;

    @FXML
    void buttonClicked(ActionEvent event) {
        screen.setText("");
        num.setText("");

    }

    @FXML
    void calculateCelsius(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double Cel= (x*9/5)+32;
            screen.setText(String.valueOf(Cel));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }

    @FXML
    void calculateFahrenheit(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double Fah= (x-32)*5/9;
            screen.setText(String.valueOf(Fah));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }

    @FXML
    void calculateInr(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double INR=x*0.36794916;
            screen.setText(String.valueOf(INR));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }

    @FXML
    void calculateKilometer(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double KM= x*1000;
            screen.setText(String.valueOf(KM));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");

        }
    }

    @FXML
    void calculateLkr(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double lrupee=x/0.36794916;
            screen.setText(String.valueOf(lrupee));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }

    @FXML
    void calculateMeter(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double Meter= x/1000;
            screen.setText(String.valueOf(Meter));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }

    @FXML
    void calculateVolume(ActionEvent event) {
        try {
            double x=Double.parseDouble(num.getText());
            double vol= x*x*x;
            screen.setText(String.valueOf(vol));
        }
        catch (Exception e){
            num.setText("Please enter a number");
            screen.setText("error!");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
