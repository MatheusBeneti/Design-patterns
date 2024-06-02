package org.example;

public class Airport implements IObserver{

    @Override
    public void update(double temp, double ar, double vento) {
        System.out.println("A velocidade do vento é de: " + vento);
    }
}
