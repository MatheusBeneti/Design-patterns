/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.proxy;

/**
 *
 * @author mathe
 */
public class Proxy {

    public static void main(String[] args) {
        
        // O padrão proxy irá servir para validar de alguma forma a requisição antes de retornar o documento de um banco
        
        // Esse é o banco
        Db db = new Db();
        
        // O proxy que recebe um objeto com mesma interface
        DbProxy proxy = new DbProxy(db);
        
        // Método do proxy que retorna o documento
        proxy.getDocument();
        
        // Note na saída que primeiro é chamado o método de validação da proxy e somente depois é chamado o método do banco
    }
}
