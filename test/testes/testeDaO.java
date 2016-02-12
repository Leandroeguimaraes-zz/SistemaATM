/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import model.Conta;
import model.dao.ContaDAO;


/**
 *
 * @author Leandro
 */
public class testeDaO {
    public static void main(String[] args) {
         ContaDAO c = new ContaDAO();
         Conta c1 = new Conta();
         c1.setConta("1234");
         c1.setAgencia("12");
         c1.setSaldo("250");
         c1.setConta("1");
         c.salvar(c1);
    }
   
    
    
}
