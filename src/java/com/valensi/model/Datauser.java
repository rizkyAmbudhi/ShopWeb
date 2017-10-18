/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "DATAUSER")
@NamedQueries({
    @NamedQuery(name = "Datauser.findAll", query = "SELECT d FROM Datauser d")
    , @NamedQuery(name = "Datauser.findById", query = "SELECT d FROM Datauser d WHERE d.id = :id")
    , @NamedQuery(name = "Datauser.findByFirstname", query = "SELECT d FROM Datauser d WHERE d.firstname = :firstname")
    , @NamedQuery(name = "Datauser.findByLastname", query = "SELECT d FROM Datauser d WHERE d.lastname = :lastname")
    , @NamedQuery(name = "Datauser.findByUsername", query = "SELECT d FROM Datauser d WHERE d.username = :username")
    , @NamedQuery(name = "Datauser.findByPassword", query = "SELECT d FROM Datauser d WHERE d.password = :password")})
public class Datauser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Basic(optional = false)
    @Column(name = "LASTNAME")
    private String lastname;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;

    public Datauser() {
    }

    public Datauser(Integer id) {
        this.id = id;
    }

    public Datauser(Integer id, String firstname, String lastname, String username, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datauser)) {
            return false;
        }
        Datauser other = (Datauser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.model.Datauser[ id=" + id + " ]";
    }
    
}
