package com.beetle.service.imp;

import com.beetle.dao.MusicDao;
import com.beetle.model.Music;
import com.beetle.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImp1 implements MusicService {


    @Autowired
    MusicDao musicDao;
    @Override
    public List<Music> getMusicList() {
       return musicDao.selectList();
    }

    @Override
    public void addMusic(Music music) {
        musicDao.add(music);
    }

    @Override
    public void deleteMusic(String name) {
        musicDao.deleteMusic(name);
    }

    @Override
    public void updateMusic(Music music) {

        musicDao.updateMusic(music);
    }
}
