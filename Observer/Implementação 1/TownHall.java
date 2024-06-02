package org.example;

public class TownHall implements IObserver{

    @Override
    public void update(double temp, double ar, double vento) {
        System.out.println("A umidade do ar é de: " + ar);
    }
}
