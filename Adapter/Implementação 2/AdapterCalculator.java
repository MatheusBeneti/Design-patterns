/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercicio_2;

/**
 *
 * @author mathe
 */
public class AdapterCalculator implements ICalculator{
    
    private IBinaryCalculator binaryCalculator;
    private IDecimalCalculator decimalCalculator;

    AdapterCalculator(IBinaryCalculator binaryCalculator, IDecimalCalculator decimalCalculator) {
        this.binaryCalculator = binaryCalculator;
        this.decimalCalculator = decimalCalculator;    
    }

    @Override
    public int somar(int a, int b) {
        return this.decimalCalculator.somar(a, b);
    }

    @Override
    public int subtrair(int a, int b) {
        return this.decimalCalculator.subtrair(a, b);
    }

    @Override
    public int multiplicar(int a, int b) {
        return this.decimalCalculator.multiplicar(a, b);
    }

    @Override
    public String somar(String a, String b) {
        return this.binaryCalculator.somar(a, b);
    }

    @Override
    public String subtrair(String a, String b) {
        return this.binaryCalculator.subtrair(a, b);
    }
}
