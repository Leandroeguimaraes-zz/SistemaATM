/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Conta;
import model.Usuario;
import model.dao.ContaDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Leandro
 */
public class ValidacaoUsuario {
    ContaDAO contaDAO = new ContaDAO();
    Conta conta;
    

    public boolean validaLogin(String agencia,String conta, String senha){
        this.conta = new ContaDAO().getConta("005", agencia, conta);
        if (conta==null){
            return false;
        }else{
            if (this.conta.getSenha().equals(senha)){
                return true;
            }
        }
        return false;       
    }

    public Conta getConta() {
        return conta;
    }
}
