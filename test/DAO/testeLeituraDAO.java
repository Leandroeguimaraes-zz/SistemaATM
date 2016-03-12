/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import Model.Boleto;
import Model.Conta;
import Model.Evento;
import DAO.BoletoDAO;
import DAO.ContaDAO;
import DAO.EventoDAO;

/**
 *
 * @author Lucas Thimoteo
 */
public class testeLeituraDAO {
    public static void main(String[] args) {
        ContaDAO contaDAO= new ContaDAO();
        Conta conta = contaDAO.buscaConta("005", "0128", "293789");
        System.out.println("Conta");
        System.out.println(conta.getIdConta());
        System.out.println(conta.getUsuario().getCpf());
        
        BoletoDAO b = new BoletoDAO();
        Boleto boleto = b.buscaBoleto("12121212121212121212");
        System.out.println("");
        System.out.println("Boleto");
        System.out.println(boleto.getValor());
        System.out.println(boleto.getConta().getUsuario().getNome());
        
        EventoDAO e = new EventoDAO();
        Evento evento = e.buscaEvento("DE11111111");
        System.out.println("");
        System.out.println("Lista");
        System.out.println(evento.getValor());
        System.out.println(evento.getConta().getIdConta());
        System.out.println("");
        System.out.println("Listas");
        List<Evento> lista = e.buscaEventos(conta);
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getId());   
        }
        
        
        
        
    }
    
}
