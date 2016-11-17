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
@Table(name = "debitor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Debitor.findAll", query = "SELECT d FROM Debitor d")
    , @NamedQuery(name = "Debitor.findByIdDebitor", query = "SELECT d FROM Debitor d WHERE d.idDebitor = :idDebitor")
    , @NamedQuery(name = "Debitor.findByTarix", query = "SELECT d FROM Debitor d WHERE d.tarix = :tarix")
    , @NamedQuery(name = "Debitor.findByDaxiliSenedNo", query = "SELECT d FROM Debitor d WHERE d.daxiliSenedNo = :daxiliSenedNo")
    , @NamedQuery(name = "Debitor.findByQeyd", query = "SELECT d FROM Debitor d WHERE d.qeyd = :qeyd")})
public class Debitor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDebitor")
    private Integer idDebitor;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @Basic(optional = false)
    @Column(name = "DaxiliSenedNo")
    private String daxiliSenedNo;
    @Basic(optional = false)
    @Column(name = "Qeyd")
    private String qeyd;
    @JoinColumn(name = "idMembers", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembers;
    @JoinColumn(name = "idKassa", referencedColumnName = "idKassa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kassa idKassa;
    @JoinColumn(name = "idMembersAlan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersAlan;
    @JoinColumn(name = "idMembersSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersSenedYigan;
    @JoinColumn(name = "idMembersTesdiqEden", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersTesdiqEden;

    public Debitor() {
    }

    public Debitor(Integer idDebitor) {
        this.idDebitor = idDebitor;
    }

    public Debitor(Integer idDebitor, Date tarix, String daxiliSenedNo, String qeyd) {
        this.idDebitor = idDebitor;
        this.tarix = tarix;
        this.daxiliSenedNo = daxiliSenedNo;
        this.qeyd = qeyd;
    }

    public Integer getIdDebitor() {
        return idDebitor;
    }

    public void setIdDebitor(Integer idDebitor) {
        this.idDebitor = idDebitor;
    }

    public Date getTarix() {
        return tarix;
    }

    public void setTarix(Date tarix) {
        this.tarix = tarix;
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

    public Members getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(Members idMembers) {
        this.idMembers = idMembers;
    }

    public Kassa getIdKassa() {
        return idKassa;
    }

    public void setIdKassa(Kassa idKassa) {
        this.idKassa = idKassa;
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
        hash += (idDebitor != null ? idDebitor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Debitor)) {
            return false;
        }
        Debitor other = (Debitor) object;
        if ((this.idDebitor == null && other.idDebitor != null) || (this.idDebitor != null && !this.idDebitor.equals(other.idDebitor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Debitor[ idDebitor=" + idDebitor + " ]";
    }
    
}
