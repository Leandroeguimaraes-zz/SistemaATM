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
import org.hibernate.Query;

/**
 *
 * @author Leandro
 */
public class ContaDAO implements ContaInterfaceDAO{

    private List<Conta> contas;
    private Conta conta;
    
    @Override
    public void setConta(Conta conta){
        this.conta = conta;
    }
    
    @Override
    public Conta getConta(String banco, String agencia, String conta){
        if(this.conta == null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Conta.buscaConta");
            query.setParameter("banco", banco);
            query.setParameter("agencia", agencia);
            query.setParameter("conta", conta);
            this.conta= (Conta) query.list().get(0);
            session.close();
          
        }
        return this.conta;
    }
    
    @Override
    public List<Conta> getContas() {
        if(contas == null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Conta.listaContas");
            contas= query.list();
            session.close();
          
        }
        return contas;
    }

    @Override
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
  @Override
    public void salvar(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(conta);
        trans.commit();
        s.close();
       JOptionPane.showMessageDialog(null, "Salvo");
    }
    @Override
    public void atualiza(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(conta);
        trans.commit();
        s.close();
    }
    @Override
    public void excluir(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.delete(conta);
        trans.commit();
        s.close();
    }

    

}
