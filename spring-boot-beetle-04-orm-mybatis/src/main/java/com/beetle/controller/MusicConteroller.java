package com.beetle.controller;

import com.beetle.entity.Music;
import com.beetle.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MusicConteroller {

    @Autowired
    MusicService service;

    @ResponseBody
    @RequestMapping("music")
    public String index(){
       List<Music> musicList = service.selectAll();
       for(Music music:musicList){
           System.out.println(music);
       }
       return "2";
    }


}
