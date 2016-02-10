/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author VM
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    /**
     * cria uma data com o formato dia/mes/ano
     *
     * @param dia
     * @param mes
     * @param ano
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    

    /**
     *
     * @param dia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     *
     * @param mes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     *
     * @param ano
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     *
     * @return (dia da data)
     */
    public int getDia() {
        return dia;
    }

    /**
     *
     * @return (mes da data)
     */
    public int getMes() {
        return mes;
    }

    /**
     *
     * @return (ano da data)
     */
    public int getAno() {
        return ano;
    }

    /**
     * 
     * @return (um string de data no formato dia/mes/ano)   
     */
    @Override
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

}
