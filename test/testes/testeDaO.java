/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import model.Conta;
import model.Usuario;
import model.dao.ContaDAO;
import model.dao.UsuarioDAO;


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
         c1.setSaldo(100);
         
         c2.setNumConta("1002");
         c2.setAgencia("12");
         c2.setSaldo(950);
         
         c3.setNumConta("1003");
         c3.setAgencia("13");
         c3.setSaldo(950);
         
         c4.setNumConta("1004");
         c4.setAgencia("14");
         c4.setSaldo(950);
         
         
         
         c.salvar(c1);
         c.salvar(c2);
         c.salvar(c3);
         c.salvar(c4);
         UsuarioDAO user = new UsuarioDAO();
         
         Usuario leandro = new Usuario();
         Usuario guzman = new Usuario();
         Usuario lucas = new Usuario();
         Usuario victor = new Usuario();
         
         
         leandro.setNome("Leandro");
         leandro.setSenha("1231");
         leandro.setConta(c1);
         
         guzman.setNome("Guzman");
         guzman.setSenha("1232");
         guzman.setConta(c2);
         
         lucas.setNome("Lucas");
         lucas.setSenha("1233");
         lucas.setConta(c3);
         
         victor.setNome("Victor");
         victor.setSenha("1234");
         victor.setConta(c4);
         
         user.salvar(leandro);
         user.salvar(guzman);
         user.salvar(lucas);
         user.salvar(victor);
    }
   
    
    
}
