/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.resources;

import com.mycompany.enadeitalo2021.dao.QuestaoDAO;
import com.mycompany.enadeitalo2021.model.Questao;
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



@Path("questao")
public class QuestaoResource {
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/todosquestao")
    
    public List<Questao> todosQuestao(){
        List<Questao> questao = QuestaoDAO.getInstance().buscarTodos();
        
        return questao;
    }
    
    @GET
    @Produces("application/json; charset=UTF-8")
    @Path("/getQuestao/(id)")
    
    public Questao getQuestao(@PathParam("id") Integer id) {
        return QuestaoDAO.getInstance().buscarDao(id);
    }
    
    @DELETE
    @Produces("application/json; charset=UTF-8")
    @Path("/excluir/(id)")
    
    public String excluir(@PathParam("id") Integer id) {
        Questao questao = new Questao(id);
        QuestaoDAO.getInstance().removerDao(id);
        
        return "O registro foi excluído.";
    }
    
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/cadastrar")
    
    public String cadastrar(Questao questao) {
        Questao q = new Questao();
        
        q.setIdQuestao(questao.getIdQuestao());
        QuestaoDAO.getInstance().merge(q);
        
        return "O registro foi cadastrado.";
    }
    
    @PUT
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    @Path("/alterar")
    
    public String alterar(Questao questao) {
        Questao q = new Questao();
        
        q.setIdQuestao(questao.getIdQuestao());
        q.setDescricaoQuestao(questao.getDescricaoQuestao());
        q.setAlternativaA(questao.getAlternativaA());
        q.setAlternativaB(questao.getAlternativaB());
        q.setAlternativaC(questao.getAlternativaC());
        q.setAlternativaD(questao.getAlternativaD());
        q.setAlternativaE(questao.getAlternativaE());
        q.setQuestaoCorreta(questao.getQuestaoCorreta());
        QuestaoDAO.getInstance().merge(q).toString();
        
        return "O registro foi cadastrado.";
    }
    
    @GET
    public Response ping(){
        return Response
                .ok("ping")
                .build();
    }
    
}