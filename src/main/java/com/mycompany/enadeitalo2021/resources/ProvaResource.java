/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.ProvaDAO;
import com.mycompany.enadeitalo2021.model.Prova;
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



@Path("prova")
public class ProvaResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosProva")
    
    public List<Prova> todosProva(){
        List<Prova> prova = ProvaDAO.getInstance().buscarTodos();
        
        return prova;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getProva/(id)")
    
    public Prova getProva(@PathParam("id") Integer id) {
        return ProvaDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Prova prova = new Prova(id);
        ProvaDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Prova prova) {
        Prova p = new Prova();
        
        p.setIdprova(prova.getIdprova());
        ProvaDAO.getInstance().merge(p);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Prova prova) {
        Prova p = new Prova();
        
        p.setIdprova(prova.getIdprova());
        p.setDataProva(prova.getDataProva());
        ProvaDAO.getInstance().merge(p).toString();
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}
