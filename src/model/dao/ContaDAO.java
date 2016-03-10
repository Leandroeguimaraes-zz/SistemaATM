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
public class ContaDAO {

    public Conta getContaLogin(String banco, String agencia, String cc){
        Conta conta = new Conta(banco,agencia,cc, "11111111111",500.00,"111111");
        UsuarioDAO usuDAO = new UsuarioDAO();
        conta.setUsuario(usuDAO.getUsuario(conta.getCPF()));
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            Query query = session.getNamedQuery("Conta.buscaConta");
//            query.setParameter("banco", banco);
//            query.setParameter("agencia", agencia);
//            query.setParameter("conta", cc);
//            Conta conta = (Conta) query.list().get(0);
//            session.close();
            return conta;
    }
    
    public Conta getConta(String banco, String agencia, String cc){
        Conta conta = new Conta(banco,agencia,cc,500);
        return conta;
    }
    
    public void atualiza(Conta conta){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(conta);
        trans.commit();
        s.close();
    }
}
