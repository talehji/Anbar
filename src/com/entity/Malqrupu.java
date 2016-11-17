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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "malqrupu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malqrupu.findAll", query = "SELECT m FROM Malqrupu m")
    , @NamedQuery(name = "Malqrupu.findByIdMalQrupu", query = "SELECT m FROM Malqrupu m WHERE m.idMalQrupu = :idMalQrupu")
    , @NamedQuery(name = "Malqrupu.findByAdi", query = "SELECT m FROM Malqrupu m WHERE m.adi = :adi")})
public class Malqrupu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMalQrupu")
    private Integer idMalQrupu;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMalQrupu")
    private Collection<Malnovu> malnovuCollection;
    @JoinColumn(name = "idMalSinfi", referencedColumnName = "idMalSinfi")
    @ManyToOne(optional = false)
    private Malsinfi idMalSinfi;

    public Malqrupu() {
    }

    public Malqrupu(Integer idMalQrupu) {
        this.idMalQrupu = idMalQrupu;
    }

    public Malqrupu(Integer idMalQrupu, String adi) {
        this.idMalQrupu = idMalQrupu;
        this.adi = adi;
    }

    public Integer getIdMalQrupu() {
        return idMalQrupu;
    }

    public void setIdMalQrupu(Integer idMalQrupu) {
        this.idMalQrupu = idMalQrupu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @XmlTransient
    public Collection<Malnovu> getMalnovuCollection() {
        return malnovuCollection;
    }

    public void setMalnovuCollection(Collection<Malnovu> malnovuCollection) {
        this.malnovuCollection = malnovuCollection;
    }

    public Malsinfi getIdMalSinfi() {
        return idMalSinfi;
    }

    public void setIdMalSinfi(Malsinfi idMalSinfi) {
        this.idMalSinfi = idMalSinfi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMalQrupu != null ? idMalQrupu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malqrupu)) {
            return false;
        }
        Malqrupu other = (Malqrupu) object;
        if ((this.idMalQrupu == null && other.idMalQrupu != null) || (this.idMalQrupu != null && !this.idMalQrupu.equals(other.idMalQrupu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Malqrupu[ idMalQrupu=" + idMalQrupu + " ]";
    }
    
}
