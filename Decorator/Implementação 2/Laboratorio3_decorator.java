package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author mathe
 */
public class Laboratorio3_decorator {

    public static void main(String[] args) {
        
        ICoffee express = new Milk(new Chocolate(new Espresso()));
        System.out.println(express.calculeCost());
        System.out.println(express.getDescription());
        
        ICoffee decaf = new Chocolate(new Milk(new Decaf()));
        System.out.println(decaf.calculeCost());
        System.out.println(decaf.getDescription());

    }
}
