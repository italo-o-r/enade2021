/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;

import com.mycompany.enadeitalo2021.model.Usuario;

/**
 *
 * @author COREI7
 */

public class UsuarioDAO extends UniversalDAO<Usuario, Integer> {
    
    public static UsuarioDAO usuarioDAO;
    
    public UsuarioDAO() {
        super(Usuario.class);
    }
    
    public static UsuarioDAO getInstance(){
        if (usuarioDAO == null) {
            usuarioDAO = new UsuarioDAO();
        }
        return usuarioDAO;
    }
    
}
