/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;

import com.mycompany.enadeitalo2021.model.Questao;

/**
 *
 * @author COREI7
 */

public class QuestaoDAO extends UniversalDAO<Questao, Integer> {
    
    public static QuestaoDAO questaoDAO;
    
    public QuestaoDAO() {
        super(Questao.class);
    }
    
    public static QuestaoDAO getInstance() {
        if (questaoDAO == null) {
            questaoDAO = new QuestaoDAO();
        }
        return questaoDAO;
    }
   
}
