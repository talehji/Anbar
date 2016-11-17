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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pallas
 */
@Entity
@Table(name = "mainproperties")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mainproperties.findAll", query = "SELECT m FROM Mainproperties m")
    , @NamedQuery(name = "Mainproperties.findByIdMainProperties", query = "SELECT m FROM Mainproperties m WHERE m.idMainProperties = :idMainProperties")
    , @NamedQuery(name = "Mainproperties.findByName", query = "SELECT m FROM Mainproperties m WHERE m.name = :name")})
public class Mainproperties implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMainProperties")
    private Integer idMainProperties;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;

    public Mainproperties() {
    }

    public Mainproperties(Integer idMainProperties) {
        this.idMainProperties = idMainProperties;
    }

    public Mainproperties(Integer idMainProperties, String name) {
        this.idMainProperties = idMainProperties;
        this.name = name;
    }

    public Integer getIdMainProperties() {
        return idMainProperties;
    }

    public void setIdMainProperties(Integer idMainProperties) {
        this.idMainProperties = idMainProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMainProperties != null ? idMainProperties.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mainproperties)) {
            return false;
        }
        Mainproperties other = (Mainproperties) object;
        if ((this.idMainProperties == null && other.idMainProperties != null) || (this.idMainProperties != null && !this.idMainProperties.equals(other.idMainProperties))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Mainproperties[ idMainProperties=" + idMainProperties + " ]";
    }
    
}
