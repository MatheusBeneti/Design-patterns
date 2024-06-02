package exe1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mathe
 */
public class MassaFinaPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Massa fina";
    }

    @Override
    public float calculeCost() {
        return 30;
    }
    
}
