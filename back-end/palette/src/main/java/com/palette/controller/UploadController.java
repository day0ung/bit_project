package com.palette.controller;

import java.io.IOException;

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

    // @Autowired
    // private S3Uploader s3Uploader;

    @PostMapping(value = "/insertGroupReference")
    public String insertGroupReference(ReferenceVo from) throws IOException{
        System.out.println("insertGroupReference()");
        // System.out.println(from.toString());
        for (MultipartFile file : from.getFiles()) {
            System.out.println(file.toString());
            //s3Uploader.upload(file, from.getTitle());
        }
        return "";
    }

}