package com.palette.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.BoardParams;
import com.palette.model.EmploymentBoardDto;
import com.palette.model.GroupBoardDto;
import com.palette.model.MemberCVDto;
import com.palette.service.MemberCVService;

@CrossOrigin(origins = "*")
@RestController
public class MemberCVController {
	@Autowired
	MemberCVService memberCVService;
	
//	CV 추가
	@GetMapping(value = "/insertCV")
    public boolean insertCV(MemberCVDto dto){
		System.out.println("insertCV() 실행");
		
		
		memberCVService.CVNumChange(dto.getMemberSeq());
		boolean isS = memberCVService.insertCV(dto);
		
		
		return isS;
	}
	
//  cv페이징
	@PostMapping(value="/CVPagingList")
    public ArrayList<MemberCVDto> getCVPagingList(BoardParams boardParams) {
		System.out.println("getGroupPagingList() : "+boardParams.toString());
    	boardParams.setStart( (boardParams.getPage()-1)*boardParams.getLimit() );
    	ArrayList<MemberCVDto> list =	memberCVService.getCVPagingList(boardParams);
    	return list;
    }
	
	@GetMapping(value = "/CVList")
    public ArrayList<MemberCVDto> CVList() {
		System.out.println("CVLIST() 실행");
		ArrayList<MemberCVDto> list =	memberCVService.CVList();
		return list;
	}
	
}
