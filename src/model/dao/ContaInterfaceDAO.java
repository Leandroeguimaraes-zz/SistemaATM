/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.Conta;

/**
 *
 * @author Leandro
 */
public interface ContaInterfaceDAO {
    
    public void setConta(Conta conta);
    
    public Conta getConta(String banco,String agencia, String conta);
    
    public List<Conta> getContas();
    
    public void setContas(List<Conta> contas);
    
    public void salvar(Conta conta);

    public void atualiza(Conta conta);

    public void excluir(Conta conta);
}
