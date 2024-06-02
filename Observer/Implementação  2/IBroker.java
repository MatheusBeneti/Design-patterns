package org.example;

public interface IBroker {
    void buyAcao(Acao acao);
    void sellAcao(Acao acao);
    void setPriceForBuy(double price, Acao acao);
    void setPriceForSell(double price, Acao acao);
    void showAllAcoes();
}
