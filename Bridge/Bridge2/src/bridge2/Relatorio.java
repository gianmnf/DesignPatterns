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
public abstract class Relatorio {
    
    public ModoDeFinalizacao modo;
    
    public void buscar(){
        System.out.println("Buscando...");
    }
    
    public void setModo(ModoDeFinalizacao modo){
        this.modo = modo;
    }
    
    protected abstract void exportar();
    
    protected void finalizar(){
        this.modo.finaliza();
    }
    
    public void gerar(){
     buscar();
     exportar();
     finalizar();        
    }
    
}
