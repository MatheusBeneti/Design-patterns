package org.example;

class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double total) {
        System.out.println("Pagamento via Boleto Bancário no valor de R$" + total + " realizado com sucesso.");
    }
}
