package com.palette.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.BoardDto;

@Mapper
@Repository
public interface EmploymentDao {

	List<BoardDto> getAllRecuritingInfo();

//	EmploymentDto getAllRecuritingInfo(int seq);

}
