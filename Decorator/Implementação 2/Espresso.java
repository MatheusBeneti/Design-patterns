package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mathe
 */
public class Espresso implements ICoffee {

    @Override
    public float calculeCost() {
        return 13;
    }

    @Override
    public String getDescription() {
        return " Café espresso ";
    }
    
}
