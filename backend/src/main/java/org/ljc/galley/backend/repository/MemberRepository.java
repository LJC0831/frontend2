package org.ljc.galley.backend.repository;

import org.ljc.galley.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Integer>{
    Member findByEmailAndPassword(String email, String password);
    
}