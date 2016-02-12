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
         c1.setNumConta("123");
         c1.setAgencia("12");
         c1.setSaldo("950");
         
         c.salvar(c1);
         UsuarioDAO user = new UsuarioDAO();
         
         Usuario leandro = new Usuario();
         Usuario guzman = new Usuario();
         Usuario lucas = new Usuario();
         Usuario victor = new Usuario();
         
         
         leandro.setNome("Leandro");
         leandro.setSenha("123");
         leandro.setConta(c1);
         
         guzman.setNome("Guzman");
         guzman.setSenha("123");
         guzman.setConta(c1);
         
         lucas.setNome("Lucas");
         lucas.setSenha("123");
         lucas.setConta(c1);
         
         victor.setNome("Victor");
         victor.setSenha("123");
         victor.setConta(c1);
         
         user.salvar(leandro);
//         user.salvar(guzman);
//         user.salvar(lucas);
//         user.salvar(victor);
    }
   
    
    
}
