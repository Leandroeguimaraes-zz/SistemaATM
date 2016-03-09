/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Boleto;
import model.Conta;
import model.Evento;
import model.Usuario;
import model.dao.BoletoDAO;
import model.dao.ContaDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Leandro
 */
public class Controller {

    ContaDAO contaDAO = new ContaDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    BoletoDAO boletoDAO = new BoletoDAO();

    Conta contaLogada;
    Conta contaDestinataria;
    Boleto boleto;

    public boolean efetuaLogin(String agencia, String cc, String senha) {
        Conta conta = this.contaDAO.getConta("005", agencia, cc);
        if (conta != null) {
            if (this.contaLogada.getSenha().equals(senha)) {
                this.contaLogada = conta;
                return true;
            }
        }
        return false;
    }

    public String getSenha() {
        return this.contaLogada.getSenha();
    }

    public double getSaldo() {
        return this.contaLogada.getSaldo();
    }

    public String getNome() {
        return this.contaLogada.getUsuario().getNome();
    }

    public boolean existeContaECpf(String banco, String agencia, String cc, String cpf) {
        Conta conta = this.contaDAO.getConta(banco, agencia, cc);
        if (conta != null) {
            if (conta.getUsuario().getCpf().equals(cpf)) {
                this.contaDestinataria = conta;
                return true;
            }
        }
        return false;
    }

    public boolean efetuaTransferenciaDOC(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() - valor);
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            return true;
        } else {
            return false;
        }
    }

    public void efetuaDeposito(double valor) {
        this.contaLogada.setSaldo(this.contaLogada.getSaldo() + valor);
        this.contaDAO.atualiza(this.contaLogada);
    }

    public boolean existeBoleto(String codigo) {
        Boleto boleto = this.boletoDAO.getBoleto(codigo);
        if (boleto != null) {
            this.boleto = boleto;
            return true;
        } else {
            return false;
        }
    }

    public boolean efetuaPagamento() {
        if (this.contaLogada.getSaldo() >= this.boleto.getValor()) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - this.boleto.getValor());
            this.contaDestinataria = this.boleto.getConta();
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() - this.boleto.getValor());
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            return true;
        }else{
            return false;
        }
    }
}
