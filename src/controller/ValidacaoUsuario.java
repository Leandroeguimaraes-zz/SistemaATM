/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Conta;
import model.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Leandro
 */
public class ValidacaoUsuario {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<Usuario> usuarios = new ArrayList<>();;
    
    public boolean validaLogin(String numConta, String senha){
        usuarios = usuarioDAO.getUsuarios();
        for(Usuario user :usuarios)
            if((user.getConta().getConta().equals(numConta) && user.getSenha().equals(senha)))
                return true; 
        return false;
    }
    
}
