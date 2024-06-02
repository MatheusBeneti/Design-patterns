/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe1;

/**
 *
 * @author mathe
 */
public class MassaGrossaPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Massa grossa";
    }

    @Override
    public float calculeCost() {
        return 40;
    }
    
}
