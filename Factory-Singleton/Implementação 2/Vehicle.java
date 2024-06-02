/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.trabalho1ex2_poo_matheusbeneti;

/**
 *
 * @author mathe
 */
public class Vehicle implements IVehicle {
    
    private String name;
   
    public Vehicle(String name){
        this.name = name;
    }
    
    @Override
    public void start() {
        System.out.println("O veículo " + this.name + " está LIGADO");
    }


    @Override
    public void stop() {
        System.out.println("O veículo " + this.name + " está PARADO");
    }

    @Override
    public void drive() {
        System.out.println("O veículo " + this.name + " está ANDANDO");

    }
    
}
