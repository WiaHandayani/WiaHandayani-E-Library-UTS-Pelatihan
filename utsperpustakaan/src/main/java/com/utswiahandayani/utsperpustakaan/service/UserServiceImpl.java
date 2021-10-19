package com.utswiahandayani.utsperpustakaan.service;


import com.utswiahandayani.utsperpustakaan.model.User;
import com.utswiahandayani.utsperpustakaan.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    protected UserRepo userRepo;

    @Override
    public List<User> getAllUser() { return userRepo.findAll(); }

    @Override
    public void saveUser(User user) { this.userRepo.save(user); }

    @Override
    public User getUserById(String id) {
        Optional<User> optional = userRepo.findById(id);
        User user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" User not found for id :: " + id);
        }
        return user;
    }

    @Override
    public void deleteUserById(String id) { this.userRepo.deleteById(id); }
}
