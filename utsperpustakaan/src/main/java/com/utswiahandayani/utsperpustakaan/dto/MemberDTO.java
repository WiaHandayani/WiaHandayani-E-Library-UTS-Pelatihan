package com.utswiahandayani.utsperpustakaan.dto;

public class MemberDTO {

    String id_member;
    String id_user;
    String nama_lengkap;
    String alamat;
    String jenis_anggota;
    String jenis_kelamin;
    String pend_terakhir;
    String pekerjaan;
    String status_perkawinan;

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenis_anggota() {
        return jenis_anggota;
    }

    public void setJenis_anggota(String jenis_anggota) {
        this.jenis_anggota = jenis_anggota;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getPend_terakhir() {
        return pend_terakhir;
    }

    public void setPend_terakhir(String pend_terakhir) {
        this.pend_terakhir = pend_terakhir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getStatus_perkawinan() {
        return status_perkawinan;
    }

    public void setStatus_perkawinan(String status_perkawinan) {
        this.status_perkawinan = status_perkawinan;
    }
}
