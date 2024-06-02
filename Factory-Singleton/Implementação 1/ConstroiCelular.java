/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.desingpatters;

/**
 *
 * @author mathe
 */
public class ConstroiCelular implements IConstroiCelular{

    private static ConstroiCelular instancia;

    public static ConstroiCelular getInstance() {
        if (instancia == null) {
            instancia = new ConstroiCelular();
        }
        return instancia;
    }

    @Override
    public Celular constroiCelular(String nome, String marca) {
        return new Celular(nome, marca);
    }

}

