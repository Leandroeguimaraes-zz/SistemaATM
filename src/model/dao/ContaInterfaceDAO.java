/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.Conta;

/**
 *
 * @author Leandro
 */
public interface ContaInterfaceDAO {
    
    public void salvar(Conta conta);

    public void atualiza(Conta conta);

    public void excluir(Conta conta);
}
