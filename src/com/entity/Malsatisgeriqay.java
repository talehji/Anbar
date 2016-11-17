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
@Table(name = "malsatisgeriqay")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malsatisgeriqay.findAll", query = "SELECT m FROM Malsatisgeriqay m")
    , @NamedQuery(name = "Malsatisgeriqay.findByIdMalSatisGeriQay", query = "SELECT m FROM Malsatisgeriqay m WHERE m.idMalSatisGeriQay = :idMalSatisGeriQay")
    , @NamedQuery(name = "Malsatisgeriqay.findByTarix", query = "SELECT m FROM Malsatisgeriqay m WHERE m.tarix = :tarix")
    , @NamedQuery(name = "Malsatisgeriqay.findByMiqdari", query = "SELECT m FROM Malsatisgeriqay m WHERE m.miqdari = :miqdari")
    , @NamedQuery(name = "Malsatisgeriqay.findBySatisQiymeti", query = "SELECT m FROM Malsatisgeriqay m WHERE m.satisQiymeti = :satisQiymeti")
    , @NamedQuery(name = "Malsatisgeriqay.findByEdv", query = "SELECT m FROM Malsatisgeriqay m WHERE m.edv = :edv")
    , @NamedQuery(name = "Malsatisgeriqay.findByQaimeNo", query = "SELECT m FROM Malsatisgeriqay m WHERE m.qaimeNo = :qaimeNo")
    , @NamedQuery(name = "Malsatisgeriqay.findByQeyd", query = "SELECT m FROM Malsatisgeriqay m WHERE m.qeyd = :qeyd")})
public class Malsatisgeriqay implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMalSatisGeriQay")
    private Integer idMalSatisGeriQay;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @Basic(optional = false)
    @Column(name = "Miqdari")
    private String miqdari;
    @Basic(optional = false)
    @Column(name = "SatisQiymeti")
    private String satisQiymeti;
    @Basic(optional = false)
    @Column(name = "EDV")
    private String edv;
    @Basic(optional = false)
    @Column(name = "QaimeNo")
    private String qaimeNo;
    @Basic(optional = false)
    @Column(name = "Qeyd")
    private String qeyd;
    @JoinColumn(name = "IdKassaSatis", referencedColumnName = "idKassa")
    @ManyToOne(optional = false)
    private Kassa idKassaSatis;
    @JoinColumn(name = "idKassaEDV", referencedColumnName = "idKassa")
    @ManyToOne(optional = false)
    private Kassa idKassaEDV;
    @JoinColumn(name = "idMembersSatanAlan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false)
    private Members idMembersSatanAlan;
    @JoinColumn(name = "IdMembesSenedYigan", referencedColumnName = "idMembers")
    @ManyToOne(optional = false)
    private Members idMembesSenedYigan;
    @JoinColumn(name = "idMagaza", referencedColumnName = "idMagAnFir")
    @ManyToOne(optional = false)
    private Maganfir idMagaza;
    @JoinColumn(name = "idMallar", referencedColumnName = "idMallar")
    @ManyToOne(optional = false)
    private Mallar idMallar;
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false)
    private Properties idProperties;

    public Malsatisgeriqay() {
    }

    public Malsatisgeriqay(Integer idMalSatisGeriQay) {
        this.idMalSatisGeriQay = idMalSatisGeriQay;
    }

    public Malsatisgeriqay(Integer idMalSatisGeriQay, Date tarix, String miqdari, String satisQiymeti, String edv, String qaimeNo, String qeyd) {
        this.idMalSatisGeriQay = idMalSatisGeriQay;
        this.tarix = tarix;
        this.miqdari = miqdari;
        this.satisQiymeti = satisQiymeti;
        this.edv = edv;
        this.qaimeNo = qaimeNo;
        this.qeyd = qeyd;
    }

    public Integer getIdMalSatisGeriQay() {
        return idMalSatisGeriQay;
    }

    public void setIdMalSatisGeriQay(Integer idMalSatisGeriQay) {
        this.idMalSatisGeriQay = idMalSatisGeriQay;
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

    public String getSatisQiymeti() {
        return satisQiymeti;
    }

    public void setSatisQiymeti(String satisQiymeti) {
        this.satisQiymeti = satisQiymeti;
    }

    public String getEdv() {
        return edv;
    }

    public void setEdv(String edv) {
        this.edv = edv;
    }

    public String getQaimeNo() {
        return qaimeNo;
    }

    public void setQaimeNo(String qaimeNo) {
        this.qaimeNo = qaimeNo;
    }

    public String getQeyd() {
        return qeyd;
    }

    public void setQeyd(String qeyd) {
        this.qeyd = qeyd;
    }

    public Kassa getIdKassaSatis() {
        return idKassaSatis;
    }

    public void setIdKassaSatis(Kassa idKassaSatis) {
        this.idKassaSatis = idKassaSatis;
    }

    public Kassa getIdKassaEDV() {
        return idKassaEDV;
    }

    public void setIdKassaEDV(Kassa idKassaEDV) {
        this.idKassaEDV = idKassaEDV;
    }

    public Members getIdMembersSatanAlan() {
        return idMembersSatanAlan;
    }

    public void setIdMembersSatanAlan(Members idMembersSatanAlan) {
        this.idMembersSatanAlan = idMembersSatanAlan;
    }

    public Members getIdMembesSenedYigan() {
        return idMembesSenedYigan;
    }

    public void setIdMembesSenedYigan(Members idMembesSenedYigan) {
        this.idMembesSenedYigan = idMembesSenedYigan;
    }

    public Maganfir getIdMagaza() {
        return idMagaza;
    }

    public void setIdMagaza(Maganfir idMagaza) {
        this.idMagaza = idMagaza;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMalSatisGeriQay != null ? idMalSatisGeriQay.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malsatisgeriqay)) {
            return false;
        }
        Malsatisgeriqay other = (Malsatisgeriqay) object;
        if ((this.idMalSatisGeriQay == null && other.idMalSatisGeriQay != null) || (this.idMalSatisGeriQay != null && !this.idMalSatisGeriQay.equals(other.idMalSatisGeriQay))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Malsatisgeriqay[ idMalSatisGeriQay=" + idMalSatisGeriQay + " ]";
    }
    
}
