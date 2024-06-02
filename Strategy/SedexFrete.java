package org.example;

class SedexFrete implements FreteStrategy {
    @Override
    public double calcularFrete() {
        return 20.0; // Valor fixo para o Sedex neste exemplo
    }
}
