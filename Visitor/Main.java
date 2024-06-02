package org.example;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias dos veículos
        Carro carro = new Carro("Azul", "Toyota", "Corolla");
        Onibus onibus = new Onibus(40, 2018);
        Bicicleta bicicleta = new Bicicleta("Vermelha");

        // Usando o Visitor para imprimir dados dos veículos
        VeiculoInfoVisitor infoVisitor = new VeiculoInfoVisitor();
        carro.accept(infoVisitor);
        onibus.accept(infoVisitor);
        bicicleta.accept(infoVisitor);

        // Usando o Visitor para enviar mensagens aos donos dos veículos
        MensagemVisitor mensagemVisitor = new MensagemVisitor();
        carro.accept(mensagemVisitor);
        onibus.accept(mensagemVisitor);
        bicicleta.accept(mensagemVisitor);
    }
}