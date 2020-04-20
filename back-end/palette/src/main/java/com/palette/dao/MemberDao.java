package com.palette.dao;

import java.util.List;

import com.palette.model.MemberDto;
import com.palette.model.MemberInterParam;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDao {

	List<MemberDto> selectAll();

	MemberDto getOneMember(MemberDto dto);
	
	int checkId(String memberId);
	
	int createMember(MemberDto dto);
	
	MemberDto getSelectMember(int memberSeq);
	
	MemberDto getDetailMember(int memberSeq);
	
	int getBigSeq(int interSmallSeq);
	
	int addInter(MemberInterParam param);
	
	int addInterArea(MemberDto dto);
	
	int getSeq();
	
	int updateInfo(MemberDto dto);
	
	int updateAddr(MemberDto dto);
	
	int checkPass(MemberDto dto);
	
	int updatePass(MemberDto dto);

}
