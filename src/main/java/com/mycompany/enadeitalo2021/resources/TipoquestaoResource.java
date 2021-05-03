/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.TipoquestaoDAO;
import com.mycompany.enadeitalo2021.model.Tipoquestao;
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



@Path("tipoquestao")
public class TipoquestaoResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosTipoquestao")
    
    public List<Tipoquestao> todosTipoquestao(){
        List<Tipoquestao> tipoquestao = TipoquestaoDAO.getInstance().buscarTodos();
        
        return tipoquestao;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getTipousuario/(id)")
    
    public Tipoquestao getTipousuario(@PathParam("id") Integer id) {
        return TipoquestaoDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Tipoquestao tipoquestao = new Tipoquestao(id);
        TipoquestaoDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Tipoquestao tipoquestao) {
        Tipoquestao tpq = new Tipoquestao();
        
        tpq.setIdTipoQuestao(tipoquestao.getIdTipoQuestao());
        TipoquestaoDAO.getInstance().merge(tpq);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Tipoquestao tipoquestao) {
        Tipoquestao tpq = new Tipoquestao();
        
        tpq.setIdTipoQuestao(tipoquestao.getIdTipoQuestao());
        tpq.setNomeTipoQuestao(tipoquestao.getNomeTipoQuestao());
        TipoquestaoDAO.getInstance().merge(tpq).toString();
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}
