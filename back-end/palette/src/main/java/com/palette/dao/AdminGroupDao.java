package com.palette.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.GroupDto;



@Mapper
@Repository
public interface AdminGroupDao {
	
	public List<GroupDto> selfOutputTest();
	
	


} //end of AdminGroup interface
