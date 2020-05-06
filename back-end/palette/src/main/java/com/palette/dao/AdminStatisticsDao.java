package com.palette.dao;

import java.util.List;
import java.util.Map;

import com.palette.model.MemberDto;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminStatisticsDao {

    public List<MemberDto> getMemberGenderInfo();

    //Map<String, Object> receiveinterBigCountAll();
    List<Map<String, Object>> receiveinterBigCountAll();
    
    
	
	
	
}//end of adminAdminStatisticsDao interface
