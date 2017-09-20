package com.phym.controller;

import com.alibaba.fastjson.JSON;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@RestController
@RequestMapping("upload")
public class  UplodifyController{

  @RequestMapping(value = "/one.do", method = RequestMethod.POST)
  public String uploadFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //String fileName = (String)request.getAttribute("filename");
    MultipartHttpServletRequest multipartRequest = 
    (MultipartHttpServletRequest) request;
    Iterator<String> fileNames = multipartRequest.getFileNames();
    MultipartFile multipartFile = multipartRequest.getFile(fileNames.next());
   
    //原始名字
    String name = multipartFile.getOriginalFilename();
    String fileType = name.split("[.]")[1];
    
    System.out.println("name"+fileType);
    String uuid = UUID.randomUUID().toString().replace("-","");
    
    //新的文件的名字
    String  fname = uuid+"."+fileType;
    System.out.println(fname);
    
    String filePath = request.getSession().getServletContext().getRealPath("/");
    System.out.println("filePath:"+filePath);
    String finalPath=saveFile(fname,fileType,filePath, multipartFile.getBytes());
   
    
    Map<String, String> resultMap = new HashMap<String, String>(5);
    resultMap.put("result", "success");
    resultMap.put("filePath", finalPath);
    return JSON.toJSONString(resultMap);
  }

  //保存文件
  public String saveFile( String fname,String fileType,String filePath, byte[] content) throws IOException {
    BufferedOutputStream bos = null;
    String fil =null;
    try {
    	if(fileType.equals("jpg")||fileType.equals("jpeg")||fileType.equals("png")){
    		 fil=filePath+"imgs\\"+fname;
    	}else if(fileType.equals("mp4")){
    		 fil=filePath+"videos\\"+fname;
    	}else if(fileType.equals("mp4")) {
    		fil=filePath+"files\\"+fname;
    	}else{
    		throw new RuntimeException("类型不匹配");
    	}
    	File file = new File(fil);
		//判断路径是否存在
    	if (!file.getParentFile().exists()) {
    		//文件路径不存在时，创建保存文件所需要的路径
	        file.getParentFile().mkdirs();
	        System.out.println("22222222222222");
	      }
    	//创建文件（这是个空文件，用来写入上传过来的文件的内容）
	      file.createNewFile();
	      System.out.println("33333333333");
	      bos = new BufferedOutputStream(new FileOutputStream(file));
	      bos.write(content);
	      System.out.println("44444444444");
	      return fil;
    } catch (FileNotFoundException e) {
    	throw new FileNotFoundException("文件不存在。");
    } finally {
      if (null != bos) {
        bos.close();
      }
    }
  }

}