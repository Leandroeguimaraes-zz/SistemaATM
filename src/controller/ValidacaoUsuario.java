/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Conta;
import model.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Leandro
 */
public class ValidacaoUsuario {
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    List<Usuario> usuarios = new ArrayList<>();
    Usuario usuario;
    
//    public boolean validaLogin(String numConta, String senha){
//        usuarios = usuarioDAO.getUsuarios();
//        for(Usuario user :usuarios)
//            if((user.getConta().getNumConta().equals(numConta) && user.getSenha().equals(senha)))
//                return true; 
//        return false;
//    }
    public boolean validaLogin(String agencia,String numConta, String senha){
        usuario = usuarioDAO.getBuscaUsuario(agencia,numConta,senha);
        if(usuario!=null){
            JOptionPane.showMessageDialog(null, "Validado");
            return true;
        }
       
        return false;
    }

    public UsuarioDAO getUsuarioDAO() {
        return usuarioDAO;
    }

    public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
