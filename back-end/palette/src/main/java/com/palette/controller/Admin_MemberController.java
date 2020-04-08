package com.palette.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.MemberDto;
import com.palette.service.adminMemberService;

@CrossOrigin(origins = "*")
@RestController
public class Admin_MemberController {
	@Autowired
	adminMemberService adminservice;
	
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
	

}//end of Admin_MemberController class
