/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.trabalho1ex2_poo_matheusbeneti;

/**
 *
 * @author mathe
 */
public class ToyotaFactory implements IVehicleMaker{
    
    private static ToyotaFactory instance;
    
    public static ToyotaFactory getInstance(){
        if(instance == null){
            instance = new ToyotaFactory();
        }
        return instance;
    }
    
    @Override
    public Vehicle makeVehicle(String name) {
        return new Vehicle(name);
    }
    
}
