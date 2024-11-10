package com.aslbank.calculadora.view.fxmlController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import com.aslbank.calculadora.model.Calculator;

public class FXMLControllerCalculator implements Initializable {
    private double data;
    private int operation = -1;
    private Calculator calculator = new Calculator();

    @FXML
    private Button one;

    @FXML
    private Button eight;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button back;

    @FXML
    private Button mod;

    @FXML
    private Button signo;

    @FXML
    private Button coma;

    @FXML
    private Button tenPow;

    @FXML
    private Button sqrt;

    @FXML
    private Button nFact;

    @FXML
    private Button log;


    @FXML
    private TextField display;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        // Matrix of Number Buttons
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
            this.calculator.setB(0);
            this.calculator.setA(0);
            this.calculator.setMessageError("");
            this.calculator.setFlagSign(false);
        }else if (event.getSource() == coma) {
            display.setText(display.getText() + ",");

        }else if (event.getSource() == signo && this.calculator.isFlagSign() == false) {

            display.setText("-"+display.getText().replace("+",""));
            this.calculator.setFlagSign(true);

        }else if (event.getSource() == signo && this.calculator.isFlagSign() == true) {

            this.calculator.setBeforeStr(display.getText());
            display.setText(this.calculator.signoPolaridadPosisitiva());
            this.calculator.setFlagSign(false);

        }else if (event.getSource() == back) {
            this.calculator.setBeforeStr(display.getText());
            display.setText(this.calculator.back());
        }

        //Operations Buttons
        else if (event.getSource() == plus) {

            data = Double.parseDouble(display.getText().replaceAll(",","."));
            operation = 1; //Addition
            display.setText("");

        } else if (event.getSource() == minus) {

            data = Double.parseDouble(display.getText().replaceAll(",","."));
            operation = 2; //Substraction
            display.setText("");

        } else if (event.getSource() == mult) {

            data = Double.parseDouble(display.getText().replaceAll(",","."));
            operation = 3; //Mul
            display.setText("");

        } else if (event.getSource() == div) {

            data = Double.parseDouble(display.getText().replaceAll(",","."));
            operation = 4; //Division
            display.setText("");

        }else if (event.getSource() == mod) {

            data = Double.parseDouble(display.getText().replaceAll(",","."));
            operation = 9; //Modulo
            display.setText("");

        }else if (event.getSource() == tenPow) {

            operation = 5; //Pow10
            data = Double.parseDouble(display.getText().replaceAll(",","."));
            this.calculator.setA(data);
            double result = this.calculator.x10();
            if(this.calculator.getMessageError() ==""){
                display.setText(String.valueOf(result));
            }else{
                display.setText(this.calculator.getMessageError());
            }

        }else if (event.getSource() == sqrt) {

            operation = 6;
            data = Double.parseDouble(display.getText().replaceAll(",","."));
            this.calculator.setA(data);
            double result = this.calculator.sqrt();

            if(this.calculator.getMessageError() ==""){
                display.setText(String.valueOf(result));
            }else{
                display.setText(this.calculator.getMessageError());
            }

        }else if (event.getSource() == nFact) {

            operation = 7; //nFact
            data = Double.parseDouble(display.getText().replaceAll(",","."));
            this.calculator.setA(data);
            double result = this.calculator.Nfactorial();
            if(this.calculator.getMessageError() ==""){
                display.setText(String.valueOf(result));
            }else{
                display.setText(this.calculator.getMessageError());
            }


        }else if (event.getSource() == log) {

            operation = 8; //log10
            data = Double.parseDouble(display.getText().replaceAll(",","."));
            this.calculator.setA(data);
            double result = this.calculator.Nfactorial();
            if(this.calculator.getMessageError() ==""){
                display.setText(String.valueOf(result));
            }else{
                display.setText(this.calculator.getMessageError());
            }
        }

        // Make the operations whit second operand
        else if (event.getSource() == equals) {
            double secondOperand = Double.parseDouble(display.getText().replaceAll(",","."));
            switch (operation) {
                case 1: //Addition
                    this.calculator.setA(data);
                    this.calculator.setB(secondOperand);
                    double ans = this.calculator.add();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
                case 2: //Subtraction
                    this.calculator.setA(data);
                    this.calculator.setB(secondOperand);
                    ans = this.calculator.substract();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
                case 3: //Mul
                    this.calculator.setA(data);
                    this.calculator.setB(secondOperand);
                    ans = this.calculator.multiply();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
                case 4: //Div
                    this.calculator.setA(data);
                    this.calculator.setB(secondOperand);
                    ans = this.calculator.div();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;

                case 5: //tenPow

                    this.calculator.setA(secondOperand);
                    ans = this.calculator.x10();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
                case 6: //sqtr

                    this.calculator.setA(secondOperand);
                    ans= this.calculator.sqrt();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }

                    break;
                case 7: //nFact
                    this.calculator.setA(secondOperand);
                    ans = this.calculator.Nfactorial();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
                case 8: //log10
                    this.calculator.setA(secondOperand);
                    ans = this.calculator.log10();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;

                case 9: //mod
                    this.calculator.setA(data);
                    this.calculator.setB(secondOperand);
                    ans = this.calculator.mod();
                    if(this.calculator.getMessageError() ==""){
                        display.setText(String.valueOf(ans));
                    }else{
                        display.setText(this.calculator.getMessageError());
                    }
                    break;
            }
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
