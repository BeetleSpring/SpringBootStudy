package com.beetle.service;

import com.beetle.model.Music;
import com.beetle.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicRepository repository;


    public List<Music> getMusicList() {

        return repository.findAll();
    }
}
