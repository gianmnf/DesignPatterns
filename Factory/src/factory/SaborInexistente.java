/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author gianmnf
 */
public class SaborInexistente implements Pizza{

    @Override
    public void sabor() {
        System.out.println("Desculpe, sabor inexistente.");
    }
    
}
