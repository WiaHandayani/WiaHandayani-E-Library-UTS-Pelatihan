package com.utswiahandayani.utsperpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_member")
public class Member {

    @Id
    private String id_member;

    @Column(name = "id_user")
    private String idUser;

    @Column(name = "nama_lengkap")
    private String namaLengkap;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "jenis_anggota")
    private String jenisAnggota;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;

    @Column(name = "pend_terakhir")
    private String pendTerakhir;

    @Column(name = "pekerjaan")
    private String pekerjaan;

    @Column(name = "status_perkawinan")
    private String statusPerkawinan;

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisAnggota() {
        return jenisAnggota;
    }

    public void setJenisAnggota(String jenisAnggota) {
        this.jenisAnggota = jenisAnggota;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPendTerakhir() {
        return pendTerakhir;
    }

    public void setPendTerakhir(String pendTerakhir) {
        this.pendTerakhir = pendTerakhir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }
}
