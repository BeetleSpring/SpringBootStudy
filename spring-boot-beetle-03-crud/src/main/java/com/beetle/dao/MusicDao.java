package com.beetle.dao;

import com.beetle.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicDao {

    private static List<Music> musicList = new ArrayList<>();
    static {
        musicList.add(new Music("许嵩","导师"));
        musicList.add(new Music("薛之谦","导师"));
        musicList.add(new Music("戴佩妮","导师"));
        musicList.add(new Music("Matt吕彦良","歌手"));
        musicList.add(new Music("郁一凡","歌手"));
        musicList.add(new Music("郑闯","歌手"));
    }

    public List<Music> selectList(){//获取所有成员信息
        return musicList;
    }

    public void add(Music music){
        musicList.add(music);
    }

    public void deleteMusic(String name){
        for(Music music:musicList){
            if(music.getName().equals(name)){
                musicList.remove(music);
                return;
            }
        }
    }
    public void updateMusic(Music music){
        for(int i =0;i< musicList.size();i++){
            Music music1 = musicList.get(i);
            if(music1.getName().equals(music.getName())){
                music1.setLabel(music.getLabel());
                return;
            }
        }
    }

}
