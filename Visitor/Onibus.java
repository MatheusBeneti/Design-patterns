package org.example;

class Onibus implements VeiculoVisitable {
    private int quantidadeLugares;
    private int anoFabricacao;

    public Onibus(int quantidadeLugares, int anoFabricacao) {
        this.quantidadeLugares = quantidadeLugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
