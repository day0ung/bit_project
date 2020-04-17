package com.palette.s3;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
public class FileController {
	@Autowired
	private FileService FileService;

	@Autowired
	private S3Service s3Service;

	@PostMapping("/upload")
	public String execWrite(FileDto FileDto, MultipartFile files) throws IOException {
	  System.out.println(files);
	  String imgPath = s3Service.upload(FileDto.getFilepath(), files);
	  FileDto.setFilepath("https://" + "di4mk5lwh5ia.cloudfront.net" + "/" + imgPath);
	  return FileService.upload(FileDto) > 0 ? "OK" : "FAIL";
	}
 
	@GetMapping("/getImageList")
    public List<FileDto> getImageList() {
    return FileService.getImageList();
    }

}
