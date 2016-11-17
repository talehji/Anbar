/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pallas
 */
@Entity
@Table(name = "kassa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kassa.findAll", query = "SELECT k FROM Kassa k")
    , @NamedQuery(name = "Kassa.findByIdKassa", query = "SELECT k FROM Kassa k WHERE k.idKassa = :idKassa")
    , @NamedQuery(name = "Kassa.findByTarix", query = "SELECT k FROM Kassa k WHERE k.tarix = :tarix")
    , @NamedQuery(name = "Kassa.findByMedaxil", query = "SELECT k FROM Kassa k WHERE k.medaxil = :medaxil")
    , @NamedQuery(name = "Kassa.findByMexaric", query = "SELECT k FROM Kassa k WHERE k.mexaric = :mexaric")
    , @NamedQuery(name = "Kassa.findByPairentId", query = "SELECT k FROM Kassa k WHERE k.pairentId = :pairentId")
    , @NamedQuery(name = "Kassa.findByInsertId", query = "SELECT k FROM Kassa k WHERE k.insertId = :insertId")
    , @NamedQuery(name = "Kassa.findByQeyd", query = "SELECT k FROM Kassa k WHERE k.qeyd = :qeyd")})
public class Kassa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idKassa")
    private Integer idKassa;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @Basic(optional = false)
    @Column(name = "Medaxil")
    private double medaxil;
    @Basic(optional = false)
    @Column(name = "Mexaric")
    private double mexaric;
    @Basic(optional = false)
    @Column(name = "PairentId")
    private String pairentId;
    @Basic(optional = false)
    @Column(name = "InsertId")
    private String insertId;
    @Basic(optional = false)
    @Column(name = "Qeyd")
    private String qeyd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKassa", fetch = FetchType.LAZY)
    private Collection<Kreditor> kreditorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKassa", fetch = FetchType.LAZY)
    private Collection<Debitor> debitorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKassaSatis", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKassaEDV", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection1;

    public Kassa() {
    }

    public Kassa(Integer idKassa) {
        this.idKassa = idKassa;
    }

    public Kassa(Integer idKassa, Date tarix, double medaxil, double mexaric, String pairentId, String insertId, String qeyd) {
        this.idKassa = idKassa;
        this.tarix = tarix;
        this.medaxil = medaxil;
        this.mexaric = mexaric;
        this.pairentId = pairentId;
        this.insertId = insertId;
        this.qeyd = qeyd;
    }

    public Integer getIdKassa() {
        return idKassa;
    }

    public void setIdKassa(Integer idKassa) {
        this.idKassa = idKassa;
    }

    public Date getTarix() {
        return tarix;
    }

    public void setTarix(Date tarix) {
        this.tarix = tarix;
    }

    public double getMedaxil() {
        return medaxil;
    }

    public void setMedaxil(double medaxil) {
        this.medaxil = medaxil;
    }

    public double getMexaric() {
        return mexaric;
    }

    public void setMexaric(double mexaric) {
        this.mexaric = mexaric;
    }

    public String getPairentId() {
        return pairentId;
    }

    public void setPairentId(String pairentId) {
        this.pairentId = pairentId;
    }

    public String getInsertId() {
        return insertId;
    }

    public void setInsertId(String insertId) {
        this.insertId = insertId;
    }

    public String getQeyd() {
        return qeyd;
    }

    public void setQeyd(String qeyd) {
        this.qeyd = qeyd;
    }

    @XmlTransient
    public Collection<Kreditor> getKreditorCollection() {
        return kreditorCollection;
    }

    public void setKreditorCollection(Collection<Kreditor> kreditorCollection) {
        this.kreditorCollection = kreditorCollection;
    }

    @XmlTransient
    public Collection<Debitor> getDebitorCollection() {
        return debitorCollection;
    }

    public void setDebitorCollection(Collection<Debitor> debitorCollection) {
        this.debitorCollection = debitorCollection;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection() {
        return malsatisgeriqayCollection;
    }

    public void setMalsatisgeriqayCollection(Collection<Malsatisgeriqay> malsatisgeriqayCollection) {
        this.malsatisgeriqayCollection = malsatisgeriqayCollection;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection1() {
        return malsatisgeriqayCollection1;
    }

    public void setMalsatisgeriqayCollection1(Collection<Malsatisgeriqay> malsatisgeriqayCollection1) {
        this.malsatisgeriqayCollection1 = malsatisgeriqayCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKassa != null ? idKassa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kassa)) {
            return false;
        }
        Kassa other = (Kassa) object;
        if ((this.idKassa == null && other.idKassa != null) || (this.idKassa != null && !this.idKassa.equals(other.idKassa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Kassa[ idKassa=" + idKassa + " ]";
    }
    
}
