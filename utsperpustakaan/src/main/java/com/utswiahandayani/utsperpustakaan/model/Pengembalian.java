package com.utswiahandayani.utsperpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tb_pengembalian")
public class Pengembalian {

    @Id
    private String id_pengembalian;

    @Column(name = "id_peminjaman")
    private String idPeminjaman;

    @Column(name = "tgl_kembali")
    private Date tglKembali;

    @Column(name = "status")
    private String statusPengembalian;

    public String getId_pengembalian() {
        return id_pengembalian;
    }

    public void setId_pengembalian(String id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }

    public String getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(String idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getStatusPengembalian() {
        return statusPengembalian;
    }

    public void setStatusPengembalian(String statusPengembalian) {
        this.statusPengembalian = statusPengembalian;
    }
}
