/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_1;

/**
 *
 * @author mathe
 */
public class PavaoAdapter implements IAve{
    
    IPavao pavao;
    
    public PavaoAdapter(IPavao pavao) {
        this.pavao = pavao;
    }


    @Override
    public void emitirSom() {
        this.pavao.cantar();
    }

    @Override
    public void voar() {
        System.out.println("Pavão não voa...");
    }
    
    
    
}
