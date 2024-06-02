/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.desingpatters;

/**
 *
 * @author mathe
 */
public class Celular implements ICelular {
    
    private String nome;
    private String marca;
    
    public Celular(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public void fazLigacao() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void tirarFoto() {
        System.out.println("Tirando foto");
    }
}
