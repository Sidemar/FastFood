package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 *
 * @author Sidemar
 */
public class Estoque {
    ArrayList<Refrigerante> refrigerantes;
    ArrayList<Ingrediente> ingredientes;

    public Estoque() {
        this.refrigerantes = new ArrayList<>();
        
        // Inicialização especificada
        Refrigerante refrigerante1 = new Refrigerante(1, "Cola");
        Refrigerante refrigerante2 = new Refrigerante(2, "Guaraná");
        Refrigerante refrigerante3 = new Refrigerante(3, "Uva");
        
        // Tipo 1 - Americano: pão, presunto, queijo, ovo, alface, tomate e maionese. 
        Ingrediente ingrediente1 = new Ingrediente(1, "Presunto", 10);
        Ingrediente ingrediente2 = new Ingrediente(2, "Queijo", 10);
        Ingrediente ingrediente3 = new Ingrediente(3, "Ovo", 10);
        Ingrediente ingrediente4 = new Ingrediente(4, "Alface", 10);
        Ingrediente ingrediente5 = new Ingrediente(5, "Tomate", 10);
        Ingrediente ingrediente6 = new Ingrediente(6, "Maionese", 10);
        Ingrediente ingrediente7 = new Ingrediente(7, "Pão", 10);
        
        //Tipo 2 - Beirute: pão, rosbife, queijo, alface, tomate e ovo frito
        Ingrediente ingrediente8 = new Ingrediente(8, "Rosbife", 10);
        
        //Tipo 3 - Cachorro quente: pão, salsicha, maionese, ketchup, frango e batata palha
        Ingrediente ingrediente9 = new Ingrediente(9, "Salsicha", 10);
        Ingrediente ingrediente10 = new Ingrediente(10, "Ketchup", 10);
        Ingrediente ingrediente11 = new Ingrediente(11, "Frango", 10);
        Ingrediente ingrediente12 = new Ingrediente(12, "Batata palha", 10);
        
        //Tipo 4 - Misto-quente: pão, queijo, presunto
        
        //Tipo 5 - Bauru de carne: pão, carne, queijo, tomate e molho de pimenta
        Ingrediente ingrediente13 = new Ingrediente(13, "Carne", 10);
        Ingrediente ingrediente14 = new Ingrediente(14, "Molho de pimenta", 10);
        
    }
    
}
