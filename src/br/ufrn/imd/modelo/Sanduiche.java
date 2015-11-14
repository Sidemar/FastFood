package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Sanduiche extends Item{
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    /**
     * @return the ingredientes
     */
    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public Sanduiche getAmericano() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setId(1);
        sanduiche.setNome("Americano");
        sanduiche.getIngredientes().add(new Ingrediente(1, "Presunto", 1));
        sanduiche.getIngredientes().add(new Ingrediente(2, "Queijo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(3, "Ovo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(4, "Alface", 1));
        sanduiche.getIngredientes().add(new Ingrediente(5, "Tomate", 1));
        sanduiche.getIngredientes().add(new Ingrediente(6, "Maionese", 1));
        sanduiche.getIngredientes().add(new Ingrediente(7, "Pão", 2));
                
        return sanduiche;
    }
    
    public Sanduiche getBeirute() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setId(2);
        sanduiche.setNome("Beirute");
        
        sanduiche.getIngredientes().add(new Ingrediente(2, "Queijo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(3, "Ovo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(4, "Alface", 1));
        sanduiche.getIngredientes().add(new Ingrediente(5, "Tomate", 1));
        sanduiche.getIngredientes().add(new Ingrediente(7, "Pão", 2));
        sanduiche.getIngredientes().add(new Ingrediente(8, "Rosbife", 1));
                
        return sanduiche;
    }
    
    public Sanduiche getCachorroQuente() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setId(3);
        sanduiche.setNome("Cachorro quente");
        
        sanduiche.getIngredientes().add(new Ingrediente(6, "Maionese", 1));
        sanduiche.getIngredientes().add(new Ingrediente(7, "Pão", 2));
        sanduiche.getIngredientes().add(new Ingrediente(9, "Salsicha", 1));
        sanduiche.getIngredientes().add(new Ingrediente(10, "Ketchup", 1));
        sanduiche.getIngredientes().add(new Ingrediente(10, "Ketchup", 1));
        sanduiche.getIngredientes().add(new Ingrediente(12, "Batata palha", 1));
                
        return sanduiche;
    }
    
    public Sanduiche getMistoQuente() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setId(4);
        sanduiche.setNome("Misto-quente");
        
        sanduiche.getIngredientes().add(new Ingrediente(1, "Presunto", 1));
        sanduiche.getIngredientes().add(new Ingrediente(2, "Queijo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(7, "Pão", 2));
                
        return sanduiche;
    }
    
    public Sanduiche getBauruDeCarne() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setId(5);
        sanduiche.setNome("Bauru de carne");
        
        sanduiche.getIngredientes().add(new Ingrediente(2, "Queijo", 1));
        sanduiche.getIngredientes().add(new Ingrediente(5, "Tomate", 1));
        sanduiche.getIngredientes().add(new Ingrediente(7, "Pão", 2));
        sanduiche.getIngredientes().add(new Ingrediente(13, "Carne", 1));
        sanduiche.getIngredientes().add(new Ingrediente(14, "Molho de pimenta", 1));
                
        return sanduiche;
    }
}
