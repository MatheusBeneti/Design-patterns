package org.example;

import java.util.ArrayList;
import java.util.List;

class CET implements ISubject {

    private List<IObserver> obs;  // Inicialize a lista no construtor

    private double vento;
    private double ar;
    private double temp;

    public CET() {
        this.obs = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver obs) {
        this.obs.add(obs);
    }

    @Override
    public void removeObserver(IObserver obs) {
        this.obs.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (IObserver obs : this.obs) {
            obs.update(temp, ar, vento);  // Corrija a ordem dos parâmetros
        }
    }

    public void setData(double temp, double ar, double vento){
        this.temp = temp;
        this.ar = ar;
        this.vento = vento;
        notifyObservers();
    }

}

