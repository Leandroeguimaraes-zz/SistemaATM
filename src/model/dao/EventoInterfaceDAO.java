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
    
    public Evento buscaEvento(String banco, String agencia,String numConta);
    
    public void setEvento(Evento evento);
    
    public void salvar(Evento evento);

    public void atualiza(Evento evento);

    public void excluir(Evento evento);
    
}
