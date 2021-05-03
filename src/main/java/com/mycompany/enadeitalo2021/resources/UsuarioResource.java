/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.UsuarioDAO;
import com.mycompany.enadeitalo2021.model.Usuario;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;



@Path("usuario")
public class UsuarioResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosUsuario")
    
    public List<Usuario> todosUsuario(){
        List<Usuario> usuario = UsuarioDAO.getInstance().buscarTodos();
        
        return usuario;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getUsuario/(id)")
    
    public Usuario getUsuario(@PathParam("id") Integer id) {
        return UsuarioDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Usuario usuario = new Usuario(id);
        UsuarioDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Usuario usuario) {
        Usuario usu = new Usuario();
        
        usu.setIdUsuario(usuario.getIdUsuario());
        UsuarioDAO.getInstance().merge(usu);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Usuario usuario) {
        Usuario usu = new Usuario();
        
        usu.setIdUsuario(usuario.getIdUsuario());
        usu.setNomeUsuario(usuario.getNomeUsuario());
        usu.setEmailUsuario(usuario.getEmailUsuario());
        usu.setSenhaUsuario(usuario.getSenhaUsuario());
        
        
        UsuarioDAO.getInstance().merge(usu).toString();
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}