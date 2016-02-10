/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.excecoes.DataInvalidaException;
import Modelo.excecoes.HoraInvalidaException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author VM
 */
public final class Data {

    public static enum Meses {
        JAN(0), FEB(1), MAR(2), APR(3), MAY(4), JUN(5), JUL(6), AUG(7), SEP(8), OCT(9), NOV(10), DEC(11);
        int num;

        private Meses(int num) {
            this.num = num;
        }

        public static Meses getMes(int num) {
            Meses meses[] = Meses.values();
            return meses[num];
        }

    }

    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minutos;

    /**
     * cria uma data com o formato dia/mes/ano
     *
     * @param dia
     * @param mes
     * @param ano
     * @param hora
     * @param minutos
     * @throws Modelo.DataInvalidaException (data invalida de acordo com o
     * calendario)
     * @throws Modelo.HoraInvalidaException (hora invalida para o modelo 24h)
     */
    public Data(int dia, int mes, int ano, int hora, int minutos) throws DataInvalidaException, HoraInvalidaException {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
        this.setHora(hora);
        this.setMinutos(minutos);
    }

    /**
     * cria um objeto data com a data atual
     *
     * @return (objeto data com a data atual)
     * @throws Modelo.DataInvalidaException
     */
    public static Data agora() throws DataInvalidaException, HoraInvalidaException {
        Calendar calendar = new GregorianCalendar();
        return new Data(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR), calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
    }

    /**
     *
     * @param hora
     * @throws Modelo.HoraInvalidaException (hora invalida para o modelo 24h)
     */
    public void setHora(int hora) throws HoraInvalidaException {
        if (hora < 0 || hora > 23) {
            throw new HoraInvalidaException();
        }
        this.hora = hora;
    }

    /**
     *
     * @param minutos
     * @throws Modelo.HoraInvalidaException (minutos invalidos para o modelo
     * 24h)
     */
    public void setMinutos(int minutos) throws HoraInvalidaException {
        if (minutos < 0 || minutos > 59) {
            throw new HoraInvalidaException();
        }
        this.minutos = minutos;
    }

    /**
     *
     * @param dia
     */
    public void setDia(int dia) throws DataInvalidaException {
        if (dia <= 0 || dia > 31) {
            throw new DataInvalidaException();
        }
        this.dia = dia;

    }

    /**
     *
     * @param mes
     */
    public void setMes(int mes) throws DataInvalidaException {
        if (mes < 0 || mes > 12) {
            throw new DataInvalidaException();
        }
        this.mes = mes;
    }

    /**
     *
     * @param ano
     */
    public void setAno(int ano) throws DataInvalidaException {
        if (ano < 0) {
            throw new DataInvalidaException();
        }
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
     * @return (horas)
     */
    public int getHora() {
        return hora;
    }

    /**
     * 
     * @return (minutos)
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     *
     * @return (um string de data no formato dia/mes/ano)
     */
    @Override
    public String toString() {
        return this.dia + "/" + Meses.getMes(this.mes) + "/" + this.ano 
                + "_"+ this.hora+":"+this.minutos+"_";
    }

}
