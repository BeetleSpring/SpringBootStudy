package com.beetle.conteroller;

import com.beetle.model.Music;
import com.beetle.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {



    @Autowired
    MusicService musicService;

    @GetMapping
    public String index(Model model){
        List<Music> list = musicService.getMusicList();
        model.addAttribute("musicList",list);
        System.out.println(list.size());

        return "list";
    }
}
