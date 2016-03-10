/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zModelosSeparados;

import zModelosExcecoesSeparados.DataInvalidaException;
import zModelosExcecoesSeparados.HoraInvalidaException;
import zModelosExcecoesSeparados.SenhaInvalidaException;
import zModelosExcecoesSeparados.ContaInvalidoException;
import zModelosExcecoesSeparados.TitularInvalidoException;
import zModelosExcecoesSeparados.CpfInvalidoException;
import zModelosExcecoesSeparados.AgenciaInvalidoException;

/**
 *
 * @author VM
 */
public final class Conta {

    public static final int TAMANHO_CODIGO_AGENCIA = 5;
    public static final int TAMANHO_CODIGO_CONTA = 8;

    private String agencia;
    private String conta;
    private TipoConta tipoConta;
    private String senha;
    private EstadoConta estado;
    private double saldo;

    /**
     *
     * @param agencia (numero da agencia)
     * @param conta (numero da conta)
     * @param tipoConta (tipo da conta)
     * @param senha (senha da conta)
     * @param estado (esta da conta)
     * @param saldo (saldo da conta)
     * @throws zModelosExcecoesSeparados.TitularInvalidoException
     * @throws zModelosExcecoesSeparados.AgenciaInvalidoException
     * @throws zModelosExcecoesSeparados.ContaInvalidoException
     * @throws zModelosExcecoesSeparados.SenhaInvalidaException
     * @throws zModelosExcecoesSeparados.CpfInvalidoException
     */
    public Conta(String agencia, String conta, TipoConta tipoConta, String senha, EstadoConta estado, double saldo) throws TitularInvalidoException, AgenciaInvalidoException, ContaInvalidoException, SenhaInvalidaException, CpfInvalidoException {
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setTipoConta(tipoConta);
        this.setSenha(senha);
        this.setEstado(estado);
        this.setSaldo(saldo);
    }

    /**
     * insere uma quantia ao saldo da conta.
     *
     * @param valor (valor a ser inserido)
     * @throws model.ValorInvalidoException
     * @throws zModelosExcecoesSeparados.DataInvalidaException (valor invalido pelas
     * regras de negocio)
     * @throws zModelosExcecoesSeparados.HoraInvalidaException (hora invalida para o
     * padrao 24h)
     */


    /**
     * retira uma quantia do saldo da conta.
     *
     * @param valor (valor a ser sacado)
     * @throws model.ValorInvalidoException (valor invalido pelas
     * regras de negocio)
     * @throws zModelosExcecoesSeparados.DataInvalidaException (valor invalido pelas
     * regras de negocio)
     * @throws zModelosExcecoesSeparados.HoraInvalidaException (hora invalida para o
     * padrao 24h)
     */
   

    /**
     * seta a agencia da conta.
     *
     * @param agencia (numero de agencia)
     * @throws Modelo.AgenciaInvalidoException (numero de agencia invalido pelas
     * regras de negocio)
     */
    public void setAgencia(String agencia) throws AgenciaInvalidoException {
        if (agencia.isEmpty() || agencia.length() > TAMANHO_CODIGO_AGENCIA) {
            throw new AgenciaInvalidoException();
        }

        this.agencia = agencia;
    }

    /**
     * seta o numero da conta.
     *
     * @param conta (numero da conta)
     * @throws Modelo.ContaInvalidoException (numero da conta invalido pelas
     * regras de negocio)
     */
    public void setConta(String conta) throws ContaInvalidoException {
        if (conta.isEmpty() || conta.length() > TAMANHO_CODIGO_CONTA) {
            throw new ContaInvalidoException();
        }
        this.conta = conta;
    }

    /**
     * seta o tipo da conta
     *
     * @param tipoConta (tipo da conta)
     */
    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    /**
     * seta senha da conta verificando se ela e uma senha valida de 6 digitos.
     *
     * @param senha (senha da conta)
     * @throws Modelo.SenhaInvalidaException (senha nao aceita pelas regras de
     * negocio)
     */
    public void setSenha(String senha) throws SenhaInvalidaException {
        try {
            Long.parseLong(senha);
            if (senha.length() != 6) {
                throw new SenhaInvalidaException();
            }
        } catch (NumberFormatException ex) {
            throw new SenhaInvalidaException();
        }
        this.senha = senha;
    }

    /**
     * seta o estado da conta.
     *
     * @param estado (estado da conta)
     */
    public void setEstado(EstadoConta estado) {
        this.estado = estado;

    }

    /**
     * seta saldo da conta.
     *
     * @param saldo (saldo da conta)
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    /**
     * retorna o numero da agencia da conta.
     *
     * @return (numero da agencia da conta)
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * retorna o numero da conta.
     *
     * @return (numero da agencia da conta)
     */
    public String getConta() {
        return conta;
    }

    /**
     * retorna o tipo da conta.
     *
     * @return (tipo da conta)
     */
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    /**
     * retorna a senha da conta.
     *
     * @return (senha da conta)
     */
    public String getSenha() {
        return senha;
    }

    /**
     * retorna o estado da conta.
     *
     * @return (estado da conta)
     */
    public EstadoConta getEstado() {
        return estado;
    }

    /**
     * retorna o saldo da conta.
     *
     * @return (saldo da conta)
     */
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + ", agencia=" + agencia + ", conta=" + conta + ", tipoConta=" + tipoConta + ", senha=" + senha + ", estado=" + estado + ", saldo=" + saldo + '}';
    }
}
