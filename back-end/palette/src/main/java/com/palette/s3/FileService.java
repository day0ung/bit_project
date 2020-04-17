package com.palette.s3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FileService {
	@Autowired
	FileDao FileDao;
	
	public int upload(FileDto dto) {
	  return FileDao.upload(dto);
	}
	
	public List<FileDto> getImageList() {
	  return FileDao.getImageList();
	}
}
