package com.beetle.service;

import com.beetle.entity.Music;

import java.util.List;

public interface MusicService {

     List<Music> getMusicList();

     void addMusic(Music music);

     void deleteMusic(String name);

     void updateMusic(Music music);
}
