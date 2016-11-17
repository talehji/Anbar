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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdFirma", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idFirma = :idFirma")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdMallar", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idMallar = :idMallar")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdAnbar", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idAnbar = :idAnbar")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdProperties", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idProperties = :idProperties")
    , @NamedQuery(name = "Malalisqeyiqayt.findByMiqdari", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.miqdari = :miqdari")
    , @NamedQuery(name = "Malalisqeyiqayt.findByAlisQiymeti", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.alisQiymeti = :alisQiymeti")
    , @NamedQuery(name = "Malalisqeyiqayt.findByEdv", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.edv = :edv")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdKassaAlisQIyCem", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idKassaAlisQIyCem = :idKassaAlisQIyCem")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdKassaCemEDV", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idKassaCemEDV = :idKassaCemEDV")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdMembersQebul", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idMembersQebul = :idMembersQebul")
    , @NamedQuery(name = "Malalisqeyiqayt.findByInvoysNo", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.invoysNo = :invoysNo")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdMembersSenedYigan", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idMembersSenedYigan = :idMembersSenedYigan")
    , @NamedQuery(name = "Malalisqeyiqayt.findByIdMembersTesdiqEden", query = "SELECT m FROM Malalisqeyiqayt m WHERE m.idMembersTesdiqEden = :idMembersTesdiqEden")})
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
    @Column(name = "idFirma")
    private int idFirma;
    @Basic(optional = false)
    @Column(name = "idMallar")
    private int idMallar;
    @Basic(optional = false)
    @Column(name = "idAnbar")
    private int idAnbar;
    @Basic(optional = false)
    @Column(name = "idProperties")
    private int idProperties;
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
    @Column(name = "idKassaAlisQIyCem")
    private int idKassaAlisQIyCem;
    @Basic(optional = false)
    @Column(name = "idKassaCemEDV")
    private int idKassaCemEDV;
    @Basic(optional = false)
    @Column(name = "idMembersQebul")
    private int idMembersQebul;
    @Basic(optional = false)
    @Column(name = "InvoysNo")
    private String invoysNo;
    @Basic(optional = false)
    @Column(name = "idMembersSenedYigan")
    private int idMembersSenedYigan;
    @Basic(optional = false)
    @Column(name = "idMembersTesdiqEden")
    private int idMembersTesdiqEden;

    public Malalisqeyiqayt() {
    }

    public Malalisqeyiqayt(Integer idMalAlisQeyiQayt) {
        this.idMalAlisQeyiQayt = idMalAlisQeyiQayt;
    }

    public Malalisqeyiqayt(Integer idMalAlisQeyiQayt, Date tarix, int idFirma, int idMallar, int idAnbar, int idProperties, String miqdari, double alisQiymeti, double edv, int idKassaAlisQIyCem, int idKassaCemEDV, int idMembersQebul, String invoysNo, int idMembersSenedYigan, int idMembersTesdiqEden) {
        this.idMalAlisQeyiQayt = idMalAlisQeyiQayt;
        this.tarix = tarix;
        this.idFirma = idFirma;
        this.idMallar = idMallar;
        this.idAnbar = idAnbar;
        this.idProperties = idProperties;
        this.miqdari = miqdari;
        this.alisQiymeti = alisQiymeti;
        this.edv = edv;
        this.idKassaAlisQIyCem = idKassaAlisQIyCem;
        this.idKassaCemEDV = idKassaCemEDV;
        this.idMembersQebul = idMembersQebul;
        this.invoysNo = invoysNo;
        this.idMembersSenedYigan = idMembersSenedYigan;
        this.idMembersTesdiqEden = idMembersTesdiqEden;
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

    public int getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(int idFirma) {
        this.idFirma = idFirma;
    }

    public int getIdMallar() {
        return idMallar;
    }

    public void setIdMallar(int idMallar) {
        this.idMallar = idMallar;
    }

    public int getIdAnbar() {
        return idAnbar;
    }

    public void setIdAnbar(int idAnbar) {
        this.idAnbar = idAnbar;
    }

    public int getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(int idProperties) {
        this.idProperties = idProperties;
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

    public int getIdKassaAlisQIyCem() {
        return idKassaAlisQIyCem;
    }

    public void setIdKassaAlisQIyCem(int idKassaAlisQIyCem) {
        this.idKassaAlisQIyCem = idKassaAlisQIyCem;
    }

    public int getIdKassaCemEDV() {
        return idKassaCemEDV;
    }

    public void setIdKassaCemEDV(int idKassaCemEDV) {
        this.idKassaCemEDV = idKassaCemEDV;
    }

    public int getIdMembersQebul() {
        return idMembersQebul;
    }

    public void setIdMembersQebul(int idMembersQebul) {
        this.idMembersQebul = idMembersQebul;
    }

    public String getInvoysNo() {
        return invoysNo;
    }

    public void setInvoysNo(String invoysNo) {
        this.invoysNo = invoysNo;
    }

    public int getIdMembersSenedYigan() {
        return idMembersSenedYigan;
    }

    public void setIdMembersSenedYigan(int idMembersSenedYigan) {
        this.idMembersSenedYigan = idMembersSenedYigan;
    }

    public int getIdMembersTesdiqEden() {
        return idMembersTesdiqEden;
    }

    public void setIdMembersTesdiqEden(int idMembersTesdiqEden) {
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
