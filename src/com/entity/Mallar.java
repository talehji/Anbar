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
@Table(name = "mallar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mallar.findAll", query = "SELECT m FROM Mallar m")
    , @NamedQuery(name = "Mallar.findByIdMallar", query = "SELECT m FROM Mallar m WHERE m.idMallar = :idMallar")
    , @NamedQuery(name = "Mallar.findByAdi", query = "SELECT m FROM Mallar m WHERE m.adi = :adi")
    , @NamedQuery(name = "Mallar.findByMiqdari", query = "SELECT m FROM Mallar m WHERE m.miqdari = :miqdari")})
public class Mallar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMallar")
    private Integer idMallar;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @Column(name = "Miqdari")
    private String miqdari;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMallar", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection;
    @JoinColumn(name = "idMalNovu", referencedColumnName = "idMalNovu")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Malnovu idMalNovu;
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Properties idProperties;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMallar", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMallar", fetch = FetchType.LAZY)
    private Collection<Zayitmis> zayitmisCollection;

    public Mallar() {
    }

    public Mallar(Integer idMallar) {
        this.idMallar = idMallar;
    }

    public Mallar(Integer idMallar, String adi, String miqdari) {
        this.idMallar = idMallar;
        this.adi = adi;
        this.miqdari = miqdari;
    }

    public Integer getIdMallar() {
        return idMallar;
    }

    public void setIdMallar(Integer idMallar) {
        this.idMallar = idMallar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getMiqdari() {
        return miqdari;
    }

    public void setMiqdari(String miqdari) {
        this.miqdari = miqdari;
    }

    @XmlTransient
    public Collection<Magazamubadile> getMagazamubadileCollection() {
        return magazamubadileCollection;
    }

    public void setMagazamubadileCollection(Collection<Magazamubadile> magazamubadileCollection) {
        this.magazamubadileCollection = magazamubadileCollection;
    }

    public Malnovu getIdMalNovu() {
        return idMalNovu;
    }

    public void setIdMalNovu(Malnovu idMalNovu) {
        this.idMalNovu = idMalNovu;
    }

    public Properties getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Properties idProperties) {
        this.idProperties = idProperties;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection() {
        return malsatisgeriqayCollection;
    }

    public void setMalsatisgeriqayCollection(Collection<Malsatisgeriqay> malsatisgeriqayCollection) {
        this.malsatisgeriqayCollection = malsatisgeriqayCollection;
    }

    @XmlTransient
    public Collection<Zayitmis> getZayitmisCollection() {
        return zayitmisCollection;
    }

    public void setZayitmisCollection(Collection<Zayitmis> zayitmisCollection) {
        this.zayitmisCollection = zayitmisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMallar != null ? idMallar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mallar)) {
            return false;
        }
        Mallar other = (Mallar) object;
        if ((this.idMallar == null && other.idMallar != null) || (this.idMallar != null && !this.idMallar.equals(other.idMallar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Mallar[ idMallar=" + idMallar + " ]";
    }
    
}
