/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;

import com.mycompany.enadeitalo2021.model.Tipoquestao;

/**
 *
 * @author COREI7
 */

public class TipoquestaoDAO extends UniversalDAO<Tipoquestao, Integer> {
    
    public static TipoquestaoDAO tipoQuestaoDAO;
    
    public TipoquestaoDAO() {
        super(Tipoquestao.class);
    }
    
    public static TipoquestaoDAO getInstance() {
        if (tipoQuestaoDAO == null) {
            tipoQuestaoDAO = new TipoquestaoDAO();
        }
        return tipoQuestaoDAO;
    }
    
}
