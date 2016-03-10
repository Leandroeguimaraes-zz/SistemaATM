package model.dao;

import java.util.Calendar;
import java.util.Date;
import model.Boleto;
import model.Conta;

public class BoletoDAO {

    public Boleto getBoleto(String codigo) {
        Conta conta = new Conta("001","0001","00001",200);
        Calendar c = Calendar.getInstance();
        c.set(2016, 2, 21);
        Date data = c.getTime();
        Boleto boleto = new Boleto(codigo,conta,50,data);
        return boleto;
    }
    
}
