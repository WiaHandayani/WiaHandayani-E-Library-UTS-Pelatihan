package com.utswiahandayani.utsperpustakaan.dto;

import java.util.Date;

public class PengembalianDTO {

    String id_pengembalian;
    String id_peminjaman;
    Date tgl_kembali;
    String statusPengembalian;

    public String getId_pengembalian() {
        return id_pengembalian;
    }

    public void setId_pengembalian(String id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }

    public String getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(String id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Date getTgl_kembali() {
        return tgl_kembali;
    }

    public void setTgl_kembali(Date tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public String getStatusPengembalian() {
        return statusPengembalian;
    }

    public void setStatusPengembalian(String statusPengembalian) {
        this.statusPengembalian = statusPengembalian;
    }
}
