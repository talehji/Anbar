/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Pallas
 */
@Entity
@Table(name = "members")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m")
    , @NamedQuery(name = "Members.findByIdMembers", query = "SELECT m FROM Members m WHERE m.idMembers = :idMembers")
    , @NamedQuery(name = "Members.findByAdi", query = "SELECT m FROM Members m WHERE m.adi = :adi")
    , @NamedQuery(name = "Members.findBySoyadi", query = "SELECT m FROM Members m WHERE m.soyadi = :soyadi")
    , @NamedQuery(name = "Members.findBySexsNo", query = "SELECT m FROM Members m WHERE m.sexsNo = :sexsNo")
    , @NamedQuery(name = "Members.findByTelefon", query = "SELECT m FROM Members m WHERE m.telefon = :telefon")
    , @NamedQuery(name = "Members.findByQeyd", query = "SELECT m FROM Members m WHERE m.qeyd = :qeyd")
    , @NamedQuery(name = "Members.findByIsActive", query = "SELECT m FROM Members m WHERE m.isActive = :isActive")
    , @NamedQuery(name = "Members.findByTarix", query = "SELECT m FROM Members m WHERE m.tarix = :tarix")})
public class Members implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMembers")
    private Integer idMembers;
    @Basic(optional = false)
    @Column(name = "Adi")
    private String adi;
    @Basic(optional = false)
    @Column(name = "Soyadi")
    private String soyadi;
    @Basic(optional = false)
    @Column(name = "SexsNo")
    private String sexsNo;
    @Basic(optional = false)
    @Column(name = "Telefon")
    private String telefon;
    @Basic(optional = false)
    @Column(name = "Qeyd")
    private String qeyd;
    @Basic(optional = false)
    @Column(name = "isActive")
    private String isActive;
    @Basic(optional = false)
    @Column(name = "Tarix")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tarix;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersOdeyen", fetch = FetchType.LAZY)
    private Collection<Kreditor> kreditorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersSenedYigan", fetch = FetchType.LAZY)
    private Collection<Kreditor> kreditorCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersTesdiqEden", fetch = FetchType.LAZY)
    private Collection<Kreditor> kreditorCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembers", fetch = FetchType.LAZY)
    private Collection<Maganfir> maganfirCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersVeren", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersAlan", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersSenedYigan", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersTesdiqEden", fetch = FetchType.LAZY)
    private Collection<Magazamubadile> magazamubadileCollection3;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembers", fetch = FetchType.LAZY)
    private Collection<Debitor> debitorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersAlan", fetch = FetchType.LAZY)
    private Collection<Debitor> debitorCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersSenedYigan", fetch = FetchType.LAZY)
    private Collection<Debitor> debitorCollection2;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersTesdiqEden", fetch = FetchType.LAZY)
    private Collection<Debitor> debitorCollection3;
    @JoinColumn(name = "idProperties", referencedColumnName = "idProperties")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Properties idProperties;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersSatanAlan", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembesSenedYigan", fetch = FetchType.LAZY)
    private Collection<Malsatisgeriqay> malsatisgeriqayCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersSenedYigan", fetch = FetchType.LAZY)
    private Collection<Zayitmis> zayitmisCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMembersTesdiqEden", fetch = FetchType.LAZY)
    private Collection<Zayitmis> zayitmisCollection1;

    public Members() {
    }

    public Members(Integer idMembers) {
        this.idMembers = idMembers;
    }

    public Members(Integer idMembers, String adi, String soyadi, String sexsNo, String telefon, String qeyd, String isActive, Date tarix) {
        this.idMembers = idMembers;
        this.adi = adi;
        this.soyadi = soyadi;
        this.sexsNo = sexsNo;
        this.telefon = telefon;
        this.qeyd = qeyd;
        this.isActive = isActive;
        this.tarix = tarix;
    }

    public Integer getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(Integer idMembers) {
        this.idMembers = idMembers;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSexsNo() {
        return sexsNo;
    }

    public void setSexsNo(String sexsNo) {
        this.sexsNo = sexsNo;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getQeyd() {
        return qeyd;
    }

    public void setQeyd(String qeyd) {
        this.qeyd = qeyd;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Date getTarix() {
        return tarix;
    }

    public void setTarix(Date tarix) {
        this.tarix = tarix;
    }

    @XmlTransient
    public Collection<Kreditor> getKreditorCollection() {
        return kreditorCollection;
    }

    public void setKreditorCollection(Collection<Kreditor> kreditorCollection) {
        this.kreditorCollection = kreditorCollection;
    }

    @XmlTransient
    public Collection<Kreditor> getKreditorCollection1() {
        return kreditorCollection1;
    }

    public void setKreditorCollection1(Collection<Kreditor> kreditorCollection1) {
        this.kreditorCollection1 = kreditorCollection1;
    }

    @XmlTransient
    public Collection<Kreditor> getKreditorCollection2() {
        return kreditorCollection2;
    }

    public void setKreditorCollection2(Collection<Kreditor> kreditorCollection2) {
        this.kreditorCollection2 = kreditorCollection2;
    }

    @XmlTransient
    public Collection<Maganfir> getMaganfirCollection() {
        return maganfirCollection;
    }

    public void setMaganfirCollection(Collection<Maganfir> maganfirCollection) {
        this.maganfirCollection = maganfirCollection;
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
    public Collection<Magazamubadile> getMagazamubadileCollection2() {
        return magazamubadileCollection2;
    }

    public void setMagazamubadileCollection2(Collection<Magazamubadile> magazamubadileCollection2) {
        this.magazamubadileCollection2 = magazamubadileCollection2;
    }

    @XmlTransient
    public Collection<Magazamubadile> getMagazamubadileCollection3() {
        return magazamubadileCollection3;
    }

    public void setMagazamubadileCollection3(Collection<Magazamubadile> magazamubadileCollection3) {
        this.magazamubadileCollection3 = magazamubadileCollection3;
    }

    @XmlTransient
    public Collection<Debitor> getDebitorCollection() {
        return debitorCollection;
    }

    public void setDebitorCollection(Collection<Debitor> debitorCollection) {
        this.debitorCollection = debitorCollection;
    }

    @XmlTransient
    public Collection<Debitor> getDebitorCollection1() {
        return debitorCollection1;
    }

    public void setDebitorCollection1(Collection<Debitor> debitorCollection1) {
        this.debitorCollection1 = debitorCollection1;
    }

    @XmlTransient
    public Collection<Debitor> getDebitorCollection2() {
        return debitorCollection2;
    }

    public void setDebitorCollection2(Collection<Debitor> debitorCollection2) {
        this.debitorCollection2 = debitorCollection2;
    }

    @XmlTransient
    public Collection<Debitor> getDebitorCollection3() {
        return debitorCollection3;
    }

    public void setDebitorCollection3(Collection<Debitor> debitorCollection3) {
        this.debitorCollection3 = debitorCollection3;
    }

    public Properties getIdProperties() {
        return idProperties;
    }

    public void setIdProperties(Properties idProperties) {
        this.idProperties = idProperties;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection() {
        return malsatisgeriqayCollection;
    }

    public void setMalsatisgeriqayCollection(Collection<Malsatisgeriqay> malsatisgeriqayCollection) {
        this.malsatisgeriqayCollection = malsatisgeriqayCollection;
    }

    @XmlTransient
    public Collection<Malsatisgeriqay> getMalsatisgeriqayCollection1() {
        return malsatisgeriqayCollection1;
    }

    public void setMalsatisgeriqayCollection1(Collection<Malsatisgeriqay> malsatisgeriqayCollection1) {
        this.malsatisgeriqayCollection1 = malsatisgeriqayCollection1;
    }

    @XmlTransient
    public Collection<Zayitmis> getZayitmisCollection() {
        return zayitmisCollection;
    }

    public void setZayitmisCollection(Collection<Zayitmis> zayitmisCollection) {
        this.zayitmisCollection = zayitmisCollection;
    }

    @XmlTransient
    public Collection<Zayitmis> getZayitmisCollection1() {
        return zayitmisCollection1;
    }

    public void setZayitmisCollection1(Collection<Zayitmis> zayitmisCollection1) {
        this.zayitmisCollection1 = zayitmisCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMembers != null ? idMembers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.idMembers == null && other.idMembers != null) || (this.idMembers != null && !this.idMembers.equals(other.idMembers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Members[ idMembers=" + idMembers + " ]";
    }
    
}
