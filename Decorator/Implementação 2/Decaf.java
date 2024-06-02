package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mathe
 */
public class Decaf implements ICoffee{

    @Override
    public float calculeCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Café Decaf ";
    }
    
}
