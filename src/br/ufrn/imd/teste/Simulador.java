package br.ufrn.imd.teste;

import br.ufrn.imd.modelo.CaixaAtendimento;
import br.ufrn.imd.modelo.CaixaPagamento;
import br.ufrn.imd.modelo.Cliente;
import br.ufrn.imd.modelo.Loja;
import java.util.Random;

public class Simulador {
    
    public void iniciar() {
        // Criação de uma loja
        Loja loja = new Loja();
        
        // 3 Caixas para atendimento 
        CaixaAtendimento caixaAtendimento1 = new CaixaAtendimento();
        CaixaAtendimento caixaAtendimento2 = new CaixaAtendimento();
        CaixaAtendimento caixaAtendimento3 = new CaixaAtendimento();
        
        // Caixas adicionados na loja
        loja.adicionarCaixa(caixaAtendimento1);
        loja.adicionarCaixa(caixaAtendimento2);
        loja.adicionarCaixa(caixaAtendimento3);
        
        // 1 Caixa para pagamento
        CaixaPagamento caixaPagamento1 = new CaixaPagamento();
        
        // Simulando a chegada de 5 clientes
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();
        
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);
        loja.adicionarCliente(cliente3);
        loja.adicionarCliente(cliente4);
        loja.adicionarCliente(cliente5);
        
        // Adicionando os clientes aos caixas aleatoriamente
        final int NUM_CLIENTES = loja.getFila().size();
        for (int i = 0; i < NUM_CLIENTES; i++) {
            loja.atender();
        }
    }
    
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        simulador.iniciar();
    }
}
