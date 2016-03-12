/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Util.HibernateUtil;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.Boleto;
import Model.Conta;
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
//        Calendar c = Calendar.getInstance();
//        c.set(2016, 2,21);
//        Date data = c.getTime();
//        Conta conta = new ContaDAO().getConta("001", "0001", "000001");
        boleto = null;
        if(boleto==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Boleto.buscaBoleto");
            query.setParameter("codigo", codigo);
            if (query.list().size()>0){
                boleto= (Boleto) query.list().get(0);
            }
            session.close();
        }
        return boleto;
    }
    
        public void salvar(Boleto boleto){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(boleto);
        trans.commit();
        s.close();
    }
    
    public void atualiza(Boleto boleto){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(boleto);
        trans.commit();
        s.close();
    }

    
}