package com.palette.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.GroupBoardDto;
import com.palette.model.GroupDto;
import com.palette.model.GroupMemberDto;
import com.palette.model.InterBigDto;
import com.palette.model.InterSmallDto;

@Mapper
@Repository
public interface GroupDao {

	List<GroupDto> getAllGroup();

	GroupDto getOneGroup(int seq);

	List<InterBigDto> getBigList();

	List<InterSmallDto> getSmallList(int seq);
	
	List<GroupMemberDto> getGroupMemberName(int seq);

	ArrayList<GroupBoardDto> getgroupBoardList();

}
