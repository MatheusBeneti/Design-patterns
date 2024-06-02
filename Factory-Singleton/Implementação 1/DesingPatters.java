/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.desingpatters;

/**
 *
 * @author mathe
 */
public class DesingPatters {

    public static void main(String[] args) {
        ConstroiCelular factory = ConstroiCelular.getInstance();
        Celular iphone = factory.constroiCelular("Iphone", "apple");
        Celular galaxy = factory.constroiCelular("galaxy", "samsung");
        iphone.fazLigacao();
        System.out.println(iphone.getNome());
        galaxy.fazLigacao();
    }
}
