package com.rcz.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rcz.music.entity.PlaylistSong;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface PlaylistSongMapper extends BaseMapper<PlaylistSong> {
}