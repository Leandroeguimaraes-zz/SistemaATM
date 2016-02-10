/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.excecoes.EnderecoInvalidoException;
import Modelo.excecoes.telefoneInvalidoException;
import Modelo.excecoes.CpfInvalidoException;
import Modelo.excecoes.TitularInvalidoException;

/**
 *
 * @author VM
 */
public final class Titular {

    public static final int TAMANHO_CPF = 11;

    public String nome;
    public String cpf;
    public String endereço;
    public String telefone;

    /**
     *
     * @param nome
     * @param cpf
     * @param endereço
     * @param telefone
     * @throws CpfInvalidoException
     * @throws TitularInvalidoException
     */
    public Titular(String nome, String cpf, String endereço, String telefone) throws CpfInvalidoException, TitularInvalidoException {
        this.setNome(nome);
        this.setCPF(cpf);
        this.endereço = endereço;
        this.telefone = telefone;
    }

    /**
     * seta o cpf atraves do algoritmo de validacao.
     *
     * @param cpf (cpf do titular da conta)
     * @throws Modelo.excecoes.CpfInvalidoException
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
        this.cpf = cpf;
    }

    /**
     * seta o nome do titular da conta
     *
     * @param nome (nome do titular)
     * @throws Modelo.excecoes.TitularInvalidoException
     */
    public void setNome(String nome) throws TitularInvalidoException {
        if (nome.isEmpty()) {
            throw new TitularInvalidoException();
        }
        this.nome = nome;
    }

    /**
     *
     * @param endereço
     * @throws EnderecoInvalidoException
     */
    public void setEndereço(String endereço) throws EnderecoInvalidoException {
        if (nome.isEmpty()) {
            throw new EnderecoInvalidoException();
        }
        this.endereço = endereço;
    }

    /**
     *
     * @param telefone
     * @throws telefoneInvalidoException
     */
    public void setTelefone(String telefone) throws telefoneInvalidoException {
         if (nome.isEmpty()) {
            throw new telefoneInvalidoException();
        }
        this.telefone = telefone;
    }
    

}
