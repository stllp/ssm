package com.lvlp.stu.file.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @Author lvlp
 * @create 2024/9/7 7:04
 */
@RestController
@RequestMapping("/file")
public class FileUploadController {
    //    @PostMapping("/update")
    public String update(String nickname, MultipartFile headPictrue) throws IOException {
        System.out.println("nickname = " + nickname);
        System.out.println("文件的表单名：" + headPictrue.getName());
        System.out.println("源文件名称：" + headPictrue.getOriginalFilename());
        System.out.println("文件的大小：" + headPictrue.getSize());
        System.out.println("文件的数组：" + headPictrue.getBytes());
        System.out.println("文件的输入流对象：" + headPictrue.getInputStream());
        return "ok";
    }

    @Autowired
    private ServletContext servletContext;

    /**
     * 文件转存
     *
     * @param nickname
     * @param headPictrue
     * @param backgroundPictrue
     * @return
     * @throws IOException
     */
    @PostMapping("/update")
    public String fileUpdate(String nickname, MultipartFile headPictrue, MultipartFile backgroundPicture) throws IOException {
        System.out.println("nickname = " + nickname);
        String realPath = servletContext.getRealPath("/images");
        System.out.println("realPath = " + realPath);
        String uuid1 = UUID.randomUUID().toString().replace("-", "");
        String newFilename1 = uuid1 + headPictrue.getOriginalFilename();
        String uuid2 = UUID.randomUUID().toString().replace("-", "");
        String newFilename2 = uuid2 + backgroundPicture.getOriginalFilename();
        headPictrue.transferTo(new File(realPath + File.separator + newFilename1));
        backgroundPicture.transferTo(new File(realPath + File.separator + newFilename2));
        return "ok";
    }

    @GetMapping("/down")
    public ResponseEntity fileDown(String filename) throws IOException {
        //1、获取 存储图片的真实路径
        String realPath = servletContext.getRealPath("/images");
        //2、拼接图片地址
        String imageRealOath = realPath + File.separator + filename;
        //3、读取图片数据
        FileInputStream fileInputStream = new FileInputStream(imageRealOath);
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        //4、将图片数据以byte[]的形式响应给客户端，并告知客户端，该数据要以下载的形式
        //4.1 先设置响应头，告诉浏览器，这是附件，要下载
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("content-disposition", "attachment;filename=" + URLEncoder.encode(filename, "UTF-8"));
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
        return responseEntity;
    }
}
