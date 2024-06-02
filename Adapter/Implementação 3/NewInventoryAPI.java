/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_Proposto;

/**
 *
 * @author mathe
 */
public class NewInventoryAPI implements INewInventoryAPI{

    @Override
    public void getProductQuantity() {
        System.out.println("Pegando a quantidade do produto");
    }

    @Override
    public void updateInvetory() {
        System.out.println("Atualizando estoque");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Conferindo disponibilidade");
    }
    
}
