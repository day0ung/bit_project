package com.palette.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class Admin_MemberController {
	
	@GetMapping(value="/getTestString")
	public List<String> testinfo() {
		System.out.println("get testString start");
		List<String> outList = new ArrayList<>();
		outList.add("hello");
		outList.add("world");
		outList.add("what");
		outList.add("is");
		outList.add("this");
		for (String data : outList) {
			System.out.println(data);
		}
		return outList ;
	}//end of testInfo 

}
