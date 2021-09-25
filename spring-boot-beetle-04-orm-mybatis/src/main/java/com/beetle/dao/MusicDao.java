package com.beetle.dao;

import com.beetle.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MusicDao {
    //@Select("select id, name, label from music")
    List<Music> selectMusics();
}
