package com.palette.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palette.model.BoardParams;
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
	
//	@PostMapping(value="/CVPagingList")
//    public ArrayList<MemberCVDto> getMemberCVPagingList(BoardParams boardParams) {
//    	boardParams.setStart( (boardParams.getPage()-1)*boardParams.getLimit() );
//    	System.out.println(boardParams.toString());
//    	ArrayList<MemberCVDto> list = memberCVService.getMemberCVPagingList(boardParams);
//    	for (int j = 0; j < list.size(); j++) {
//    		
//    		System.out.println(list.get(j).toString());
//    	}
//    	return list;
//    }
	
}
