package br.ufrn.imd.modelo;

import java.util.ArrayList;
import java.util.Random;

public class CaixaAtendimento {
    static int valor = 1;
    
    public void abriPedido(Cliente cliente) {
        Random aleatorio = new Random();
        Pedido pedido = new Pedido();
        pedido.setId(valor++);
        
        switch (aleatorio.nextInt(5)) {
            case 0:
                Refrigerante r1 = new Refrigerante(1, "Cola", 1);
                Sanduiche americano = new Sanduiche().getAmericano();   
                pedido.adicionarItem(r1);
                pedido.adicionarItem(americano);
                break;
            case 1:
                Refrigerante r2 = new Refrigerante(2, "Guaraná", 1);
                Sanduiche beirute = new Sanduiche().getBeirute();        
                pedido.adicionarItem(r2);
                pedido.adicionarItem(beirute);
                break;
            case 2:
                Sanduiche cachorroQuente = new Sanduiche().getCachorroQuente();
                Sanduiche mistoQuente1 = new Sanduiche().getMistoQuente();
                pedido.adicionarItem(cachorroQuente);
                pedido.adicionarItem(mistoQuente1);
                break;
            case 3:
                Refrigerante r3 = new Refrigerante(3, "Uva", 2);
                Sanduiche bauruDeCarne = new Sanduiche().getBauruDeCarne();
                Sanduiche mistoQuente2 = new Sanduiche().getMistoQuente();
                pedido.adicionarItem(bauruDeCarne);
                pedido.adicionarItem(mistoQuente2);
                break;
            default:
                Refrigerante r4 = new Refrigerante(1, "Cola", 1);
        }

//        for (Item i : pedido.getItens()) {
//            System.out.println("ID: " + i.getId() + "\tNome: " + i.getNome());
//            if (i instanceof Sanduiche) {
//                Sanduiche a = (Sanduiche) i;
//                for (Ingrediente in : a.getIngredientes()) {
//                    System.out.println("\tID: " + in.getId() + "\tNome: " + in.getNome() + "\tQuant: " + in.getQuantidae());
//                }
//            }
//        }
    }
}
