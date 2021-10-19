package com.utswiahandayani.utsperpustakaan.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    @Id
    private String idUser;

    private String namaUser;

    private String username;

    private String password;

    private int role;

}
