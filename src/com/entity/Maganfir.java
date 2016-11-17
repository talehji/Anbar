/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
    @JoinColumn(name = "idMembers", referencedColumnName = "idMembers")
    @ManyToOne(optional = false)
    private Members idMembers;

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

    public Members getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(Members idMembers) {
        this.idMembers = idMembers;
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
