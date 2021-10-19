package com.utswiahandayani.utsperpustakaan.controller;

import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.model.Member;
import com.utswiahandayani.utsperpustakaan.model.Peminjaman;
import com.utswiahandayani.utsperpustakaan.model.User;
import com.utswiahandayani.utsperpustakaan.repository.UserRepo;
import com.utswiahandayani.utsperpustakaan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@ComponentScan
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/home")
    public String home(){ return "home"; }

    @GetMapping("/home-user")
    public String homeUser(){
        return "home_user";
    }

    @GetMapping("/add-user")
    public String addUser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "tambah_user";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/user-data";
    }

    @GetMapping("/user-data")
    public String userData(Model model){
        List<User> users = userRepo.findAll();
        model.addAttribute("listUser",users);
        return "user_data";
    }

    @GetMapping("/update-user/{id}")
    public String updateUser(@PathVariable( value = "id") String id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "edit_user";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable (value = "id") String id) {
        this.userService.deleteUserById(id);
        return "redirect:/user-data";
    }
}
