/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Exercicio_1;

/**
 *
 * @author mathe
 */
public class PatoAdapter implements IAve{
    
    PatoDomestico pato;
    
    public PatoAdapter(PatoDomestico pato){
        this.pato = pato;
    }
    
    
    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}
