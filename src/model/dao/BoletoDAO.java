/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import javax.swing.JOptionPane;
import model.Boleto;
import model.Conta;
import model.Evento;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class BoletoDAO implements BoletoInterfaceDAO{
    
    private Boleto boleto;
    @Override
    public Boleto buscaBoleto(String codigo) {
        if(boleto==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Boleto.buscaBoleto");
            query.setParameter("codigo", codigo);
            boleto= (Boleto) query.list().get(0);
            session.close();
        }
        return boleto;
    }

    @Override
    public void setBoleto(Boleto boleto) {
        this.boleto=boleto;
    }
    
    @Override
    public void salvar(Boleto boleto){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(boleto);
        trans.commit();
        s.close();
       JOptionPane.showMessageDialog(null, "Salvo");
    }
    @Override
    public void atualiza(Boleto boleto){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(boleto);
        trans.commit();
        s.close();
    }
    @Override
    public void excluir(Boleto boleto){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.delete(boleto);
        trans.commit();
        s.close();
    }

    
}
