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
@Table(name = "maganfir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Maganfir.findAll", query = "SELECT m FROM Maganfir m")
    , @NamedQuery(name = "Maganfir.findByIdMagAnFir", query = "SELECT m FROM Maganfir m WHERE m.idMagAnFir = :idMagAnFir")
    , @NamedQuery(name = "Maganfir.findByAdi", query = "SELECT m FROM Maganfir m WHERE m.adi = :adi")
    , @NamedQuery(name = "Maganfir.findByUnvan", query = "SELECT m FROM Maganfir m WHERE m.unvan = :unvan")
    , @NamedQuery(name = "Maganfir.findByTelefon", query = "SELECT m FROM Maganfir m WHERE m.telefon = :telefon")
    , @NamedQuery(name = "Maganfir.findByPairentId", query = "SELECT m FROM Maganfir m WHERE m.pairentId = :pairentId")})
public class Maganfir implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMagAnFir")
    private Integer idMagAnFir;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @Column(name = "Unvan")
    private String unvan;
    @Basic(optional = false)
    @Column(name = "Telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "PairentId")
    private String pairentId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFirma", fetch = FetchType.LAZY)
    private Collection<Kreditor> kreditorCollection;
    @JoinColumn(name = "idMembers", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMagazaVeren", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMagazaAlan", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMagaza", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection;

    public Maganfir() {
    }

    public Maganfir(Integer idMagAnFir) {
        this.idMagAnFir = idMagAnFir;
    }

    public Maganfir(Integer idMagAnFir, String adi, String unvan, String telefon, String pairentId) {
        this.idMagAnFir = idMagAnFir;
        this.adi = adi;
        this.unvan = unvan;
        this.telefon = telefon;
        this.pairentId = pairentId;
    }

    public Integer getIdMagAnFir() {
        return idMagAnFir;
    }

    public void setIdMagAnFir(Integer idMagAnFir) {
        this.idMagAnFir = idMagAnFir;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getPairentId() {
        return pairentId;
    }

    public void setPairentId(String pairentId) {
        this.pairentId = pairentId;
    }

    @XmlTransient
    public Collection<Kreditor> getKreditorCollection() {
        return kreditorCollection;
    }

    public void setKreditorCollection(Collection<Kreditor> kreditorCollection) {
        this.kreditorCollection = kreditorCollection;
    }

    public Members getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(Members idMembers) {
        this.idMembers = idMembers;
    }

    @XmlTransient
    public Collection<Magazamubadile> getMagazamubadileCollection() {
        return magazamubadileCollection;
    }

    public void setMagazamubadileCollection(Collection<Magazamubadile> magazamubadileCollection) {
        this.magazamubadileCollection = magazamubadileCollection;
    }

    @XmlTransient
    public Collection<Magazamubadile> getMagazamubadileCollection1() {
        return magazamubadileCollection1;
    }

    public void setMagazamubadileCollection1(Collection<Magazamubadile> magazamubadileCollection1) {
        this.magazamubadileCollection1 = magazamubadileCollection1;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection() {
        return malsatisgeriqayCollection;
    }

    public void setMalsatisgeriqayCollection(Collection<Malsatisgeriqay> malsatisgeriqayCollection) {
        this.malsatisgeriqayCollection = malsatisgeriqayCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMagAnFir != null ? idMagAnFir.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maganfir)) {
            return false;
        }
        Maganfir other = (Maganfir) object;
        if ((this.idMagAnFir == null && other.idMagAnFir != null) || (this.idMagAnFir != null && !this.idMagAnFir.equals(other.idMagAnFir))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Maganfir[ idMagAnFir=" + idMagAnFir + " ]";
    }
    
}
