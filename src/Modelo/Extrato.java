/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author VM
 */
public class Extrato {

    private final Data dataInicio;
    private final Data dataFim;
    private final Map<Data, String> extrato;

    
    public Extrato(Data dataInicio, Data dataFim) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.extrato = new HashMap<>();
        this.extrato.put(dataInicio, "");
        this.extrato.put(dataFim, "");
    }

    /**
     * 
     * @param data (data em que a transacao foi feita
     * @param relatorio (transacoes feitas nesta data)
     */
    public void addRelatorio(Data data, String relatorio) {
        this.extrato.put(data, relatorio);
    }

    /**
     *
     * @return (data de inicio do relatorio)
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     *
     * @return (data do final do relatorio)
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     *
     * @return (mapa que representa o relatorio onde as chaves são as datas e os
     * valores são os relatorios das operções financeiras realizadas)
     */
    public Map<Data, String> getExtrato() {
        return extrato;
    }

}
