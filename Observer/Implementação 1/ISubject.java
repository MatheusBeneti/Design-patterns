package org.example;

public interface ISubject {
    void addObserver(IObserver obs);
    void removeObserver(IObserver obs);
    void notifyObservers();
}
