/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author mathe
 */
public class Ovo extends decoratorPizza{
    
    public Ovo(IPizza pizza) {
        super(pizza);
    }
    
    public float calculeCost() {
        return super.calculeCost() + 5;
    }

    public String getDescription() {
        return super.getDescription() + " com Ovo ";
    }
    
}
