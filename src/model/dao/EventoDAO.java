/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import controller.Controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Conta;
import model.Evento;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Leandro
 */
public class EventoDAO implements EventoInterfaceDAO {

    private Evento evento;
    private List<Evento> eventos = new ArrayList<>();
    
    public Evento buscaEvento(String id) {
        evento = null;
        if(evento==null){
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Evento.buscaEvento");
            query.setParameter("id", id);
            if (query.list().size()>0){
                evento= (Evento) query.list().get(0);
            }session.close();
        }
        return evento;
    }

    @Override
    public List<Evento> buscaEventos(Conta conta) {
//        Evento evt;
//        Conta conta = new ContaDAO().getConta(banco, agencia, numConta);
//        Conta contaDest = new ContaDAO().getConta("001", "0001", "000001");
//        Controller control = new Controller();
//        Date data = new Date();
//        
//        for (int i = 0; i < 3; i++) {
//            evt = new Evento("SA"+control.geraRandom(),conta,null,10,data);
//            
//        }
        eventos = null;
        if (eventos == null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.getNamedQuery("Evento.buscaEventos");
            query.setParameter("cont", conta);
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

           eventos.add(evento);
    }
    
    public void atualiza(Evento evento){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = s.beginTransaction();
        s.update(evento);
        trans.commit();
        s.close();
    }

}
