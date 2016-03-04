/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author VM
 */
public class ValorInvalidoException extends Exception {

    public ValorInvalidoException() {
    }

    public ValorInvalidoException(String message) {
        super(message);
    }
    
    public void ValorInvalidoException(int i){
        if(i==1){
            JOptionPane.showMessageDialog(null, "Valor Invalido!");
        }
        if(i==2){
            JOptionPane.showMessageDialog(null, "Valor ultrapassa limite de deposito díario.");
        }else{
            System.out.println("Erro de valor ainda nao declarado!");
        }
    }

    
}
