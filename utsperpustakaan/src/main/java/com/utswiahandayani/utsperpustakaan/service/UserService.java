package com.utswiahandayani.utsperpustakaan.service;


import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    void saveUser(User user);
    User getUserById(String id);
    void deleteUserById(String id);

}
