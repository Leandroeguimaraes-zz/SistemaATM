/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.excecoes;

/**
 *
 * @author VM
 */
public class SenhaInvalidaException extends Exception {

    public SenhaInvalidaException() {
    }

    public SenhaInvalidaException(String message) {
        super(message);
    }
    
}
