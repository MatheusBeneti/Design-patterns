package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando um carrinho de compras
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionaItem(new Item("Produto 1", 50.0));
        carrinho.adicionaItem(new Item("Produto 2", 30.0));

        // Escolhendo a estratégia de pagamento (no exemplo, Pix)
        carrinho.setPagamentoStrategy(new PixPagamento());

        // Escolhendo a estratégia de frete (no exemplo, Sedex)
        carrinho.setFreteStrategy(new SedexFrete());

        // Realizando o pagamento
        carrinho.realizaPagamento();
    }
}