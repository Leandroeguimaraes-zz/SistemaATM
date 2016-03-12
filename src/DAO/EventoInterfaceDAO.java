/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Model.Conta;
import Model.Evento;

/**
 *
 * @author Leandro
 */
public interface EventoInterfaceDAO {
    
    public List<Evento> buscaEventos(Conta conta);
    
    
    public void salvar(Evento evento);

    
}
