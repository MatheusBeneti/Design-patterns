package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CET cet = new CET();
        cet.addObserver(new Airport());
        cet.addObserver(new TownHall());
        cet.setData(24, 45, 33);
    }
}