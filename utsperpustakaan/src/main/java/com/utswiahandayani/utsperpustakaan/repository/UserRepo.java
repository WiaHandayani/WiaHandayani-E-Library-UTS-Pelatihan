package com.utswiahandayani.utsperpustakaan.repository;

import com.utswiahandayani.utsperpustakaan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<User,String> {

    User findByUsernameAndPassword(String username,String password);

    @Query("FROM User")
    public List<User> getUser();

    @Query(value = "select * from tb_user", nativeQuery = true)
    public List<User> getUserNative();
}
