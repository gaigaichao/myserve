package com.chao.controller;


import com.chao.model.Picture;
import com.chao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping(value = "/userimage")
public class PictureContriller {

    @Autowired
    private PictureService pictureService;

    @PostMapping("/upload")
    public String savePic(@RequestParam("file") MultipartFile file, @RequestParam("userId") Integer userId){
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        try {
            InputStream is = file.getInputStream();
            Picture u = new Picture();
            u.setPicId(userId);
            byte[] pic = new byte[(int)file.getSize()];
            is.read(pic);
            u.setPic(pic);
            pictureService.addUser(u);
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @GetMapping(value="/getPhoto")
    public void getPhotoById(final HttpServletResponse response,Integer userId) throws IOException {
        Picture picture = pictureService.getLastPic(userId);
        byte[] data = picture.getPic();
        response.setContentType("image/jpeg");
        response.setCharacterEncoding("UTF-8");
        OutputStream outputSream = response.getOutputStream();
        InputStream in = new ByteArrayInputStream(data);
        int len = 0;
        byte[] buf = new byte[1024];
        while ((len = in.read(buf, 0, 1024)) != -1) {
            outputSream.write(buf, 0, len);
        }
        outputSream.close();
    }
}
