/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author VM
 */
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException() {
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
    
}