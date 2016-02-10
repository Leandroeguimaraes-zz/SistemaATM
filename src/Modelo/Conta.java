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
public class Conta {

    public static final int TAMANHO_CODIGO_AGENCIA = 5;
    public static final int TAMANHO_CODIGO_CONTA = 8;
    public static final int TAMANHO_CPF = 11;

    private String titular;
    private String CPF;
    private String agencia;
    private String conta;
    private TipoConta tipoConta;
    private String senha;
    private EstadoConta estado;
    private double saldo;

    /**
     *
     * @param titular (nome do titular)
     * @param cpf (cpf do titular)
     * @param agencia (numero da agencia)
     * @param conta (numero da conta)
     * @param tipoConta (tipo da conta)
     * @param senha (senha da conta)
     * @param estado (esta da conta)
     * @param saldo (saldo da conta)
     * @throws Modelo.TitularInvalidoException (nome de titular não aceito pelas
     * regras de negocio)
     * @throws Modelo.AgenciaInvalidoException (numero de agencia não aceita
     * pelas regras de negocio)
     * @throws Modelo.ContaInvalidoException (numero de conta não aceito pelas
     * regras de negocio)
     * @throws Modelo.SenhaInvalidaException (senha não aceita pelas regras de
     * negocio)
     * @throws Modelo.CpfInvalidoException (cpf não aceito pela receita federal)
     */
    public Conta(String titular, String cpf, String agencia, String conta, TipoConta tipoConta, String senha, EstadoConta estado, double saldo) throws TitularInvalidoException, AgenciaInvalidoException, ContaInvalidoException, SenhaInvalidaException, CpfInvalidoException {
        this.setTitular(titular);
        this.setCPF(cpf);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setTipoConta(tipoConta);
        this.setSenha(senha);
        this.setEstado(estado);
        this.setSaldo(saldo);
    }

    /**
     * insere uma quantia ao saldo da conta e retorna o saldo atual apos ser 
     * efetuado o deposito.
     * @param valor (valor a ser inserido)
     * @return (saldo atual apos ser efetuado o deposito)
     * @throws Modelo.ValorInvalidoException (valor invalido pelas regras de negocio)
     */
    public double deposita(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        this.saldo += valor;
        return this.saldo;
    }

    /**
     * retira uma quantia do saldo da conta e retorna o saldo da mesma depois de
     * efetuado o saque.
     *
     * @param valor (valor a ser sacado)
     * @return (saldo atual depois do saque ser efetuado)
     * @throws Modelo.ValorInvalidoException (valor invalido pelas regras de
     * negocio)
     */
    public double sacar(double valor) throws ValorInvalidoException {
        if (valor < 0) {
            throw new ValorInvalidoException();
        }
        this.saldo -= valor;
        return this.saldo;
    }

    /**
     * seta o cpf atraves do algoritmo de validacao.
     *
     * @param cpf (cpf d otitular da conta)
     * @throws Modelo.CpfInvalidoException (cpf invalidado pelo algoritmo da
     * receita federal)
     */
    public void setCPF(String cpf) throws CpfInvalidoException {
        try {
            Long.parseLong(cpf);
        } catch (NumberFormatException ex) {
            throw new CpfInvalidoException();
        }
        if (cpf.length() < TAMANHO_CPF) {
            throw new CpfInvalidoException();
        }
        char digitos[] = cpf.toCharArray();
        char digitoAnterior = digitos[0];
        int contador = 0;
        for (char digitoProximo : digitos) {
            if (digitoAnterior == digitoProximo) {
                contador++;
            } else {
                break;
            }
        }
        if (contador == 11) {
            throw new CpfInvalidoException();
        }
        int numeros[] = new int[TAMANHO_CPF - 1];
        contador = 10;
        int soma = 0;
        for (int i = 0; i < TAMANHO_CPF - 2; i++) {
            numeros[i] = Character.getNumericValue(digitos[i]);
            soma += numeros[i] * contador;
            contador--;
        }
        int resultado = (soma * 10) % 11;
        if (resultado == 10) {
            resultado = 0;
        }
        if (resultado != Character.getNumericValue(digitos[TAMANHO_CPF - 2])) {
            throw new CpfInvalidoException();
        }
        soma = 0;
        contador = 11;
        numeros[TAMANHO_CPF - 2] = Character.getNumericValue(digitos[TAMANHO_CPF - 2]);
        for (int i = 0; i < TAMANHO_CPF - 1; i++) {
            soma += numeros[i] * contador;
            contador--;
        }
        resultado = (soma * 10) % 11;
        if (resultado == 10) {
            resultado = 0;
        }
        if (resultado != Character.getNumericValue(digitos[TAMANHO_CPF - 1])) {
            throw new CpfInvalidoException();
        }
        this.CPF = cpf;
    }

    /**
     * seta o nome do titular da conta
     *
     * @param titular (nome do titular)
     * @throws Modelo.TitularInvalidoException (nome do titular invalid opelas
     * regras de negocio)
     */
    public void setTitular(String titular) throws TitularInvalidoException {
        if (titular.isEmpty()) {
            throw new TitularInvalidoException();
        }
        this.titular = titular;
    }

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
     * retorna o nome do titular da conta.
     *
     * @return (nome do titular da conta)
     */
    public String getTitular() {
        return titular;
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
        return "Conta{" + "titular=" + titular + ", CPF=" + CPF + ", agencia=" + agencia + ", conta=" + conta + ", tipoConta=" + tipoConta + ", senha=" + senha + ", estado=" + estado + ", saldo=" + saldo + '}';
    }
}   
