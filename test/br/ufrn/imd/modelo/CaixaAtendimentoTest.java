/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sidemar
 */
public class CaixaAtendimentoTest {
    
    public CaixaAtendimentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abriPedido method, of class CaixaAtendimento.
     */
    @Test
    public void testAbriPedido() {
        System.out.println("abriPedido Aqui");
        Cliente cliente = null;
        CaixaAtendimento instance = new CaixaAtendimento();
        instance.abriPedido(cliente);
        
    }
    
}
