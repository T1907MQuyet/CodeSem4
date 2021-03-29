package com.example.uploadfilespring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller

public class UploadingController {
    public  static  final String uploadingDir = System.getProperty("user.dir")+"/uploadingDir/";

    @RequestMapping("/")
    public  String uploading(Model model){
        File file = new File(uploadingDir);
        model.addAttribute("file",file.listFiles());
        return  "uploading";
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public  String uploadingPost(@RequestParam("uploadingFile")MultipartFile[] uploadFiles) throws IOException {
        for (MultipartFile uploadFile:uploadFiles){
            File file =  new File(uploadingDir + uploadFile.getOriginalFilename());
            uploadFile.transferTo(file);
        }
        return "redirect:/";
    }
}
