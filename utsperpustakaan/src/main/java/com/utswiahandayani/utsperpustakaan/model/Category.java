package com.utswiahandayani.utsperpustakaan.model;


import javax.persistence.*;

@Entity
@Table(name = "tb_categories")
public class Category {
    @Id
    private String kode_kategori;

    @Column(name = "nama_kategori")
    private String namaKategori;

    public String getKode_kategori() {
        return kode_kategori;
    }

    public void setKode_kategori(String kode_kategori) {
        this.kode_kategori = kode_kategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
}
