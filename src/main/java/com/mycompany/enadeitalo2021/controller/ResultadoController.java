/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;


import com.mycompany.enadeitalo2021.dao.ResultadoDAO;
import com.mycompany.enadeitalo2021.model.Resultado;
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

public class ResultadoController {
    
    Resultado resultado = new Resultado();
    List<Resultado> resultados = new ArrayList<Resultado>();
    
    
    
    public void gravar (ActionEvent actionEvent) {
        ResultadoDAO.getInstance().buscarTodos();
        resultados = ResultadoDAO.getInstance().buscarTodos();
        resultado = new Resultado();
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public List<Resultado> getResultados() {
        return resultados;
    }

    public void setResultados(List<Resultado> resultados) {
        this.resultados = resultados;
    }
    
        
    
    
    
}