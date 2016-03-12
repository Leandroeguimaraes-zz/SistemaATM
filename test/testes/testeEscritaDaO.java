/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Date;
import model.Conta;
import model.Usuario;
import model.Boleto;
import model.Evento;
import model.dao.BoletoDAO;
import model.dao.ContaDAO;
import model.dao.EventoDAO;

/**
 *
 * @author Leandro
 */
public class testeEscritaDaO {
    public static void main(String[] args) {
         ContaDAO c = new ContaDAO();
         Conta c1 = new Conta();
         Conta c2 = new Conta();
         Conta c3 = new Conta();

         Usuario u1 = new Usuario();
         u1.setCpf("14845272750");
         u1.setNome("Lucas");
         c1.setIdConta(1);
         c1.setBanco("005");
         c1.setNumConta("313635");
         c1.setAgencia("0059");
         c1.setSaldo(100.00);
         c1.setSenha("111111");
         c1.setUsuario(u1);
         
         Usuario u2 = new Usuario();
         u2.setCpf("32482647539");
         u2.setNome("Daniel");
         c2.setIdConta(2);
         c2.setBanco("005");
         c2.setNumConta("293789");
         c2.setAgencia("0128");
         c2.setSaldo(100.00);
         c2.setSenha("222222");
         c2.setUsuario(u2);
         
         Usuario u3 = new Usuario();
         u3.setCpf("11111111111");
         u3.setNome("Leandro");
         c3.setIdConta(3);
         c3.setBanco("005");
         c3.setNumConta("111111");
         c3.setAgencia("1111");
         c3.setSaldo(500.00);
         c3.setSenha("111111");
         c3.setUsuario(u3);
         
         if (c.buscaConta(c1.getBanco(), c1.getAgencia(), c1.getNumConta())==null){
             c.salvar(c1);
         }else{
             System.out.println("c1 ja inserido");
         }
         if (c.buscaConta(c2.getBanco(), c2.getAgencia(), c2.getNumConta())==null){
             c.salvar(c2);
         } else{
             System.out.println("c2 ja inserido");
         } 
         if (c.buscaConta(c3.getBanco(), c3.getAgencia(), c3.getNumConta())==null){
             c.salvar(c3);
         } else{
             System.out.println("c3 ja inserido");
         } 
         
         BoletoDAO b = new BoletoDAO();
         Boleto b1 = new Boleto();
         b1.setCodigo("12121212121212121212");
         b1.setConta(c2);
         b1.setValor(200);
         b1.setDataVencimento(new Date());
         
         if (b.buscaBoleto(b1.getCodigo())==null){
            b.salvar(b1);
         }else{
             System.out.println("b1 ja inserido");
         }
         
         EventoDAO e = new EventoDAO();
         
         Evento e1 = new Evento();
         e1.setId("SA11111111");
         e1.setData(new Date());
         e1.setValor(10);
         e1.setConta(c1);
         
         Evento e2 = new Evento();
         e2.setId("DE11111111");
         e2.setData(new Date());
         e2.setValor(10);
         e2.setConta(c1);
         
         Evento e3 = new Evento();
         e3.setId("TR11111111");
         e3.setData(new Date());
         e3.setValor(10);
         e3.setConta(c1);
         e3.setContaDestino(c2);
         
         Evento e4 = new Evento();
         e4.setId("TR22222222");
         e4.setData(new Date());
         e4.setValor(10);
         e4.setConta(c2);
         e4.setContaDestino(c1);
         
         if (e.buscaEvento(e1.getId())==null){
            e.salvar(e1);
         }else{
             System.out.println("evento ja inserido");
         }
         
         if (e.buscaEvento(e2.getId())==null){
            e.salvar(e2);
         }else{
             System.out.println("evento ja inserido");
         }
         
         if (e.buscaEvento(e3.getId())==null){
            e.salvar(e3);
         }else{
             System.out.println("evento ja inserido");
         }
         
         if (e.buscaEvento(e4.getId())==null){
            e.salvar(e4);
         }else{
             System.out.println("evento ja inserido");
         }
         
    }
   
    
    
}