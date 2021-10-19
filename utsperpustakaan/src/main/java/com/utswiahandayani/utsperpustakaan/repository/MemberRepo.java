package com.utswiahandayani.utsperpustakaan.repository;

import com.utswiahandayani.utsperpustakaan.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepo extends JpaRepository<Member, String> {

    @Query(value = "select * from tb_member", nativeQuery = true)
    public List<Member> getMemberNative();
}
