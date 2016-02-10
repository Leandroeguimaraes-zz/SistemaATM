/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import Modelo.Comprovante;
import Modelo.Data;
import Modelo.Extrato;
import Modelo.excecoes.DataInvalidaException;
import Modelo.excecoes.HoraInvalidaException;
import java.util.HashSet;

/**
 *
 * @author VM
 */
public class TesteMain {

    public static void main(String[] args) throws DataInvalidaException, HoraInvalidaException {
        HashSet<String> c = new HashSet<String>() {
            {
                add(Comprovante.comprovanteDeDeposito(Data.agora(), "1", "a", "111", 100));
                add(Comprovante.comprovanteDeDeposito(Data.agora(), "1", "a", "111", 500));
            }
        };
        Extrato.addComprovantes(Data.agora(), c);
        Extrato.addComprovantes(new Data(1, 3, 1999, 19, 0), c);
        System.out.println(Extrato.geraExtrato(Data.agora(), "a", "111", "1"));

    }
}
