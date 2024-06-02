package org.example;

import java.util.ArrayList;
import java.util.List;

public class Acao implements ISubject, IAcao {
    private final String name;
    private final List<IObserver> observers;
    private IBroker broker;
    private double price;

    public Acao(String name) {
        this.observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addObserver(IObserver obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(IObserver obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (IObserver obs : observers){
            obs.update(price, this.name);
        }
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void addInvestor(IInvestor investor){

    }
}
