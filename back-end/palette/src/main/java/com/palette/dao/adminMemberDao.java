package com.palette.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.MemberDto;

@Mapper
@Repository
public interface adminMemberDao {
	List<MemberDto> getMemberListAll();
	

}//end of adminMemberDao interface
