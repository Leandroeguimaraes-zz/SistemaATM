/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.Conta;
import model.Evento;

/**
 *
 * @author Leandro
 */
public interface EventoInterfaceDAO {
    
    public List<Evento> buscaEventos(String banco, String agencia,String numConta);
    
    
    public void salvar(Evento evento);

    
}
