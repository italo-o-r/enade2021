/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.TipousuarioDAO;
import com.mycompany.enadeitalo2021.model.Tipousuario;
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



@Path("tipousuario")
public class TipousuarioResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosTipousuario")
    
    public List<Tipousuario> todosTipousuario(){
        List<Tipousuario> tipousuario = TipousuarioDAO.getInstance().buscarTodos();
        
        return tipousuario;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getTipousuario/(id)")
    
    public Tipousuario getTipousuario(@PathParam("id") Integer id) {
        return TipousuarioDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Tipousuario tipousuario = new Tipousuario(id);
        TipousuarioDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Tipousuario tipousuario) {
        Tipousuario tpu = new Tipousuario();
        
        tpu.setIdTipoUsuario(tipousuario.getIdTipoUsuario());
        TipousuarioDAO.getInstance().merge(tpu);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Tipousuario tipousuario) {
        Tipousuario tpu = new Tipousuario();
        
        tpu.setIdTipoUsuario(tipousuario.getIdTipoUsuario());
        tpu.setNomeTipoUsuario(tipousuario.getNomeTipoUsuario());
        TipousuarioDAO.getInstance().merge(tpu).toString();
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}
