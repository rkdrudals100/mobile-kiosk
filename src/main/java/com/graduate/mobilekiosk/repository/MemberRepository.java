package com.graduate.mobilekiosk.repository;


import com.graduate.mobilekiosk.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    public Member findByUserId(String userId);
}
