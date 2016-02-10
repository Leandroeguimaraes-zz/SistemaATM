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
public class telefoneInvalidoException extends Exception {

    public telefoneInvalidoException() {
    }

    public telefoneInvalidoException(String message) {
        super(message);
    }
    
}
