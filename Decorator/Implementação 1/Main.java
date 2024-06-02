/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author mathe
 */
public class Main {
    public static void main(String[] args) {
        IPizza massaFinaPizza = new Tomate(new MassaFinaPizza());
        System.out.println(massaFinaPizza.calculeCost());
        System.out.println(massaFinaPizza.getDescription());
        
        IPizza massaGrossaPizza = new Ovo(new MassaGrossaPizza());
        System.out.println(massaGrossaPizza.calculeCost());
        System.out.println(massaGrossaPizza.getDescription());
    }
}
