/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalizadores;

/**
 *
 * @author gianv
 */
public class Crypt implements ModoDeFinalizacao{
    @Override
    public void finaliza(){
        System.out.println("Encriptando...");   
    }
}
