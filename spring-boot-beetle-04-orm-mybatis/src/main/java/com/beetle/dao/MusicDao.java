package com.beetle.dao;

import com.beetle.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicDao {
    //@Select("select id, name, label from music")
    List<Music> selectMusics();
}
