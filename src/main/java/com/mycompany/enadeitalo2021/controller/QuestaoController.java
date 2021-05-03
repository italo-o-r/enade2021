/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.QuestaoDAO;
import com.mycompany.enadeitalo2021.model.Questao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.faces.event.ActionEvent;



/**
 *
 * @author COREI7
 */

@ManagedBean()
@ViewScoped

public class QuestaoController implements Serializable{
    
    Questao questao = new Questao();
    List<Questao> questoes = new ArrayList<Questao>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        QuestaoDAO.getInstance().buscarTodos();
        questoes = QuestaoDAO.getInstance().buscarTodos();
        questao = new Questao();
    }

    public Questao getQuestao() {
        return questao;
    }

    public void setQuestao(Questao questao) {
        this.questao = questao;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    
    
}