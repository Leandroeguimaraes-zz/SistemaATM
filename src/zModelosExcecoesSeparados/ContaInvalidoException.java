/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zModelosExcecoesSeparados;

import javax.swing.JOptionPane;

/**
 *
 * @author VM
 */
public class ContaInvalidoException extends Exception {

    public ContaInvalidoException() {
    }

    public ContaInvalidoException(String message) {
        super(message);
    }
    
    public void ContaInvalidoException(int i ){
        if(i==1){
            JOptionPane.showMessageDialog(null, "Problema com a conta.");
        }else{
            System.out.println("Problema com a conta!");
        }
    }
    
}
