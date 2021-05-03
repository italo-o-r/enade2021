/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enadeitalo2021.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author COREI7
 */
@Entity
@Table(name = "prova")
@NamedQueries({
    @NamedQuery(name = "Prova.findAll", query = "SELECT p FROM Prova p"),
    @NamedQuery(name = "Prova.findByIdprova", query = "SELECT p FROM Prova p WHERE p.idprova = :idprova"),
    @NamedQuery(name = "Prova.findByDataProva", query = "SELECT p FROM Prova p WHERE p.dataProva = :dataProva")})
public class Prova implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprova")
    private Integer idprova;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dataProva")
    @Temporal(TemporalType.DATE)
    private Date dataProva;
    @ManyToMany(mappedBy = "provaList")
    private List<Questao> questaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prova")
    private List<Resultado> resultadoList;

    public Prova() {
    }

    public Prova(Integer idprova) {
        this.idprova = idprova;
    }

    public Prova(Integer idprova, Date dataProva) {
        this.idprova = idprova;
        this.dataProva = dataProva;
    }

    public Integer getIdprova() {
        return idprova;
    }

    public void setIdprova(Integer idprova) {
        this.idprova = idprova;
    }

    public Date getDataProva() {
        return dataProva;
    }

    public void setDataProva(Date dataProva) {
        this.dataProva = dataProva;
    }

    public List<Questao> getQuestaoList() {
        return questaoList;
    }

    public void setQuestaoList(List<Questao> questaoList) {
        this.questaoList = questaoList;
    }

    public List<Resultado> getResultadoList() {
        return resultadoList;
    }

    public void setResultadoList(List<Resultado> resultadoList) {
        this.resultadoList = resultadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprova != null ? idprova.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prova)) {
            return false;
        }
        Prova other = (Prova) object;
        if ((this.idprova == null && other.idprova != null) || (this.idprova != null && !this.idprova.equals(other.idprova))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enadeitalo2021.model.Prova[ idprova=" + idprova + " ]";
    }
    
}
