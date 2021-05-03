/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.ProvaDAO;
import com.mycompany.enadeitalo2021.model.Prova;
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

public class ProvaController {
    
    Prova prova = new Prova();
    List<Prova> provas = new ArrayList<Prova>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        ProvaDAO.getInstance().buscarTodos();
        provas = ProvaDAO.getInstance().buscarTodos();
        prova = new Prova();
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void setProvas(List<Prova> provas) {
        this.provas = provas;
    }
    
    
    
}
