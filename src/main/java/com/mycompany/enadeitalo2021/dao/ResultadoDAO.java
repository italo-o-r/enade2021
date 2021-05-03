/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;

import com.mycompany.enadeitalo2021.model.Resultado;


/**
 *
 * @author COREI7
 */

public class ResultadoDAO extends UniversalDAO<Resultado, Integer> {
    
    public static ResultadoDAO resultadoDAO;
    
    public ResultadoDAO() {
        super(Resultado.class);
    }
    
    public static ResultadoDAO getInstance() {
        if (resultadoDAO == null) {
            resultadoDAO = new ResultadoDAO();
        }
        return resultadoDAO;
    }
}
