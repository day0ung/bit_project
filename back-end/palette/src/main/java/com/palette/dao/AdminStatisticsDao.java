package com.palette.dao;

import java.util.List;

import com.palette.model.MemberDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminStatisticsDao {

    public List<MemberDto> getMemberGenderInfo();
	
	
	
}//end of adminAdminStatisticsDao interface
