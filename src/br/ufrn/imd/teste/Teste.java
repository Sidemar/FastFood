package br.ufrn.imd.teste;

import br.ufrn.imd.modelo.CaixaAtendimento;
import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Loja;

public class Teste {
    public static void main(String[] args) {
//        CaixaAtendimento ca = new CaixaAtendimento();
//        Loja loja = new Loja();
//        Cliente c1 = new Cliente("c1");
//        Cliente c2 = new Cliente("c2");
//        loja.adicionarCliente(c1);
//        for(Cliente c : loja.getFila()) {
//            System.out.println(c.getNome());
//        }
//        System.out.println("");
//        loja.adicionarCliente(c2);
//        for(Cliente c : loja.getFila()) {
//            System.out.println(c.getNome());
//        }
//        System.out.println("");
//        //lo.remover();
//        //for(Cliente c : lo.getFila()) {
//        //    System.out.println(c.getNome());
//        //}
//        System.out.println(loja.getFila().peek().getNome());
//        System.out.println("");
//        for(Cliente c : loja.getFila()) {
//            System.out.println(c.getNome());
//        }
        
        CaixaAtendimento atendimento = new CaixaAtendimento();
        atendimento.abriPedido(null);
    }
}
