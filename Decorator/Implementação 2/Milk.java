package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mathe
 */
public class Milk extends decoratorCoffe{
    public Milk(ICoffee coffee){
        super(coffee);
    }

    public float calculeCost() {
        return super.calculeCost() + 10;
    }

    public String getDescription() {
        return super.getDescription() + " com Leite ";
    }
    
}
