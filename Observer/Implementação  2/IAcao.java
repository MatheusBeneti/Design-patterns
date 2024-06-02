package org.example;

public interface IAcao {
    void setPrice(double price);
    void addInvestor(IInvestor investor);
    double getPrice();
    String getName();
}
