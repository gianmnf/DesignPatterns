package relatorio;
public abstract class Relatorio {
    private void buscar(){
        System.out.println("buscando...");   
    }
    private void calcular(){
        System.out.println("calculando...");   
    }
    protected abstract void salvar();
    
    public void exportar(){
        buscar();
        calcular();
        salvar();
    }
}
