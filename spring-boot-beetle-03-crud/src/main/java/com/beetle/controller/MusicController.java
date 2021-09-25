package com.beetle.controller;

import com.beetle.model.Music;
import com.beetle.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    MusicService musicService;

    @GetMapping
    public String index(Model model){

        model.addAttribute("musicList",musicService.getMusicList());
        return "list";
    }
    @GetMapping("/addPage")
    public String addPage(){
        return "addPage";
    }

    @PostMapping
    public String add(Music music){
        musicService.addMusic(music);
        return "redirect:/music";
    }

    @DeleteMapping("/{name}")
    public String deleteMusic(@PathVariable("name")String name){
        System.out.println("delete");
        musicService.deleteMusic(name);
        return "redirect:/music";
    }

    @GetMapping("/updatePage")
    public String updatePage(Model model,Music music){
        model.addAttribute("music",music);
        return "updatePage";
    }

    @PutMapping
    public String updateMusic(Music music){
        System.out.println("update");
        musicService.updateMusic(music);
        return "redirect:/music";
    }



}
