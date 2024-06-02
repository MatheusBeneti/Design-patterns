package org.example;

import java.util.ArrayList;
import java.util.List;

class AcaoData {
    private String acaoName;
    private Double price;
    private double priceForSell;
    private double priceForBuy;

    public AcaoData(String name, double price) {
        this.acaoName = name;
        this.price = price;
    }

    public void setName(String name) {
        this.acaoName = name;
    }

    public String getName() {
        return this.acaoName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPriceForBuy(double price){
        this.priceForBuy = price;
    }

    public double getPriceForBuy() {
        return this.priceForBuy;
    }

    public void setPriceForSell(double price){
        this.priceForSell = price;
    }

    public double getPriceForSell(){
        return this.priceForSell;
    }
}

public class Broker implements IBroker, IObserver {

    private List<AcaoData> acoes;

    public Broker() {
        this.acoes = new ArrayList<>();
    }

    @Override
    public void buyAcao(Acao acao) {
        acao.addObserver(this);
        addAcaoDataInDataList(acao.getPrice(), acao.getName());
    }

    @Override
    public void sellAcao(Acao acao) {
        acao.removeObserver(this);
        removeAcaoDataInDataList(acao.getName());
    }

    @Override
    public void setPriceForBuy(double price, Acao acao) {
        String nomeAcao = acao.getName();
        for (AcaoData acl : this.acoes) {
            if (acl.getName().equals(nomeAcao)) {
                acl.setPriceForBuy(price);
            }
        }
    }

    private void removeAcaoDataInDataList(String name) {
        for (AcaoData acl : this.acoes) {
            if (acl.getName().equals(name)) {
                this.acoes.remove(acl);
                break;
            }
        }
    }

    @Override
    public void setPriceForSell(double price, Acao acao) {
        String nomeAcao = acao.getName();
        for (AcaoData acl : this.acoes) {
            if (acl.getName().equals(nomeAcao)) {
                acl.setPriceForSell(price);
            }
        }
    }

    public void showAllAcoes(){
        if(this.acoes.isEmpty()){
            System.out.println("--Lista de ações vazias--");
        }
        else{
            System.out.println("--Ações supervisionadas pelo Broker--");
            for (AcaoData acl : this.acoes) {
                System.out.println("Nome: "+ acl.getName() + " Preço Atual: " + acl.getPrice());
            }
        }
    }

    private void checkTargetsForSell(String name){
        for (AcaoData acl : this.acoes) {
            if (acl.getPrice() >= acl.getPriceForSell() && acl.getName().equals(name)) {
                System.out.println("Hora de vender ação: " + name);
            }
        }
    }

    private void checkTargetsForBuy(String name){
        for (AcaoData acl : this.acoes) {
            if (acl.getPrice() <= acl.getPriceForSell() && acl.getName().equals(name)) {
                System.out.println("Hora de vender ação: " + name);
            }
        }
    }

    private void addAcaoDataInDataList(double price, String name){
        boolean acaoInList = false;

        for (AcaoData acl : this.acoes) {
            if (acl.getName().equals(name)) {
                acl.setPrice(price);
                acaoInList = true;
            }
        }
        if (!acaoInList) {
            this.acoes.add(new AcaoData(name, price));
        }
    }

    @Override
    public void update(double price, String acaoName) {
        addAcaoDataInDataList(price, acaoName);
        checkTargetsForSell(acaoName);
        checkTargetsForBuy(acaoName);
    }
}
