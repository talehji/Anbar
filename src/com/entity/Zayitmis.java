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
@Table(name = "zayitmis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zayitmis.findAll", query = "SELECT z FROM Zayitmis z")
    , @NamedQuery(name = "Zayitmis.findByIdZayItmis", query = "SELECT z FROM Zayitmis z WHERE z.idZayItmis = :idZayItmis")
    , @NamedQuery(name = "Zayitmis.findByTarix", query = "SELECT z FROM Zayitmis z WHERE z.tarix = :tarix")
    , @NamedQuery(name = "Zayitmis.findByMiqdari", query = "SELECT z FROM Zayitmis z WHERE z.miqdari = :miqdari")
    , @NamedQuery(name = "Zayitmis.findByDaxiliSenedNo", query = "SELECT z FROM Zayitmis z WHERE z.daxiliSenedNo = :daxiliSenedNo")
    , @NamedQuery(name = "Zayitmis.findByQeyd", query = "SELECT z FROM Zayitmis z WHERE z.qeyd = :qeyd")})
public class Zayitmis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idZayItmis")
    private Integer idZayItmis;
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
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Properties idProperties;
    @JoinColumn(name = "idMembersSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersSenedYigan;
    @JoinColumn(name = "idMembersTesdiqEden", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersTesdiqEden;

    public Zayitmis() {
    }

    public Zayitmis(Integer idZayItmis) {
        this.idZayItmis = idZayItmis;
    }

    public Zayitmis(Integer idZayItmis, Date tarix, String miqdari, String daxiliSenedNo, String qeyd) {
        this.idZayItmis = idZayItmis;
        this.tarix = tarix;
        this.miqdari = miqdari;
        this.daxiliSenedNo = daxiliSenedNo;
        this.qeyd = qeyd;
    }

    public Integer getIdZayItmis() {
        return idZayItmis;
    }

    public void setIdZayItmis(Integer idZayItmis) {
        this.idZayItmis = idZayItmis;
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

    public Properties getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Properties idProperties) {
        this.idProperties = idProperties;
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
        hash += (idZayItmis != null ? idZayItmis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zayitmis)) {
            return false;
        }
        Zayitmis other = (Zayitmis) object;
        if ((this.idZayItmis == null && other.idZayItmis != null) || (this.idZayItmis != null && !this.idZayItmis.equals(other.idZayItmis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Zayitmis[ idZayItmis=" + idZayItmis + " ]";
    }
    
}
