package org.example;

public class Main {

    /*
    O padrão Template Method define o esqueleto de um algoritmo em uma classe base, permitindo
    que subclasses alterem certas etapas do algoritmo sem modificar sua estrutura. Ele fornece um
    modelo para um algoritmo e permite que subclasses redefinam partes específicas desse algoritmo
    sem alterar sua estrutura geral. É utilizado para definir as partes invariantes de um
    algoritmo e permitir que subclasses implementem as partes variantes. Já o padrão Decorator
    permite adicionar comportamentos a objetos individuais de forma dinâmica, sem afetar o comportamento
    de outros objetos da mesma classe. É usado quando você precisa adicionar nova funcionalidade a um objeto
    sem alterar sua estrutura. Envolve a criação de um conjunto de classes de decoradores que são usadas para
    envolver componentes concretos.
    */

    public static void main(String[] args) {
        OnlineOrder onlineOrder = new OnlineOrder();
        System.out.println("Online Order:");
        System.out.println(onlineOrder.processOrder(3, 50, "online"));
        System.out.println(onlineOrder.processOrder(2, 30, "cryptocurrency"));

        InStoreOrder inStoreOrder = new InStoreOrder();
        System.out.println("\nIn-Store Order:");
        System.out.println(inStoreOrder.processOrder(4, 25, "in store"));
    }
}