/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author mathe
 */
public class decoratorPizza implements IPizza{
    
    protected IPizza pizza;
            
    public decoratorPizza(IPizza pizza){
        this.pizza = pizza;
    }

    @Override
    public float calculeCost() {
        return this.pizza.calculeCost();
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }
}
