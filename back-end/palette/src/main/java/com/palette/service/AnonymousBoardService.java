package com.palette.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.AnonymousBoardDao;
import com.palette.dao.EmploymentDao;
import com.palette.model.AnonymousBoardDto;
import com.palette.model.BoardParams;
import com.palette.model.MemberCVDto;

@Service
@Transactional
public class AnonymousBoardService {

	@Autowired
    AnonymousBoardDao anonymousBoardtDao;
	
//  익명게시판 페이징
	public ArrayList<AnonymousBoardDto> getAnonymousBoardPagingList(BoardParams boardParams) {
		ArrayList<AnonymousBoardDto> list = anonymousBoardtDao.getAnonymousBoardPagingList(boardParams);
		return list;
	}

//	익명게시판 리스트 갯수
	public int anonymousBoardList(BoardParams boardParams) {
		return anonymousBoardtDao.anonymousBoardList(boardParams);
	}
	
	
//	익명게시판 추가
	public boolean insertAnonymousBoard(AnonymousBoardDto dto) {
		int len = anonymousBoardtDao.insertAnonymousBoard(dto);
		return len>0?true:false;
	}
	
}