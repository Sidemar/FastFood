package br.ufrn.imd.modelo;

/**
 *
 * @author Sidemar
 */
public class Simulador {
    
    public void iniciar() {
        // Criação de uma loja
        Loja loja = new Loja();
        
        // 3 Caixas para atendimento 
        Caixa caixaAtendimento1 = new Caixa();
        Caixa caixaAtendimento2 = new Caixa();
        Caixa caixaAtendimento3 = new Caixa();
        
        // Caixas adicionados na loja
        loja.adicionarCaixa(caixaAtendimento1);
        loja.adicionarCaixa(caixaAtendimento2);
        loja.adicionarCaixa(caixaAtendimento3);
        
        // 1 Caixa para atendimento
        Caixa caixaPagamento1 = new Caixa();
        
        // Simulando a chegada de 5 clientes
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente();
        Cliente cliente4 = new Cliente();
        Cliente cliente5 = new Cliente();
        
        // Clientes colocados nos caixas de atendimento
        // Deve ser aleatório
        // Devem ser criadas 3 Theads dos caixas para receber os cliente, isso 
        // porque os clientes podem chegar simultaneamente
        //caixaAtendimento1.adicionar(cliente1);
        //caixaAtendimento1.adicionar(cliente2);
        //caixaAtendimento2.adicionar(cliente3);
        //caixaAtendimento2.adicionar(cliente4);
        //caixaAtendimento3.adicionar(cliente5);
    }
}
