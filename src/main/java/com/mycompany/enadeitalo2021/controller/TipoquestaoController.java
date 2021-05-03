/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.TipoquestaoDAO;
import com.mycompany.enadeitalo2021.model.Tipoquestao;
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

public class TipoquestaoController {
    
    Tipoquestao tipoQuestao = new Tipoquestao();
    List<Tipoquestao> tipoQuestoes = new ArrayList<Tipoquestao>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        TipoquestaoDAO.getInstance().buscarTodos();
        tipoQuestoes = TipoquestaoDAO.getInstance().buscarTodos();
        tipoQuestao = new Tipoquestao();
    }

    public Tipoquestao getTipoquestao() {
        return tipoQuestao;
    }

    public void setTipoquestao(Tipoquestao tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }

    public List<Tipoquestao> getTipoQuestoes() {
        return tipoQuestoes;
    }

    public void setTipoQuestoes(List<Tipoquestao> tipoQuestoes) {
        this.tipoQuestoes = tipoQuestoes;
    }
    
    
    
    
}
