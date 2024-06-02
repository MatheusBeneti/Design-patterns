package org.example;

public class Main {
    public static void main(String[] args) {

        // Declaração de duas Ações
        Acao ac = new Acao("PETR4");
        Acao ac2 = new Acao("TAESA");

        Broker broker = new Broker();

        // Adicionando um broker para observar essas ações
        ac2.addObserver(broker);
        ac.addObserver(broker);

        // Broker irá observar as ações atribuido a um investidor
        Investor inv = new Investor("Matheus", broker);

        // Adicionado um preço para vender e comprar as ações, esse valores serão usados pelos broker dentro da classe investidor
        inv.setPriceForSell(100, ac);
        inv.setPriceForBuy(50, ac2);

        // Preço das ações alterados. O broker que já possui as informações de compra e venda de cada ação, irá notificar o investidor quando o preço estiver proximo
        ac.setPrice(101);
        ac2.setPrice(49);

        // Mostra toda as ações que o broker tem em sua base de dados
        inv.showAllAcoes();
    }
}