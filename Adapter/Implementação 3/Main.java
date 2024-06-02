/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_Proposto;

/**
 *
 * @author mathe
 */
public class Main {
    public static void main(String[] args) {
        
        InventoryAdapter inventoryAPI = new InventoryAdapter(new NewInventoryAPI());
        
        inventoryAPI.addProduct();
        inventoryAPI.checkAvailability();
        inventoryAPI.consultQuantity();
        inventoryAPI.removeProduct();
    }
}

