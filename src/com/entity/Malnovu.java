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
@Table(name = "malnovu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malnovu.findAll", query = "SELECT m FROM Malnovu m")
    , @NamedQuery(name = "Malnovu.findByIdMalNovu", query = "SELECT m FROM Malnovu m WHERE m.idMalNovu = :idMalNovu")
    , @NamedQuery(name = "Malnovu.findByAdi", query = "SELECT m FROM Malnovu m WHERE m.adi = :adi")})
public class Malnovu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMalNovu")
    private Integer idMalNovu;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @JoinColumn(name = "idMalQrupu", referencedColumnName = "idMalQrupu")
    @ManyToOne(optional = false)
    private Malqrupu idMalQrupu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMalNovu")
    private Collection<Mallar> mallarCollection;

    public Malnovu() {
    }

    public Malnovu(Integer idMalNovu) {
        this.idMalNovu = idMalNovu;
    }

    public Malnovu(Integer idMalNovu, String adi) {
        this.idMalNovu = idMalNovu;
        this.adi = adi;
    }

    public Integer getIdMalNovu() {
        return idMalNovu;
    }

    public void setIdMalNovu(Integer idMalNovu) {
        this.idMalNovu = idMalNovu;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public Malqrupu getIdMalQrupu() {
        return idMalQrupu;
    }

    public void setIdMalQrupu(Malqrupu idMalQrupu) {
        this.idMalQrupu = idMalQrupu;
    }

    @XmlTransient
    public Collection<Mallar> getMallarCollection() {
        return mallarCollection;
    }

    public void setMallarCollection(Collection<Mallar> mallarCollection) {
        this.mallarCollection = mallarCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMalNovu != null ? idMalNovu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malnovu)) {
            return false;
        }
        Malnovu other = (Malnovu) object;
        if ((this.idMalNovu == null && other.idMalNovu != null) || (this.idMalNovu != null && !this.idMalNovu.equals(other.idMalNovu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Malnovu[ idMalNovu=" + idMalNovu + " ]";
    }
    
}
