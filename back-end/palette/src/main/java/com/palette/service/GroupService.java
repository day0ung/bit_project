package com.palette.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.GroupDao;
import com.palette.model.GroupBoardDto;
import com.palette.model.GroupDto;
import com.palette.model.GroupMemberDto;
import com.palette.model.InterBigDto;
import com.palette.model.InterSmallDto;

@Service
@Transactional
public class GroupService {
	
	@Autowired
    GroupDao groupDao;

	public List<GroupDto> getAllGroup() {
		return groupDao.getAllGroup();
	}

	public GroupDto getOneGroup(int seq) {
		return groupDao.getOneGroup(seq);
	}

	public List<InterBigDto> getBigList() {
		return groupDao.getBigList();
	}

	public List<InterSmallDto> getSmallList(int seq) {
		return groupDao.getSmallList(seq);
	}
	
	public List<GroupMemberDto> getGroupMemberName(int seq){
		return groupDao.getGroupMemberName(seq);
	}

	public ArrayList<GroupBoardDto> getGroupBoardList() {
		return groupDao.getgroupBoardList();
	}

	public GroupBoardDto groupBoardOne(int seq) {
		return groupDao.groupBoardOne(seq);
	}
}
