/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_2;

/**
 *
 * @author mathe
 */
public class Main {
    public static void main(String[] args) {
        AdapterCalculator calculator = new AdapterCalculator(new BinaryCalculator(), new DecimalCalculator());
        
        System.out.println(calculator.somar("11", "10"));
        System.out.println(calculator.somar(5, 2));
        System.out.println(calculator.subtrair("11", "10"));
        System.out.println(calculator.subtrair(15, 10));
        System.out.println(calculator.multiplicar(2, 10));
    }
}

