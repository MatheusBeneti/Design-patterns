package org.example;

class MensagemVisitor implements VeiculoVisitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Enviando mensagem para o dono do Carro: Favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Enviando mensagem para o dono do Ônibus: Atenção para atualização das licenças");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Enviando mensagem para o dono da Bicicleta: Comemore no parque o dia do ciclismo");
    }
}
