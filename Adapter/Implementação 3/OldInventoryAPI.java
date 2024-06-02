/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_Proposto;

/**
 *
 * @author mathe
 */
public class OldInventoryAPI implements IOldInventoryAPI{

    @Override
    public void addProduct() {
        System.out.println("Adicionando produto");
    }

    @Override
    public void consultQuantity() {
        System.out.println("Consultando quantidade");
    }

    @Override
    public void removeProduct() {
        System.out.println("Removendo produto");
    }
    
}
