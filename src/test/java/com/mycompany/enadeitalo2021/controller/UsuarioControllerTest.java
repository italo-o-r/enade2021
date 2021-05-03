/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.controller;

import com.mycompany.enadeitalo2021.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import javax.faces.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author COREI7
 */
public class UsuarioControllerTest {
    
    public UsuarioControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testGravar() {
        System.out.println("gravar");
        ActionEvent actionEvent = null;
        UsuarioController instance = new UsuarioController();
        instance.gravar(actionEvent);
    }


    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        UsuarioController instance = new UsuarioController();
        Usuario expResult = new Usuario();
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);

    }


    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        UsuarioController instance = new UsuarioController();
        instance.setUsuario(usuario);
    }


    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        UsuarioController instance = new UsuarioController();
        ArrayList<Usuario> expResult = new ArrayList<Usuario>();
        List<Usuario> result = instance.getUsuarios();
        assertEquals(expResult, result);
    }


    @Test
    public void testSetUsuarios() {
        System.out.println("setUsuarios");
        List<Usuario> usuarios = null;
        UsuarioController instance = new UsuarioController();
        instance.setUsuarios(usuarios);
    }
    
}
