/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author mathe
 */
public class Tomate extends decoratorPizza{
    
    public Tomate(IPizza pizza) {
        super(pizza);
    }
    
    public float calculeCost() {
        return super.calculeCost() + 6;
    }

    public String getDescription() {
        return super.getDescription() + " com tomate ";
    }
    
}
