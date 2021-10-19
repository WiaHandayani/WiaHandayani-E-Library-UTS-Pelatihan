package com.utswiahandayani.utsperpustakaan.rest;

import com.utswiahandayani.utsperpustakaan.dto.DtoResponse;
import com.utswiahandayani.utsperpustakaan.dto.LoginDTO;
import com.utswiahandayani.utsperpustakaan.model.User;
import com.utswiahandayani.utsperpustakaan.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRest {
    @Autowired
    private UserRepo userRepo;

    @PostMapping("/login")
    private DtoResponse login(@RequestBody LoginDTO dto){
        if(dto!=null){
            User user = userRepo.findByUsernameAndPassword(dto.getUsername(),dto.getPassword());
            if(user!=null){
                return new DtoResponse(1,user,"Success");
            }
        }
        return new DtoResponse(0,null,"Failed");

    }


}
