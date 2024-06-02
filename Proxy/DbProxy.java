/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.proxy;

/**
 *
 * @author mathe
 */
public class DbProxy implements InterfaceDb{

    private final InterfaceDb db;
  
    public DbProxy(InterfaceDb db){
        this.db = db;
    }

    @Override
    public void getDocument() {
        validateRequest();
        db.getDocument();
    }
    
    public void validateRequest(){
        System.out.println("Validando requisição");
    }
     
}
