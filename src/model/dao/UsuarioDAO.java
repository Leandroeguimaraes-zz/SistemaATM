/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import javax.swing.JOptionPane;
import model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class UsuarioDAO implements UsuarioInterfaceDAO{
    @Override
    public void salvar(Usuario usuario){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(usuario);
        trans.commit();
        s.close();
       JOptionPane.showMessageDialog(null, "Salvo");
    }
    @Override
    public void atualiza(Usuario usuario){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(usuario);
        trans.commit();
        s.close();
    }
    @Override
    public void excluir(Usuario usuario){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.delete(usuario);
        trans.commit();
        s.close();
    }
    
}
