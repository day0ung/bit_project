package com.palette.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.palette.s3.ReferenceVo;
import com.palette.s3.S3Uploader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*")
@RestController
public class UploadController {

    @Autowired
    private S3Uploader s3Uploader;

    @PostMapping(value = "/insertGroupReference")
    public String insertGroupReference(ReferenceVo form) throws IOException{
        System.out.println(form.getFiles().size());
        for (MultipartFile file : form.getFiles()) {
            String fileUrl = s3Uploader.upload(file, form.getMemberId());
            System.out.println(fileUrl);
        }
        return "";
    }

}