package factory;

public class PizzaFactory {
    public Pizza criaPizza(String sabor){
        //Ignorecase - ignora maiusculas/minusculas
        if(sabor.equalsIgnoreCase("Calabresa")){
            return new Calabresa();
        }
        
        else if(sabor.equalsIgnoreCase("Moda")){
            return new Moda();
        }
        return new SaborInexistente();
    }
}
