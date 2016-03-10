/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Boleto;
import model.Conta;
import model.Evento;
import model.dao.BoletoDAO;
import model.dao.ContaDAO;
import model.dao.EventoDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Leandro
 */
public class Controller {

    ContaDAO contaDAO = new ContaDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    BoletoDAO boletoDAO = new BoletoDAO();
    EventoDAO eventoDAO = new EventoDAO();

    Conta contaLogada;
    Conta contaDestinataria;
    Boleto boleto;
    List<Evento> listaEventos;
    Evento evento;

    // Metodos GETS_________________________________________________________________________________________
    //======================================================================================================
    public String getSenha() {
        return this.contaLogada.getSenha();
    }

    public double getSaldo() {
        return this.contaLogada.getSaldo();
    }

    public String getNome() {
        return this.contaLogada.getUsuario().getNome();
    }

    // Validação Usuario_________________________________________________________________________________________
    //======================================================================================================
    public boolean efetuaLogin(String agencia, String cc, String senha) {
        Conta conta = this.contaDAO.getConta("005", agencia, cc);
        if (conta != null) {
            if (this.contaLogada.getSenha().equals(senha)) {
                this.contaLogada = conta;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // Saque e Deposito_________________________________________________________________________________________
    //======================================================================================================
    public void efetuaDeposito(double valor) {
        this.contaLogada.setSaldo(this.contaLogada.getSaldo() + valor);
        this.contaDAO.atualiza(this.contaLogada);
    }

    public boolean efetuaSaque(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            this.contaDAO.atualiza(this.contaLogada);
            return true;
        } else {
            return false;
        }
    }

    // Transferencias_________________________________________________________________________________________
    //======================================================================================================
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

    public boolean efetuaTransferencia(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() + valor);
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            return true;
        } else {
            return false;
        }
    }

    // Pagamentos_________________________________________________________________________________________
    //======================================================================================================
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
            this.contaDestinataria.setSaldo(this.contaDestinataria.getSaldo() + this.boleto.getValor());
            this.contaDAO.atualiza(this.contaLogada);
            this.contaDAO.atualiza(this.contaDestinataria);
            return true;
        } else {
            return false;
        }
    }

    // Extrato_________________________________________________________________________________________
    //======================================================================================================
    public ArrayList<String> getListaEventos() {
        ArrayList<String> listaFinal = new ArrayList<String>();
        ArrayList<Evento> listaEventos = this.eventoDAO.getEventos();
        String string;
        for (int i = 0; i < listaEventos.size(); i++) {
            if (listaEventos.get(i).getId().substring(0, 1).equals("SA")) {
                string = listaEventos.get(i).getData().toString()+"  "
                        +listaEventos.get(i).getId()+"  "
                        +"SAQUE                    "
                        +"-"+ String.valueOf(listaEventos.get(i).getValor());
                listaFinal.add(string);
            }
            if (listaEventos.get(i).getId().substring(0, 1).equals("DE")){
                string = listaEventos.get(i).getData().toString()+"  "
                        +listaEventos.get(i).getId()+"  "
                        +"DEPOSITO                 "
                        +"+"+ String.valueOf(listaEventos.get(i).getValor());
                listaFinal.add(string);
            }
            if (listaEventos.get(i).getId().substring(0, 1).equals("PA")){
                string = listaEventos.get(i).getData().toString()+"  "
                        +listaEventos.get(i).getId()+"  "
                        +"DEPOSITO                 "
                        +"+"+ String.valueOf(listaEventos.get(i).getValor());
                listaFinal.add(string);
            }

        }
    }
dd/mm/aaaaxxSA12345678xx(001/0001/00000-1)xxxxx-100000,00
}
