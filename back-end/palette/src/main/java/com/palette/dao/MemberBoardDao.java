package com.palette.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.BoardReferenceDto;
import com.palette.model.MemberBoardDto;

@Mapper
@Repository
public interface MemberBoardDao {
	List<MemberBoardDto> getMemberBoard(MemberBoardDto dto);
	
	void writeBoard(MemberBoardDto dto);
	int currBoardSeq();
	void writeLibrary(BoardReferenceDto dto);
}
