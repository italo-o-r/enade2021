/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;;

import com.mycompany.enadeitalo2021.model.Prova;
import com.mycompany.enadeitalo2021.model.Prova;
import com.mycompany.enadeitalo2021.model.Prova;
import com.mycompany.enadeitalo2021.model.Prova;

/**
 *
 * @author COREI7
 */

public class ProvaDAO extends UniversalDAO<Prova, Integer> {
    
    public static ProvaDAO provaDAO;
    
    public ProvaDAO() {
        super(Prova.class);
    }
    
    public static ProvaDAO getInstance() {
        if (provaDAO == null) {
            provaDAO = new ProvaDAO();
        }
        return provaDAO;
    }
}
