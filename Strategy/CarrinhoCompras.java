package org.example;

class CarrinhoCompras {
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;

    // Método para configurar a estratégia de pagamento
    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    // Método para configurar a estratégia de frete
    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    // Método para adicionar item ao carrinho
    public void adicionaItem(Item item) {
        // Implementação para adicionar item ao carrinho
    }

    // Método para remover item do carrinho
    public void removeItem(Item item) {
        // Implementação para remover item do carrinho
    }

    // Método para calcular o total do carrinho, incluindo o frete
    public double calculaTotal() {
        double total = 0.0;
        // Implementação para calcular o total do carrinho
        // Considerando apenas o preço dos itens para este exemplo
        return total + calcularFrete();
    }

    // Método para realizar o pagamento
    public void realizaPagamento() {
        double total = calculaTotal();
        pagamentoStrategy.pagar(total);
    }

    // Método para calcular o frete
    private double calcularFrete() {
        return freteStrategy.calcularFrete();
    }
}
