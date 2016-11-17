/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pallas
 */
@Entity
@Table(name = "malsinfi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malsinfi.findAll", query = "SELECT m FROM Malsinfi m")
    , @NamedQuery(name = "Malsinfi.findByIdMalSinfi", query = "SELECT m FROM Malsinfi m WHERE m.idMalSinfi = :idMalSinfi")
    , @NamedQuery(name = "Malsinfi.findByAdi", query = "SELECT m FROM Malsinfi m WHERE m.adi = :adi")})
public class Malsinfi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMalSinfi")
    private Integer idMalSinfi;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMalSinfi", fetch = FetchType.LAZY)
    private Collection<Malqrupu> malqrupuCollection;

    public Malsinfi() {
    }

    public Malsinfi(Integer idMalSinfi) {
        this.idMalSinfi = idMalSinfi;
    }

    public Malsinfi(Integer idMalSinfi, String adi) {
        this.idMalSinfi = idMalSinfi;
        this.adi = adi;
    }

    public Integer getIdMalSinfi() {
        return idMalSinfi;
    }

    public void setIdMalSinfi(Integer idMalSinfi) {
        this.idMalSinfi = idMalSinfi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @XmlTransient
    public Collection<Malqrupu> getMalqrupuCollection() {
        return malqrupuCollection;
    }

    public void setMalqrupuCollection(Collection<Malqrupu> malqrupuCollection) {
        this.malqrupuCollection = malqrupuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMalSinfi != null ? idMalSinfi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malsinfi)) {
            return false;
        }
        Malsinfi other = (Malsinfi) object;
        if ((this.idMalSinfi == null && other.idMalSinfi != null) || (this.idMalSinfi != null && !this.idMalSinfi.equals(other.idMalSinfi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Malsinfi[ idMalSinfi=" + idMalSinfi + " ]";
    }
    
}
