/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.Usuario;

/**
 *
 * @author Leandro
 */
public interface UsuarioInterfaceDAO {
    
    public void salvar(Usuario usuario);

    public void atualiza(Usuario usuario);

    public void excluir(Usuario usuario);
    
}
