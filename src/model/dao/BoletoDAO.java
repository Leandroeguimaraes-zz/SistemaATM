package model.dao;

import java.util.Date;
import model.Boleto;
import model.Conta;

public class BoletoDAO {

    public Boleto getBoleto(String codigo) {
        Conta conta = new Conta("001","0001","00001",200);
        Boleto boleto = new Boleto("0000000001",conta,50,new Date(28032016));
        return boleto;
    }
    
}
