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
public class UsuarioDAO implements UsuarioInterfaceDAO{
    
    private List<Usuario> usuarios;
    private Usuario usuario;
    
    @Override
    public Usuario getBuscaUsuario(String agencia,String numConta, String senha){
        if(usuario==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Usuario.buscaUsuario");
            query.setParameter("numConta", numConta);
            query.setParameter("senha", senha);
            query.setParameter("agencia", agencia);
            usuario= (Usuario) query.list().get(0);
            session.close();
        }
        return usuario;
    }
    @Override
    public void setBuscaUsuario(){
        this.usuario=usuario;
    }
    
    
    @Override
    public List<Usuario> getUsuarios(){
        if(usuarios == null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Usuario.listaUsuarios");
            usuarios= query.list();
            session.close();
          
        }
        return usuarios;
    }

    @Override
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
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
