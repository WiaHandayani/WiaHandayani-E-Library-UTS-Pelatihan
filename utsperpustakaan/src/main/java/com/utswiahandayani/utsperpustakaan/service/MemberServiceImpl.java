package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Member;
import com.utswiahandayani.utsperpustakaan.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepo memberRepo;

    @Override
    public List<Member> getAllBook() { return memberRepo.findAll(); }

    @Override
    public void saveMember(Member member) { this.memberRepo.save(member); }

    @Override
    public Member getMemberById(String id) {

        Optional<Member> optional = memberRepo.findById(id);
        Member member = null;
        if (optional.isPresent()) {
            member = optional.get();
        } else {
            throw new RuntimeException(" Member not found for id :: " + id);
        }
        return member;

    }

    @Override
    public void deleteMemberById(String id) { this.memberRepo.deleteById(id); }
}
