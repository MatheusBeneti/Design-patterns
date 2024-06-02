package org.example;

class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double total) {
        System.out.println("Pagamento via Cartão de Crédito no valor de R$" + total + " realizado com sucesso.");
    }
}