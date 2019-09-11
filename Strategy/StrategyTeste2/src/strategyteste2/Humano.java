package strategyteste2;
public class Humano {
    private ModoDeComer modo;
    
    public void comer(){
        this.modo.come();
    }
    
    public void setModo(ModoDeComer modo){
       this.modo = modo;
    }
}
