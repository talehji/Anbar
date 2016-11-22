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
@Table(name = "malalisqeyiqayt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malalisqeyiqayt.findAll", query = "SELECT m FROM Malalisqeyiqayt m")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdMalAlisQeyiQayt", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idMalAlisQeyiQayt = :idMalAlisQeyiQayt")
    , @NamedQuery(name = "Malalisqeyiqayt.findByTarix", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.tarix = :tarix")
    , @NamedQuery(name = "Malalisqeyiqayt.findByMiqdari", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.miqdari = :miqdari")
    , @NamedQuery(name = "Malalisqeyiqayt.findByAlisQiymeti", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.alisQiymeti = :alisQiymeti")
    , @NamedQuery(name = "Malalisqeyiqayt.findByEdv", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.edv = :edv")
    , @NamedQuery(name = "Malalisqeyiqayt.findByInvoysNo", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.invoysNo = :invoysNo")
    , @NamedQuery(name = "Malalisqeyiqayt.findByPairentid", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.pairentid = :pairentid")})
public class Malalisqeyiqayt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMalAlisQeyiQayt")
    private Integer idMalAlisQeyiQayt;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @Basic(optional = false)
    @Column(name = "Miqdari")
    private String miqdari;
    @Basic(optional = false)
    @Column(name = "AlisQiymeti")
    private double alisQiymeti;
    @Basic(optional = false)
    @Column(name = "EDV")
    private double edv;
    @Basic(optional = false)
    @Column(name = "InvoysNo")
    private String invoysNo;
    @Basic(optional = false)
    @Column(name = "Pairentid")
    private int pairentid;
    @JoinColumn(name = "idFirma", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maganfir idFirma;
    @JoinColumn(name = "idMallar", referencedColumnName = "idMallar")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Mallar idMallar;
    @JoinColumn(name = "idAnbar", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Maganfir idAnbar;
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Properties idProperties;
    @JoinColumn(name = "idKassaAlisQIyCem", referencedColumnName = "idKassa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kassa idKassaAlisQIyCem;
    @JoinColumn(name = "idKassaCemEDV", referencedColumnName = "idKassa")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Kassa idKassaCemEDV;
    @JoinColumn(name = "idMembersQebul", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersQebul;
    @JoinColumn(name = "idMembersSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersSenedYigan;
    @JoinColumn(name = "idMembersTesdiqEden", referencedColumnName = "idMembers")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Members idMembersTesdiqEden;

    public Malalisqeyiqayt() {
    }

    public Malalisqeyiqayt(Integer idMalAlisQeyiQayt) {
        this.idMalAlisQeyiQayt = idMalAlisQeyiQayt;
    }

    public Malalisqeyiqayt(Integer idMalAlisQeyiQayt, Date tarix, String miqdari, double alisQiymeti, double edv, String invoysNo, int pairentid) {
        this.idMalAlisQeyiQayt = idMalAlisQeyiQayt;
        this.tarix = tarix;
        this.miqdari = miqdari;
        this.alisQiymeti = alisQiymeti;
        this.edv = edv;
        this.invoysNo = invoysNo;
        this.pairentid = pairentid;
    }

    public Integer getIdMalAlisQeyiQayt() {
        return idMalAlisQeyiQayt;
    }

    public void setIdMalAlisQeyiQayt(Integer idMalAlisQeyiQayt) {
        this.idMalAlisQeyiQayt = idMalAlisQeyiQayt;
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

    public double getAlisQiymeti() {
        return alisQiymeti;
    }

    public void setAlisQiymeti(double alisQiymeti) {
        this.alisQiymeti = alisQiymeti;
    }

    public double getEdv() {
        return edv;
    }

    public void setEdv(double edv) {
        this.edv = edv;
    }

    public String getInvoysNo() {
        return invoysNo;
    }

    public void setInvoysNo(String invoysNo) {
        this.invoysNo = invoysNo;
    }

    public int getPairentid() {
        return pairentid;
    }

    public void setPairentid(int pairentid) {
        this.pairentid = pairentid;
    }

    public Maganfir getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(Maganfir idFirma) {
        this.idFirma = idFirma;
    }

    public Mallar getIdMallar() {
        return idMallar;
    }

    public void setIdMallar(Mallar idMallar) {
        this.idMallar = idMallar;
    }

    public Maganfir getIdAnbar() {
        return idAnbar;
    }

    public void setIdAnbar(Maganfir idAnbar) {
        this.idAnbar = idAnbar;
    }

    public Properties getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Properties idProperties) {
        this.idProperties = idProperties;
    }

    public Kassa getIdKassaAlisQIyCem() {
        return idKassaAlisQIyCem;
    }

    public void setIdKassaAlisQIyCem(Kassa idKassaAlisQIyCem) {
        this.idKassaAlisQIyCem = idKassaAlisQIyCem;
    }

    public Kassa getIdKassaCemEDV() {
        return idKassaCemEDV;
    }

    public void setIdKassaCemEDV(Kassa idKassaCemEDV) {
        this.idKassaCemEDV = idKassaCemEDV;
    }

    public Members getIdMembersQebul() {
        return idMembersQebul;
    }

    public void setIdMembersQebul(Members idMembersQebul) {
        this.idMembersQebul = idMembersQebul;
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
        hash += (idMalAlisQeyiQayt != null ? idMalAlisQeyiQayt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malalisqeyiqayt)) {
            return false;
        }
        Malalisqeyiqayt other = (Malalisqeyiqayt) object;
        if ((this.idMalAlisQeyiQayt == null && other.idMalAlisQeyiQayt != null) || (this.idMalAlisQeyiQayt != null && !this.idMalAlisQeyiQayt.equals(other.idMalAlisQeyiQayt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Malalisqeyiqayt[ idMalAlisQeyiQayt=" + idMalAlisQeyiQayt + " ]";
    }
    
}
