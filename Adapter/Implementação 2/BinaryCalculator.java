/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_2;

/**
 *
 * @author mathe
 */
public class BinaryCalculator implements IBinaryCalculator {

    @Override
    public String somar(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int resultado = numA + numB;
        return Integer.toBinaryString(resultado);
    }

    @Override
    public String subtrair(String a, String b) {
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        int resultado = numA - numB;
        return Integer.toBinaryString(resultado);
    }
    
}
