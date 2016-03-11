/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import model.Evento;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class EventoDAO implements EventoInterfaceDAO {

    private List<Evento> eventos;

    @Override
    public List<Evento> buscaEventos(String banco, String agencia, String numConta) {
        if (eventos == null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Evento.buscaEventos");
            query.setParameter("numConta", numConta);
            query.setParameter("agencia", agencia);
            query.setParameter("banco", banco);
            eventos = query.list();
            session.close();
        }
        return eventos ;
    }


    @Override
    public void salvar(Evento evento) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.save(evento);
        trans.commit();
        s.close();
        JOptionPane.showMessageDialog(null, "Salvo");
    }

    public Evento buscaEvento(String id) {
        return null;
    }


}
