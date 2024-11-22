/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.control;

/**
 *
 * @author Lari
 */
public class Calc {
    private float number1;
    private float number2;

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public float CalcSomar(float number1, float number2){
        float calc;
        calc = number1+number2;
        return calc;
    }
}
