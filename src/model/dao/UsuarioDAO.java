/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import model.Conta;
import model.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class UsuarioDAO{
    
   
    public Usuario getUsuario(String cpf){
        Usuario usuario = new Usuario(cpf,"Lucas");
//        if(usuario==null){
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            Query query = session.getNamedQuery("Usuario.buscaUsuario");
//            query.setParameter("numConta", cpf);
//            usuario= (Usuario) query.list().get(0);
//            session.close();
//        }
        return usuario;
    }
    
}
