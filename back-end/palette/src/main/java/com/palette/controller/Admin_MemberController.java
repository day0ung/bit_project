package com.palette.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.MemberDto;
import com.palette.service.MemberService;
import com.palette.service.adminMemberService;

@CrossOrigin(origins = "*")
@RestController
public class Admin_MemberController {
	@Autowired
	adminMemberService adminservice;
    MemberService memberService1;

    
    
	
	@GetMapping(value="/getTestString")
	public List<String> testinfo() {
		System.out.println("get testString start");
		List<String> outList = new ArrayList<>();
		outList.add("hello");
		outList.add("world");
		outList.add("what");
		outList.add("is");
		outList.add("this");
//		for (String data : outList) {
//			System.out.println(data);
//		}
		return outList ;
	}//end of testInfo 
	
	
	@GetMapping(value="/getMemberListAll")
	public List<MemberDto> getMemberListAll() {
		System.out.println("getMemberListAll() start ");
		List<MemberDto> memlist = adminservice.getMemberListAll();
		for (MemberDto data : memlist) {
		System.out.println(data);
	}
		return memlist  ;
	}//end of testInfo
	
	@PostMapping(value= "/adminGetOneMember")
    public MemberDto getOneMember(MemberDto dto, HttpServletRequest request)throws Exception {
    	System.out.println("getOneMember() 실행");
    	System.out.println("input id pw " + dto.getMemberId()+" "+ dto.getPwd());
    	MemberDto member = adminservice.adminGetOneMember(dto);
    	System.out.println("쿼리결과" + member);
    	return member;
    }
	 
	 
	

}//end of Admin_MemberController class
