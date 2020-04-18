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
    public MemberDto getOneMember(MemberDto dto) {
    	System.out.println("getOneMember() 실행"+ dto.toString());
    	MemberDto member = memberService.getOneMember(dto);
    	return member;
    }
    
    @PostMapping(value="/createMember")
    public boolean createMember(MemberDto dto, HttpServletRequest request)throws Exception {
    	System.out.println("createMember" + dto.toString());
    	boolean check = memberService.createMember(dto);
    	System.out.println(" 추가 성공: " + check);
    	return check;
    }
    
    @PostMapping(value="/checkid")
    public boolean checkId(String memberId) {
    	System.out.println("checkid"  + memberId);
    	int is = memberService.checkid(memberId);
    	return is > 0? false: true;
    	
    }
    
    @PostMapping(value= "/selectMember")
    public MemberDto getOneMember(int memberSeq) {
    	System.out.println("getOneMember() 실행");
    	System.out.println("======"+ memberSeq);
    	MemberDto member = memberService.getDetailMember(memberSeq);
    	return member;
    }
    
    @PostMapping(value="/intersting")
    public String intersting(String interSmallSeqs, MemberDto dto) {
    	System.out.println("interesting!!!"+interSmallSeqs + dto.getInterArea());
    	memberService.addInterArea(dto);
    	int memberSeq = memberService.getSeq();
    	memberService.InterstingInsert(interSmallSeqs, memberSeq);
    	return "perfect";
    }
    
}