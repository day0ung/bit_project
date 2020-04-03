package com.palette.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palette.dao.GroupDao;
import com.palette.model.GroupDto;

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
}
