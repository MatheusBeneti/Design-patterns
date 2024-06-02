/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.fachada2;

/**
 *
 * @author mathe
 */
public class Fachada2 {

    public static void main(String[] args) {
        Facade facade = new Facade();
        
        facade.startRace();
        System.out.println("----------");
        facade.endRace();
    }
}
