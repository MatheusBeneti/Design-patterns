package org.example;

class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagar(double total) {
        System.out.println("Pagamento via Pix no valor de R$" + total + " realizado com sucesso.");
    }
}
