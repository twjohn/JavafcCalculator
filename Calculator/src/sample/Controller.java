package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField result;
    private double val1 = 0, val2 = 0;
    private String equation = "";
    private String input = "";
    private String operation = "";
    public Button zero, one, two, three, four, five, six, seven, eight, nine, decimal;
    boolean flag = false;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        result.setText("0");

        result.setTextFormatter(new TextFormatter<>((change) -> {
            String text = change.getControlNewText();
            if (text.matches("\\d*\\.?\\d*")) {
                return change;
            } else {
                return null;
            }
        }));
    }
    /******* calculator actions *******/
    public void equal() {
        if(val2 == 0){
            val2 = val1;
        }
        mathOps op = new mathOps();
        result.setText(Double.toString(op.calc(val1, val2, operation)));
        System.out.println("    result of operation: " + op.calc(val1, val2, operation));
        val1 = op.calc(val1, val2, operation);
    }

    public void mult(){
        operation = "*";
    }

    public void add(){

        flag = true;
        operation = "+";
        input = "";

        if(val2 == 0)
            val1 = val1 + val2;

        result.setText(Double.toString(val1));
    }

    public void clear(){
        operation = "Clear";
        val1 = 0;
        val2 = 0;
        flag = false;
        equation = "";
        input = "";
        operation = "";
        result.setText("0");
    }

    public void sub(){
        operation = "-";
    }

    public void div(){
        operation = "/";
    }

    public void sqrt(){
        operation = "sqrt";
    }

    public void mod(){
        operation = "%";
    }

    public void neg(){
        operation = "+/-";
    }

    public void fact(){
        operation = "!";
    }

    public void exp(){
        operation = "^";
    }

    public void four(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "4";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "4";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void five(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "5";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "5";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void six(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "6";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "6";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void one(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "1";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "1";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void two(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "2";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "2";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void three(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "3";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "3";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void zero(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "0";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "0";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void decimal(ActionEvent actionEvent) {
        input = input + ".";
        if(input.charAt(0) == '.'){
            input = "0" + input;
        }
        result.setText(input);
    }

    public void seven(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "7";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "7";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void eight(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "8";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "8";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }

    public void nine(ActionEvent actionEvent) {
        if(!flag) {
            input = input + "9";
            result.setText(input);
            val1 = Double.parseDouble(result.getText());
            System.out.println("Flag not true! setting val1 to "+val1);
        }
        else {
            input = input + "9";
            result.setText(input);
            val2 = Double.parseDouble(result.getText());
            System.out.println("Flag true! setting val2 to "+val2);

        }
    }
}

