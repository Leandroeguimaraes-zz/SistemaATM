/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import model.Conta;
import model.Usuario;
import model.dao.ContaDAO;



/**
 *
 * @author Leandro
 */
public class testeDaO {
    public static void main(String[] args) {
         ContaDAO c = new ContaDAO();
         Conta c1 = new Conta();
         Conta c2 = new Conta();
         Conta c3 = new Conta();
         Conta c4 = new Conta();
         c1.setNumConta("1001");
         c1.setAgencia("11");
         c1.setSaldo(100.00);
         
         c2.setNumConta("1002");
         c2.setAgencia("12");
         c2.setSaldo(950.00);
         
         c3.setNumConta("1003");
         c3.setAgencia("13");
         c3.setSaldo(950.00);
         
         c4.setNumConta("1004");
         c4.setAgencia("14");
         c4.setSaldo(950.00);
         
         

         
         Usuario leandro = new Usuario();
         Usuario guzman = new Usuario();
         Usuario lucas = new Usuario();
         Usuario victor = new Usuario();
         
         
         lucas.setCpf("14845272750");
         lucas.setNome("Lucas Thimoteo");
         
         leandro.setCpf("73527462942");
         leandro.setNome("Leandro Guima");
         
         guzman.setCpf("2756402873");
         guzman.setNome("Daniel Guzman");
         
         victor.setCpf("03193602348");
         victor.setNome("Victor marques");

    }
   
    
    
}
