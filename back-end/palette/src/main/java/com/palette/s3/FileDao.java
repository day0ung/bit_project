package com.palette.s3;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface FileDao {
	public int upload(FileDto dto);
	
	public List<FileDto> getImageList();
}
