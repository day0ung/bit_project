package com.palette.s3;

public class FileDto {
	private Long id;
	private String title;
	private String filepath;
	private String imgFullPath;
	
	public FileDto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getImgFullPath() {
		return imgFullPath;
	}

	public void setImgFullPath(String imgFullPath) {
		this.imgFullPath = imgFullPath;
	}

	@Override
	public String toString() {
		return "FileDto [id=" + id + ", title=" + title + ", filepath=" + filepath + ", imgFullPath=" + imgFullPath
				+ "]";
	}
	
	
	
}


