package org.example;

class FreteNormal implements FreteStrategy {
    @Override
    public double calcularFrete() {
        return 10.0; // Valor fixo para o frete normal neste exemplo
    }
}
