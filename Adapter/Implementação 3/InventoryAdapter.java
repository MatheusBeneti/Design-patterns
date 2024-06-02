/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_Proposto;

/**
 *
 * @author mathe
 */
public class InventoryAdapter implements IOldInventoryAPI{
    
    private NewInventoryAPI inventoryAPI;

    InventoryAdapter(NewInventoryAPI newInventoryAPI) {
        this.inventoryAPI = newInventoryAPI;
    }

    @Override
    public void addProduct() {
        this.inventoryAPI.updateInvetory();
    }

    @Override
    public void consultQuantity() {
        this.inventoryAPI.getProductQuantity();
    }

    @Override
    public void removeProduct() {
        this.inventoryAPI.updateInvetory();
    }
    
    public void checkAvailability(){
        this.inventoryAPI.checkAvailability();
    }
}
