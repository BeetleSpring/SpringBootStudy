package com.beetle.service;

import com.beetle.dao.MusicDao;
import com.beetle.entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicDao dao;

    public List<Music> selectAll(){
       return dao.selectMusics();
    }


}
