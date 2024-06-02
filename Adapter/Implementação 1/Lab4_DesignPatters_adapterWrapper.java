/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exercicio_1;

/**
 *
 * @author mathe
 */
public class Lab4_DesignPatters_adapterWrapper {

    public static void main(String[] args) {
        PatoDomestico pt = new PatoDomestico();
        IAve ptAve = new PatoAdapter(pt);

        IPavao pv = new PavaoAzul();
        IAve pvAve = new PavaoAdapter(pv);

        habilidadesDaAve(ptAve);
        habilidadesDaAve(pvAve);
    }

    public static void habilidadesDaAve(IAve ave) {
        ave.emitirSom();
        ave.voar();
    }
}
