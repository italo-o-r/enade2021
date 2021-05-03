/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.UsuarioDAO;
import com.mycompany.enadeitalo2021.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;



/**
 *
 * @author COREI7
 */

@ManagedBean()
@ViewScoped

public class UsuarioController {
    
    Usuario usuario = new Usuario();
    List<Usuario> usuarios = new ArrayList<Usuario>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        UsuarioDAO.getInstance().buscarTodos();
        usuarios = UsuarioDAO.getInstance().buscarTodos();
        usuario = new Usuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
}
