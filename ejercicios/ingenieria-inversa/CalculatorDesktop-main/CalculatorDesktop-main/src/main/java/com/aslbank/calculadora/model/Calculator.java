package com.aslbank.calculadora.model;

import java.text.DecimalFormat;

public class Calculator {

    private double a, b;
    private boolean flagSign;
    private String messageError, beforeStr;

    public Calculator() {
        this.a=0;
        this.b=0;
        this.flagSign = false;
        this.messageError = "";
        this.beforeStr = " ";
    }

    public boolean isFlagSign() {
        return flagSign;
    }

    public void setFlagSign(boolean flagSign) {
        this.flagSign = flagSign;
    }

    public String getBeforeStr() {
        return beforeStr;
    }

    public void setBeforeStr(String beforeStr) {
        this.beforeStr = beforeStr;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {this.a = a;}

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public static double formatearDecimales(Double numero, Integer numeroDecimales) {
        return (Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales));
    }

    public double add() {return this.a+this.b;}

    public double substract()
    {
        return this.a-this.b;
    }

    public double multiply()
    {
        return this.a*this.b;
    }

    public double div() {
        double result = 0;
        if(this.b != 0){
            result = formatearDecimales(this.a/this.b,5);
        }else{

            this.messageError = "No se Puede Dividir por Cero";
        }
        return result;
    }

    public double x10() {

        double result = formatearDecimales(Math.pow(10,this.a),5);

        return result;
    }

    public double sqrt() {
        double result = 0;
        if(this.a > 0){
            result = formatearDecimales(Math.sqrt(this.a),5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;

    }

    public double Nfactorial() {

        double result = 0;
        double aFloor = Math.floor(this.a);
        if(aFloor > 0){
            long factorial = 1;
            for(double i=1; i<=aFloor; i++){
                factorial *= i;
            }
            result = factorial;
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;
    }

    public double log10() {

        double result = 0;
        if(this.a > 0){
            result = formatearDecimales(Math.log10(this.a),5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;
    }

    public double mod(){
        double result = 0;
        if(this.a != 0){
            result = formatearDecimales(this.a%this.b,5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;
    }

    public String back(){

        String afterStr = this.beforeStr.substring(0,this.beforeStr.length()-1);

        return afterStr;
    }

    public String signoPolaridadPosisitiva(){

        String afterStr = this.beforeStr.replace("-","+");
        return afterStr;
    }
    public String signoPolaridadNegativa(){

        String afterStr = this.beforeStr.replace("+","-");

        return afterStr;
    }



}
