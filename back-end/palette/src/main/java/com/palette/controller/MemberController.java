package com.palette.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.palette.model.MemberDto;
import com.palette.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemberController
 */
@CrossOrigin(origins = "*")
@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    
    @GetMapping(value = "/register")
    public String member(){
        System.out.println("register()");
        List<MemberDto> list = memberService.selectAll();
        System.out.println(list.size());
        return "";
    }
    
    @PostMapping(value= "/getOneMember")
    public MemberDto getOneMember(MemberDto dto, HttpServletRequest request)throws Exception {
    	System.out.println("getOneMember() 실행");
    	MemberDto member = memberService.getOneMember(dto);
    	return member;
    }
}