package factory;

public class Factory {
    
    public static void main(String[] args) throws SaborNaoExistenteException{
       PizzaFactory pizzaFactory = new PizzaFactory();
       Pizza p;
       p = pizzaFactory.criaPizza("Calabreca");
       p.sabor();
       
    }
    
}
