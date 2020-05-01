package com.palette.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.MemberBoardDto;
import com.palette.s3.ReferenceVo;
import com.palette.service.MemberBoardService;

@CrossOrigin(origins = "*")
@RestController
public class MemberBoardController {

	@Autowired
	MemberBoardService service;
	
	@PostMapping(value = "/getMemberBoard") 
	public List<MemberBoardDto> getMemberBoard(MemberBoardDto dto){
		List<MemberBoardDto> list = service.getMemberBoard(dto);
		for (MemberBoardDto memberBoardDto : list) {
			System.out.println(memberBoardDto.toString());
		}
		return list;
		
			
	}
	
	@PostMapping(value = "/uploadBoard") 
	public String writeBoard(ReferenceVo form) throws IOException{
		System.out.println("writeBoard"+form.toString());
		service.uploadBoard(form);
		return "";
	}
	
	
}
