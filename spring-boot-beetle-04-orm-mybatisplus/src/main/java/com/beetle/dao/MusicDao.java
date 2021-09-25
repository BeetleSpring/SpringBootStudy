package com.beetle.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beetle.entity.Music;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicDao extends BaseMapper<Music> {
    //@Select("select id, name, label from music")
    //List<Music> selectMusics();
}
