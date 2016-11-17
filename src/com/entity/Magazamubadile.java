/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pallas
 */
@Entity
@Table(name = "magazamubadile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Magazamubadile.findAll", query = "SELECT m FROM Magazamubadile m")
    , @NamedQuery(name = "Magazamubadile.findByIdMagazaMubadile", query = "SELECT m FROM Magazamubadile m WHERE m.idMagazaMubadile = :idMagazaMubadile")
    , @NamedQuery(name = "Magazamubadile.findByTarix", query = "SELECT m FROM Magazamubadile m WHERE m.tarix = :tarix")
    , @NamedQuery(name = "Magazamubadile.findByMiqdari", query = "SELECT m FROM Magazamubadile m WHERE m.miqdari = :miqdari")
    , @NamedQuery(name = "Magazamubadile.findByDaxiliSenedNo", query = "SELECT m FROM Magazamubadile m WHERE m.daxiliSenedNo = :daxiliSenedNo")
    , @NamedQuery(name = "Magazamubadile.findByQeyd", query = "SELECT m FROM Magazamubadile m WHERE m.qeyd = :qeyd")})
public class Magazamubadile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMagazaMubadile")
    private Integer idMagazaMubadile;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @Basic(optional = false)
    @Column(name = "Miqdari")
    private String miqdari;
    @Basic(optional = false)
    @Column(name = "DaxiliSenedNo")
    private String daxiliSenedNo;
    @Basic(optional = false)
    @Column(name = "Qeyd")
    private String qeyd;
    @JoinColumn(name = "idMallar", referencedColumnName = "idMallar")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Mallar idMallar;
    @JoinColumn(name = "idMagazaVeren", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maganfir idMagazaVeren;
    @JoinColumn(name = "idMagazaAlan", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maganfir idMagazaAlan;
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Properties idProperties;
    @JoinColumn(name = "idMembersVeren", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersVeren;
    @JoinColumn(name = "idMembersAlan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersAlan;
    @JoinColumn(name = "idMembersSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersSenedYigan;
    @JoinColumn(name = "idMembersTesdiqEden", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersTesdiqEden;

    public Magazamubadile() {
    }

    public Magazamubadile(Integer idMagazaMubadile) {
        this.idMagazaMubadile = idMagazaMubadile;
    }

    public Magazamubadile(Integer idMagazaMubadile, Date tarix, String miqdari, String daxiliSenedNo, String qeyd) {
        this.idMagazaMubadile = idMagazaMubadile;
        this.tarix = tarix;
        this.miqdari = miqdari;
        this.daxiliSenedNo = daxiliSenedNo;
        this.qeyd = qeyd;
    }

    public Integer getIdMagazaMubadile() {
        return idMagazaMubadile;
    }

    public void setIdMagazaMubadile(Integer idMagazaMubadile) {
        this.idMagazaMubadile = idMagazaMubadile;
    }

    public Date getTarix() {
        return tarix;
    }

    public void setTarix(Date tarix) {
        this.tarix = tarix;
    }

    public String getMiqdari() {
        return miqdari;
    }

    public void setMiqdari(String miqdari) {
        this.miqdari = miqdari;
    }

    public String getDaxiliSenedNo() {
        return daxiliSenedNo;
    }

    public void setDaxiliSenedNo(String daxiliSenedNo) {
        this.daxiliSenedNo = daxiliSenedNo;
    }

    public String getQeyd() {
        return qeyd;
    }

    public void setQeyd(String qeyd) {
        this.qeyd = qeyd;
    }

    public Mallar getIdMallar() {
        return idMallar;
    }

    public void setIdMallar(Mallar idMallar) {
        this.idMallar = idMallar;
    }

    public Maganfir getIdMagazaVeren() {
        return idMagazaVeren;
    }

    public void setIdMagazaVeren(Maganfir idMagazaVeren) {
        this.idMagazaVeren = idMagazaVeren;
    }

    public Maganfir getIdMagazaAlan() {
        return idMagazaAlan;
    }

    public void setIdMagazaAlan(Maganfir idMagazaAlan) {
        this.idMagazaAlan = idMagazaAlan;
    }

    public Properties getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Properties idProperties) {
        this.idProperties = idProperties;
    }

    public Members getIdMembersVeren() {
        return idMembersVeren;
    }

    public void setIdMembersVeren(Members idMembersVeren) {
        this.idMembersVeren = idMembersVeren;
    }

    public Members getIdMembersAlan() {
        return idMembersAlan;
    }

    public void setIdMembersAlan(Members idMembersAlan) {
        this.idMembersAlan = idMembersAlan;
    }

    public Members getIdMembersSenedYigan() {
        return idMembersSenedYigan;
    }

    public void setIdMembersSenedYigan(Members idMembersSenedYigan) {
        this.idMembersSenedYigan = idMembersSenedYigan;
    }

    public Members getIdMembersTesdiqEden() {
        return idMembersTesdiqEden;
    }

    public void setIdMembersTesdiqEden(Members idMembersTesdiqEden) {
        this.idMembersTesdiqEden = idMembersTesdiqEden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMagazaMubadile != null ? idMagazaMubadile.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magazamubadile)) {
            return false;
        }
        Magazamubadile other = (Magazamubadile) object;
        if ((this.idMagazaMubadile == null && other.idMagazaMubadile != null) || (this.idMagazaMubadile != null && !this.idMagazaMubadile.equals(other.idMagazaMubadile))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Magazamubadile[ idMagazaMubadile=" + idMagazaMubadile + " ]";
    }
    
}
