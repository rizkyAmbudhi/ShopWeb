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
@Table(name = "PRODUCT")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")
    , @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id")
    , @NamedQuery(name = "Product.findByNamabarang", query = "SELECT p FROM Product p WHERE p.namabarang = :namabarang")
    , @NamedQuery(name = "Product.findByJenisbarang", query = "SELECT p FROM Product p WHERE p.jenisbarang = :jenisbarang")
    , @NamedQuery(name = "Product.findByHargabarang", query = "SELECT p FROM Product p WHERE p.hargabarang = :hargabarang")})
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAMABARANG")
    private String namabarang;
    @Basic(optional = false)
    @Column(name = "JENISBARANG")
    private String jenisbarang;
    @Basic(optional = false)
    @Column(name = "HARGABARANG")
    private double hargabarang;

    public Product() {
    }

    public Product(Long id) {
        this.id = id;
    }

    public Product(Long id, String namabarang, String jenisbarang, double hargabarang) {
        this.id = id;
        this.namabarang = namabarang;
        this.jenisbarang = jenisbarang;
        this.hargabarang = hargabarang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getJenisbarang() {
        return jenisbarang;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public double getHargabarang() {
        return hargabarang;
    }

    public void setHargabarang(double hargabarang) {
        this.hargabarang = hargabarang;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.model.Product[ id=" + id + " ]";
    }
    
}
