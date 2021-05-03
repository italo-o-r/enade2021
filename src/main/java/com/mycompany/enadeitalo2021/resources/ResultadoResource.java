/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.ResultadoDAO;
import com.mycompany.enadeitalo2021.model.Resultado;
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



@Path("resultado")
public class ResultadoResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosResultado")
    
    public List<Resultado> todosResultado(){
        List<Resultado> resultado = ResultadoDAO.getInstance().buscarTodos();
        
        return resultado;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getResultado/(id)")
    
    public Resultado getResultado(@PathParam("id") Integer id) {
        return ResultadoDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Resultado resultado = new Resultado();
        ResultadoDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Resultado resultado) {
        Resultado res = new Resultado();
        
        res.setIdResultado(resultado.getIdResultado());
        ResultadoDAO.getInstance().merge(res);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Resultado resultado) {
        Resultado res = new Resultado();
        
        res.setIdResultado(resultado.getIdResultado());
        res.setValorObtido(resultado.getValorObtido());
        
        ResultadoDAO.getInstance().merge(res);
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}
