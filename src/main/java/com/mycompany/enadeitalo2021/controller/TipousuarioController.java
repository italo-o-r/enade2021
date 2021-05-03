/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.TipousuarioDAO;
import com.mycompany.enadeitalo2021.model.Tipousuario;
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

public class TipousuarioController {
    
    Tipousuario tipoUsuario = new Tipousuario();
    List<Tipousuario> tipoUsuarios = new ArrayList<Tipousuario>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        TipousuarioDAO.getInstance().buscarTodos();
        tipoUsuarios = TipousuarioDAO.getInstance().buscarTodos();
        tipoUsuario = new Tipousuario();
    }

    public Tipousuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Tipousuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Tipousuario> getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(List<Tipousuario> tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }
    
    
}