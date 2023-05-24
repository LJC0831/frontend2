package org.ljc.galley.backend.controller;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.ljc.galley.backend.entity.Member;
import org.ljc.galley.backend.repository.MemberRepository;
import org.ljc.galley.backend.service.JwtService;
import org.ljc.galley.backend.service.JwtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/api/account/login")
    public ResponseEntity login(@RequestBody Map<String, String> params, HttpServletResponse response){
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        if(member != null){
            JwtService jwtService = new JwtServiceImpl();
            int id =  member.getId();
            System.out.println("11111111111111 = " + id);
            String token = jwtService.getToken("id", id);

            Cookie cookie = new Cookie(token, token);
            cookie.setHttpOnly(true);
            cookie.setPath("/");

            response.addCookie(cookie);
            return new ResponseEntity<>(id, HttpStatus.OK);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        
    }
}
