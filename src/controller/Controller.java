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
        Conta conta = this.contaDAO.getContaLogin("005", agencia, cc);
        if (conta != null) {
            if (conta.getSenha().equals(senha)) {
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
        //this.contaDAO.atualiza(this.contaLogada);
    }

    public boolean efetuaSaque(double valor) {
        if (this.contaLogada.getSaldo() >= valor) {
            this.contaLogada.setSaldo(this.contaLogada.getSaldo() - valor);
            //this.contaDAO.atualiza(this.contaLogada);
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
            //this.contaDAO.atualiza(this.contaLogada);
            //this.contaDAO.atualiza(this.contaDestinataria);
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
            //this.contaDAO.atualiza(this.contaLogada);
            //this.contaDAO.atualiza(this.contaDestinataria);
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
        Evento ev;
        for (int i = 0; i < listaEventos.size(); i++) {
            ev = listaEventos.get(i);
            if (ev.getId().substring(0, 1).equals("SA")) {
                string = ev.getData().toString() + "  "
                        + ev.getId() + "  "
                        + "SAQUE";
                for (int j = 0; j < 35; j++) {
                    string += " ";
                }
                string += "-" + String.valueOf(ev.getValor());
                listaFinal.add(string);
            }
            if (ev.getId().substring(0, 1).equals("DE")) {
                string = ev.getData().toString() + "  "
                        + ev.getId() + "  "
                        + "DEPOSITO";
                for (int j = 0; j < 32; j++) {
                    string += " ";
                }
                string += "+" + String.valueOf(ev.getValor());
                listaFinal.add(string);
            }
            if (ev.getId().substring(0, 1).equals("PA")) {
                if (this.comparaContas(this.contaLogada, ev.getConta())) {
                    string = ev.getData().toString() + "  "
                            + ev.getId() + "  "
                            + "PAGAMENTO PARA:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getConta();
                    for (int j = 0; j < 10; j++) {
                        string += " ";
                    }
                    string += "-" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
                if (this.comparaContas(this.contaLogada, ev.getContaDestino())) {
                    string = ev.getData().toString() + "  "
                            + ev.getId() + "  "
                            + "PAGAMENTO DE:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getConta();
                    for (int j = 0; j < 12; j++) {
                        string += " ";
                    }
                    string += "+" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
            }
            if (ev.getId().substring(0, 1).equals("TR")) {
                if (this.comparaContas(this.contaLogada, ev.getConta())) {
                    string = ev.getData().toString() + "  "
                            + ev.getId() + "  "
                            + "TRANSFERENCIA PARA:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getConta();
                    for (int j = 0; j < 6; j++) {
                        string += " ";
                    }
                    string += "-" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
                if (this.comparaContas(this.contaLogada, ev.getContaDestino())) {
                    string = ev.getData().toString() + "  "
                            + ev.getId() + "  "
                            + "TRANSFERENCIA DE:" + ev.getContaDestino().getBanco() + "/" + ev.getContaDestino().getAgencia() + "/" + ev.getContaDestino().getConta();
                    for (int j = 0; j < 8; j++) {
                        string += " ";
                    }
                    string += "+" + String.valueOf(ev.getValor());
                    listaFinal.add(string);
                }
            }

        }
        return listaFinal;
    }

    private boolean comparaContas(Conta conta1, Conta conta2) {
        if (conta1.getBanco().equals(conta2.getBanco())) {
            if (conta1.getAgencia().equals(conta2.getAgencia())) {
                if (conta1.getConta().equals(conta2.getConta())) {
                    return true;
                }
            }
        }
        return false;
    }
     
}
//dd/mm/aaaaxxSA12345678xxTransferenciaxPara:001/0001/000001xxxxxx-100000,00
//       10|           24|                                     40|       50|        
