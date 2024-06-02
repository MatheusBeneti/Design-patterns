/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proxyfachada;

/**
 *
 * @author mathe
 */
public class Facade {
    
    private BigScreen bigScreen;
    private PopcornMachine popcornMachine;
    private Projector projector;
    private StreamingPlayer streamingPlayer;
    private Amplifier amplifier;
    private Lights lights;
    
    public Facade(){
        this.bigScreen = new BigScreen();
        this.popcornMachine = new PopcornMachine();
        this.projector = new Projector();
        this.amplifier = new Amplifier();
        this.streamingPlayer = new StreamingPlayer();
        this.lights = new Lights();
    }
    
    public void playFilm(){
        this.popcornMachine.turnOn();
        this.popcornMachine.MakesPopcorn();
        this.lights.turnOff();
        this.bigScreen.lower();
        this.projector.turnOn();
        this.amplifier.turnOn();
        this.amplifier.volume();
        this.streamingPlayer.play();
    }
    public void EndFilm(){
        this.popcornMachine.turnOff();
        this.lights.turnOn();
        this.bigScreen.climb();
        this.projector.turnOff();
        this.amplifier.turnOff();
        this.streamingPlayer.turnOff();
    }
    
}
