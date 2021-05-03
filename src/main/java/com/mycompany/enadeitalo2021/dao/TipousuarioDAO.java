/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.dao;

import com.mycompany.enadeitalo2021.model.Tipousuario;

/**
 *
 * @author COREI7
 */

public class TipousuarioDAO extends UniversalDAO<Tipousuario, Integer> {
    
     public static TipousuarioDAO tipoUsuarioDAO;
    
     public TipousuarioDAO() {
         super(Tipousuario.class);
     }
     
     public static TipousuarioDAO getInstance() {
         if (tipoUsuarioDAO == null) {
             tipoUsuarioDAO = new TipousuarioDAO();
         }
         return tipoUsuarioDAO;
     }
}
