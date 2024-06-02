package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mathe
 */
public class decoratorCoffe implements ICoffee{
    
    protected ICoffee coffee;
            
    public decoratorCoffe(ICoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public float calculeCost() {
        return this.coffee.calculeCost();
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }
    
}
