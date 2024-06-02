/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.fachada2;

/**
 *
 * @author mathe
 */
public class Facade {
    private Engine engine; 
    private Belt belt;
    private Door door;
    private CarHeadLight headLight;
    private Radio radio;
    
    public Facade() { // Corrigido: Construtor real
        this.engine = new Engine();
        this.belt = new Belt();
        this.door = new Door();
        this.headLight = new CarHeadLight();
        this.radio = new Radio();
    }
    
    public void startRace(){
        this.engine.turnOn();
        this.belt.putOn();
        this.door.close();
        this.headLight.turnOn();
        this.radio.turnOn();
    }
    
    public void endRace(){
        this.engine.turnOff();
        this.door.open();
        this.belt.remove();
        this.headLight.turnOff();
        this.radio.turnOff();
    }
}
