package org.example;



public class Calculadora {

    public double suma(double a, double b){
        return a + b;
    }


    public double resta(double a, double b){
        return a - b;
    }

    public double multiplicacion(double a, double b){
        return a * b;
    }

    public double divicion(double a, double b){
        if(b == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }












}
