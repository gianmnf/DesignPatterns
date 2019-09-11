/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge2;
import finalizadores.*;

/**
 *
 * @author gianv
 */
public class Bridge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relatorio r = new PDF();
        r.setModo(new ZIP());
        r.gerar();
    }
    
}
