package strategyteste2;
public class StrategyTeste2 {
    public static void main(String[] args) {
        Humano humano = new Humano();
        ModoDeComer hashi = new Hashi();
        ModoDeComer garfo = new Garfo();
        humano.setModo(garfo);
        humano.comer();
        humano.setModo(hashi);
        humano.comer();
    }
    
}
