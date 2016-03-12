/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Conta;
import Model.Usuario;
import org.hibernate.Query;

/**
 *
 * @author Leandro
 */
public class ContaDAO implements ContaInterfaceDAO{
    
    private Conta conta;
    
    public Conta buscaConta(String banco, String agencia,String numConta){
//        Usuario usu = new Usuario("11111111111","Lucas");
        conta=null;
        if(conta==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Conta.buscaConta");
            query.setParameter("banco", banco);
            query.setParameter("agencia", agencia);
            query.setParameter("numConta", numConta);
            if (query.list().size()>0){
                conta= (Conta) query.list().get(0);
            }
            session.close();
        }
        return conta;
    }
    
        
    public void salvar(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(conta);
        trans.commit();
        s.close();
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