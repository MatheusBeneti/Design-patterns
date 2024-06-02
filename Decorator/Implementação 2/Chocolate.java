package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mathe
 */
public class Chocolate extends decoratorCoffe{

    public Chocolate(ICoffee coffee) {
        super(coffee);
    }


    public float calculeCost() {
        return super.calculeCost();
    }
    

    public String getDescription() {
        return super.getDescription() + " Chocolate ";
    }
    
}
