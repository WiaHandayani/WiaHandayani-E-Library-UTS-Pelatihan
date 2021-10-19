package com.utswiahandayani.utsperpustakaan.service;

import com.utswiahandayani.utsperpustakaan.model.Member;

import java.util.List;

public interface MemberService {

    List<Member> getAllBook();
    void saveMember(Member member);
    Member getMemberById(String id);
    void deleteMemberById(String id);

}
