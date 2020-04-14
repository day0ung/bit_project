package com.palette.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.palette.model.BoardParams;
import com.palette.model.GroupBoardDto;
import com.palette.model.GroupDto;
import com.palette.model.GroupMemberDto;
import com.palette.model.GroupParams;
import com.palette.model.InterBigDto;
import com.palette.model.InterSmallDto;

@Mapper
@Repository
public interface GroupDao {

	List<GroupDto> getAllGroup();
	ArrayList<GroupDto> getMyGroup(GroupParams groupParams);
	ArrayList<GroupDto> getMyOtherGroup(GroupParams groupParams);

	GroupDto getOneGroup(int seq);
	
	List<GroupMemberDto> getGroupMemberName(int seq);

	ArrayList<GroupBoardDto> getgroupPagingList(BoardParams boardParams);
	ArrayList<GroupBoardDto> getgroupBoardList();
	
	GroupBoardDto groupBoardOne(int seq);

	List<InterBigDto> getInterListAll();

	ArrayList<GroupDto> groupSearchList(GroupParams groupParams);


}
