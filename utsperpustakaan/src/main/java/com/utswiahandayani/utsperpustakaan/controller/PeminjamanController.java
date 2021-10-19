package com.utswiahandayani.utsperpustakaan.controller;

import com.utswiahandayani.utsperpustakaan.model.Book;
import com.utswiahandayani.utsperpustakaan.model.Member;
import com.utswiahandayani.utsperpustakaan.model.Peminjaman;
import com.utswiahandayani.utsperpustakaan.repository.BookRepo;
import com.utswiahandayani.utsperpustakaan.repository.MemberRepo;
import com.utswiahandayani.utsperpustakaan.repository.PeminjamanRepo;
import com.utswiahandayani.utsperpustakaan.service.BookService;
import com.utswiahandayani.utsperpustakaan.service.MemberService;
import com.utswiahandayani.utsperpustakaan.service.PeminjamanService;
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
public class PeminjamanController {

    @Autowired
    PeminjamanService peminjamanService;

    @Autowired
    private PeminjamanRepo peminjamanRepo;

    @Autowired
    MemberService memberService;

    @Autowired
    private MemberRepo memberRepo;

    @Autowired
    BookService bookService;

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/borrowing-data")
    public String borrowingData(Model model){
        List<Peminjaman> peminjaman = peminjamanRepo.findAll();
        model.addAttribute("listPeminjaman",peminjaman);
        return "peminjaman_data";
    }

    @GetMapping("/add-peminjaman")
    public String addPeminjaman(Model model) {
        Peminjaman peminjaman = new Peminjaman();
        List<Member> members = memberRepo.getMemberNative();
        List<Book> books = bookRepo.getBookNative();
        model.addAttribute("peminjaman", peminjaman);
        model.addAttribute("getIdMember",members);
        model.addAttribute("getKodeBuku",books);
        return "tambah_peminjaman";
    }

    @PostMapping("/savePeminjaman")
    public String savePeminjaman(@ModelAttribute("book") Peminjaman peminjaman) {
        peminjamanService.savePeminjaman(peminjaman);
        return "redirect:/borrowing-data";
    }

    @GetMapping("/update-peminjaman/{id}")
    public String updatePeminjaman(@PathVariable( value = "id") String id, Model model) {
        Peminjaman peminjaman = peminjamanService.getPeminjamanById(id);
        List<Member> members = memberRepo.getMemberNative();
        List<Book> books = bookRepo.getBookNative();
        model.addAttribute("peminjaman",peminjaman);
        model.addAttribute("idMember", members);
        model.addAttribute("kodeBuku",books);
        return "edit_peminjaman";
    }

    @GetMapping("/deletePeminjaman/{id}")
    public String deletePeminjaman(@PathVariable (value = "id") String id) {
        this.peminjamanService.deletePeminjamanById(id);
        return "redirect:/borrowing-data";
    }
}
