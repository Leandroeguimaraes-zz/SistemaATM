/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Util.HibernateUtil;
import model.Boleto;
import org.hibernate.Query;
import org.hibernate.Session;


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

    
}