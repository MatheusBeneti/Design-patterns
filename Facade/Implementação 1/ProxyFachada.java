/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.proxyfachada;

/**
 *
 * @author mathe
 */
public class Fachada1 {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.playFilm();
        System.out.println("----------------------");
        facade.EndFilm();
    }
}
