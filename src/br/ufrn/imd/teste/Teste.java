/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.teste;

import br.ufrn.imd.modelo.Caixa;
import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Loja;

/**
 *
 * @author PROJETO HUA
 */
public class Teste {
    public static void main(String[] args) {
        Caixa ca = new Caixa();
        Loja lo = new Loja();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        c1.setNome("c1");
        c2.setNome("c2");
        lo.adicionar(c1);
        for(Cliente c : lo.getFila()) {
            System.out.println(c.getNome());
        }
        System.out.println("");
        lo.adicionar(c2);
        for(Cliente c : lo.getFila()) {
            System.out.println(c.getNome());
        }
        System.out.println("");
        //lo.remover();
        //for(Cliente c : lo.getFila()) {
        //    System.out.println(c.getNome());
        //}
        System.out.println(lo.getFila().peek().getNome());
        System.out.println("");
        for(Cliente c : lo.getFila()) {
            System.out.println(c.getNome());
        }
    }
}
