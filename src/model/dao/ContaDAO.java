/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Conta;
import model.Usuario;
import org.hibernate.Query;

/**
 *
 * @author Leandro
 */
public class ContaDAO implements ContaInterfaceDAO{
    
    private Conta conta;
    
    public Conta getConta(String banco, String agencia,String numConta){
        if(conta==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Usuario.buscaUsuario");
            query.setParameter("banco", banco);
            query.setParameter("agencia", agencia);
            query.setParameter("numConta", numConta);
            conta= (Conta) query.list().get(0);
            session.close();
        }
        return conta;
    }
    
    @Override
    public void atualiza(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(conta);
        trans.commit();
        s.close();
    }
    

}