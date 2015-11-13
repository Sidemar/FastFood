/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.teste;

import br.ufrn.imd.modelo.Caixa;
import br.ufrn.imd.modelo.Cliente;

/**
 *
 * @author PROJETO HUA
 */
public class Teste {
    public static void main(String[] args) {
        Caixa ca = new Caixa();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        c1.setNome("c1");
        c2.setNome("c2");
        ca.adicionar(c1);
        for(Cliente c : ca.getFila()) {
            System.out.println(c.getNome());
        }
        System.out.println("");
        ca.adicionar(c2);
        for(Cliente c : ca.getFila()) {
            System.out.println(c.getNome());
        }
        System.out.println("");
        ca.remover();
        for(Cliente c : ca.getFila()) {
            System.out.println(c.getNome());
        }
    }
}
