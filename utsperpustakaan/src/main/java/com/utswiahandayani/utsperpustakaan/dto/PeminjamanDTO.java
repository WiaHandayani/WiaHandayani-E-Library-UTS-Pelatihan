package com.utswiahandayani.utsperpustakaan.dto;

import java.util.Date;

public class PeminjamanDTO {

    String id_peminjaman;
    String id_member;
    String kode_buku;
    Date tgl_pinjam;
    Integer lama_pinjam;
    Date tgl_kembali;

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(String kode_buku) {
        this.kode_buku = kode_buku;
    }

    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public Integer getLama_pinjam() {
        return lama_pinjam;
    }

    public void setLama_pinjam(Integer lama_pinjam) {
        this.lama_pinjam = lama_pinjam;
    }

    public Date getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(Date tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }
}
