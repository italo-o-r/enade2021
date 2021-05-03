package com.mycompany.enadeitalo2021.dao;



import java.util.List;
import enadeitalo2021.util.PersistenceUtil;
import java.io.Serializable;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author COREI7
 */

public abstract class UniversalDAO<U, I extends Serializable> {
    
    protected EntityManager entityManager = PersistenceUtil.getEntityManager();
    
    private Class<U> classe;
    
    public static UniversalDAO universalDAO;
    
    protected UniversalDAO(){
        
    }
    
    protected UniversalDAO(Class<U> persistedClass) {
        this();
        this.classe = persistedClass;
        entityManager = PersistenceUtil.getEntityManager();
    }
    
    public U merge(U entity) {
        EntityTransaction ent = entityManager.getTransaction();
        try{
            ent.begin();
            entity = entityManager.merge(entity);
            entityManager.flush();
            ent.commit();
        } catch (Exception e) {
            ent.rollback();
        }
        return entity;
    }
    
    
    
    
    public U buscarDao(I id) {
        return entityManager.find(classe, id);
    }
    
    public void removerDao(I id) {
        
        U entity = buscarDao(id);
        EntityTransaction ent = entityManager.getTransaction();
        
        try {
            ent.begin();
            U mergedEntity = entityManager.merge(entity);
            entityManager.remove(mergedEntity);
            entityManager.flush();
            
            ent.commit();
        } catch (Exception e) {
            ent.rollback();
        }
    }
    
    public List<U> buscarTodos(){
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<U> query = builder.createQuery(classe);
        
        query.from(classe);
        return entityManager.createQuery(query).getResultList();
    }
      
    
    public void removerTodos(){
        EntityTransaction ent = entityManager.getTransaction();
        
        try {
            ent.begin();
            entityManager.createQuery("DELETE FROM " + classe.getSimpleName()).executeUpdate();
            entityManager.flush();
            ent.commit();
        } catch (Exception e) {
            ent.rollback();
        }
    }
    
}
