package com.palette.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.MemberCVDto;

@Mapper
@Repository
public interface MemberCVDao {
	int insertCV(MemberCVDto dto);
	
	void CVNumChange(int seq);
}
