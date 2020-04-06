package com.palette.controller;

import java.util.List;

import com.palette.model.MemberDto;
import com.palette.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value= "/getOneMember")
    public MemberDto getOneMember(int seq) {
    	System.out.println("getOneMember() 실행");
    	MemberDto dto = memberService.getOneMember(seq);
    	System.out.println(dto.toString());
    	
    	return dto;
    }
}