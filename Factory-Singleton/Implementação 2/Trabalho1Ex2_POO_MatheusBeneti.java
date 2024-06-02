/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.trabalho1ex2_poo_matheusbeneti;

/**
 *
 * @author mathe
 */
public class Trabalho1Ex2_POO_MatheusBeneti {

    public static void main(String[] args) {
        
        //Toyota e Honda são as duas classes que aplicam o singletom, cada empresa pode ter uma fábrica apenas.
        ToyotaFactory tFactory = ToyotaFactory.getInstance();
        HondaFactory hFactory = HondaFactory.getInstance();
        
        //Factory recebe o nome do modelo e retorna um objeto da classe Vehicle
        Vehicle hilux = tFactory.makeVehicle("hilux");
        Vehicle civic = hFactory.makeVehicle("Civic");
        
        hilux.start();
        hilux.drive();
        hilux.stop();
        
        civic.start();
        civic.drive();
        civic.stop();
    }
}
