package com.palette.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.EmploymentDto;

@Mapper
@Repository
public interface EmploymentDao {

	List<EmploymentDto> getAllRecuritingInfo();

//	EmploymentDto getAllRecuritingInfo(int seq);

}
