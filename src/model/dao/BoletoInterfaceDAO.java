/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.Boleto;

/**
 *
 * @author Leandro
 */
public interface BoletoInterfaceDAO {
    public Boleto buscaBoleto(String codigo);
    
    public void setBoleto(Boleto boleto);
    
    public void salvar(Boleto boleto);

    public void atualiza(Boleto boleto);

    public void excluir(Boleto boleto);
    
}
