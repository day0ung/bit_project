package com.palette.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.MemberCVDao;
import com.palette.model.BoardParams;
import com.palette.model.MemberCVDto;


@Service
@Transactional
public class MemberCVService {
	
	@Autowired
	MemberCVDao memberCVDao;
	
	public boolean insertCV(MemberCVDto dto) {
		int len = memberCVDao.insertCV(dto);
		return len>0?true:false;
	}
	
	public void CVNumChange(int seq) {
		memberCVDao.CVNumChange(seq);
	}
	
	public ArrayList<MemberCVDto> getCVPagingList(BoardParams boardParams){
		ArrayList<MemberCVDto> list = memberCVDao.getCVPagingList(boardParams);
		
		return list;
	}
	
	public ArrayList<MemberCVDto> CVList() {
		ArrayList<MemberCVDto> list = memberCVDao.CVList();
		
		return list;
	}
}
