package com.rcz.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rcz.music.entity.Playlist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaylistMapper extends BaseMapper<Playlist> {
}