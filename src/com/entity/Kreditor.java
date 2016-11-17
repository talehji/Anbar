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
@Table(name = "kreditor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kreditor.findAll", query = "SELECT k FROM Kreditor k")
    , @NamedQuery(name = "Kreditor.findByIdKreditor", query = "SELECT k FROM Kreditor k WHERE k.idKreditor = :idKreditor")
    , @NamedQuery(name = "Kreditor.findByTarix", query = "SELECT k FROM Kreditor k WHERE k.tarix = :tarix")
    , @NamedQuery(name = "Kreditor.findByDaxiliSenedNo", query = "SELECT k FROM Kreditor k WHERE k.daxiliSenedNo = :daxiliSenedNo")
    , @NamedQuery(name = "Kreditor.findByQeyd", query = "SELECT k FROM Kreditor k WHERE k.qeyd = :qeyd")})
public class Kreditor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idKreditor")
    private Integer idKreditor;
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
    @JoinColumn(name = "idFirma", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maganfir idFirma;
    @JoinColumn(name = "idKassa", referencedColumnName = "idKassa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kassa idKassa;
    @JoinColumn(name = "idMembersOdeyen", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersOdeyen;
    @JoinColumn(name = "idMembersSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersSenedYigan;
    @JoinColumn(name = "idMembersTesdiqEden", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersTesdiqEden;

    public Kreditor() {
    }

    public Kreditor(Integer idKreditor) {
        this.idKreditor = idKreditor;
    }

    public Kreditor(Integer idKreditor, Date tarix, String daxiliSenedNo, String qeyd) {
        this.idKreditor = idKreditor;
        this.tarix = tarix;
        this.daxiliSenedNo = daxiliSenedNo;
        this.qeyd = qeyd;
    }

    public Integer getIdKreditor() {
        return idKreditor;
    }

    public void setIdKreditor(Integer idKreditor) {
        this.idKreditor = idKreditor;
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

    public Maganfir getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(Maganfir idFirma) {
        this.idFirma = idFirma;
    }

    public Kassa getIdKassa() {
        return idKassa;
    }

    public void setIdKassa(Kassa idKassa) {
        this.idKassa = idKassa;
    }

    public Members getIdMembersOdeyen() {
        return idMembersOdeyen;
    }

    public void setIdMembersOdeyen(Members idMembersOdeyen) {
        this.idMembersOdeyen = idMembersOdeyen;
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
        hash += (idKreditor != null ? idKreditor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kreditor)) {
            return false;
        }
        Kreditor other = (Kreditor) object;
        if ((this.idKreditor == null && other.idKreditor != null) || (this.idKreditor != null && !this.idKreditor.equals(other.idKreditor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Kreditor[ idKreditor=" + idKreditor + " ]";
    }
    
}
