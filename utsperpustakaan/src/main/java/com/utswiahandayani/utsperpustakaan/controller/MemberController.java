package com.utswiahandayani.utsperpustakaan.controller;

import com.utswiahandayani.utsperpustakaan.model.Member;
import com.utswiahandayani.utsperpustakaan.model.User;
import com.utswiahandayani.utsperpustakaan.repository.MemberRepo;
import com.utswiahandayani.utsperpustakaan.repository.UserRepo;
import com.utswiahandayani.utsperpustakaan.service.MemberService;
import com.utswiahandayani.utsperpustakaan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@ComponentScan
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    private MemberRepo memberRepo;

    @Autowired
    UserService userService;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/member-data")
    public String memberData(Model model){
        List<Member> members = memberRepo.findAll();
        model.addAttribute("listMember",members);
        return "member_data";
    }

    @GetMapping("/add-member")
    public String addMember(Model model) {
        Member member = new Member();
        List<User> users = userRepo.getUserNative();
        model.addAttribute("member", member);
        model.addAttribute("getUser",users);
        return "tambah_member";
    }

    @PostMapping("/saveMember")
    public String saveMember(@ModelAttribute("member") Member member) {
        memberService.saveMember(member);
        return "redirect:/member-data";
    }

    @GetMapping("/update-member/{id}")
    public String updateMember(@PathVariable( value = "id") String kode, Model model) {
        Member member = memberService.getMemberById(kode);
        List<User> users = userRepo.getUserNative();
        model.addAttribute("member", member);
        model.addAttribute("getUser",users);
        return "edit_member";
    }

    @GetMapping("/deleteMember/{id}")
    public String deleteMember(@PathVariable (value = "id") String kode) {
        this.memberService.deleteMemberById(kode);
        return "redirect:/member-data";
    }
}
