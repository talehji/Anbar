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
@Table(name = "properties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Properties.findAll", query = "SELECT p FROM Properties p")
    , @NamedQuery(name = "Properties.findByIdProperties", query = "SELECT p FROM Properties p WHERE p.idProperties = :idProperties")
    , @NamedQuery(name = "Properties.findByAdi", query = "SELECT p FROM Properties p WHERE p.adi = :adi")
    , @NamedQuery(name = "Properties.findByPairentId", query = "SELECT p FROM Properties p WHERE p.pairentId = :pairentId")})
public class Properties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProperties")
    private Integer idProperties;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @Column(name = "PairentId")
    private int pairentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Malalisqeyiqayt> malalisqeyiqaytCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Mallar> mallarCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Members> membersCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProperties", fetch = FetchType.LAZY)
    private Collection<Zayitmis> zayitmisCollection;

    public Properties() {
    }

    public Properties(Integer idProperties) {
        this.idProperties = idProperties;
    }

    public Properties(Integer idProperties, String adi, int pairentId) {
        this.idProperties = idProperties;
        this.adi = adi;
        this.pairentId = pairentId;
    }

    public Integer getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Integer idProperties) {
        this.idProperties = idProperties;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getPairentId() {
        return pairentId;
    }

    public void setPairentId(int pairentId) {
        this.pairentId = pairentId;
    }

    @XmlTransient
    public Collection<Magazamubadile> getMagazamubadileCollection() {
        return magazamubadileCollection;
    }

    public void setMagazamubadileCollection(Collection<Magazamubadile> magazamubadileCollection) {
        this.magazamubadileCollection = magazamubadileCollection;
    }

    @XmlTransient
    public Collection<Malalisqeyiqayt> getMalalisqeyiqaytCollection() {
        return malalisqeyiqaytCollection;
    }

    public void setMalalisqeyiqaytCollection(Collection<Malalisqeyiqayt> malalisqeyiqaytCollection) {
        this.malalisqeyiqaytCollection = malalisqeyiqaytCollection;
    }

    @XmlTransient
    public Collection<Mallar> getMallarCollection() {
        return mallarCollection;
    }

    public void setMallarCollection(Collection<Mallar> mallarCollection) {
        this.mallarCollection = mallarCollection;
    }

    @XmlTransient
    public Collection<Members> getMembersCollection() {
        return membersCollection;
    }

    public void setMembersCollection(Collection<Members> membersCollection) {
        this.membersCollection = membersCollection;
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
        hash += (idProperties != null ? idProperties.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Properties)) {
            return false;
        }
        Properties other = (Properties) object;
        if ((this.idProperties == null && other.idProperties != null) || (this.idProperties != null && !this.idProperties.equals(other.idProperties))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Properties[ idProperties=" + idProperties + " ]";
    }
    
}
