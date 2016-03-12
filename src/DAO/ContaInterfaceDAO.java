/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Conta;

/**
 *
 * @author Leandro
 */
public interface ContaInterfaceDAO {
    
    public Conta buscaConta(String banco, String agencia,String numConta);

    public void atualiza(Conta conta);

}
