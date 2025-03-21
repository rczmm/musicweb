// 新增Song的Mapper接口（假设已存在Song实体）
package com.rcz.music.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rcz.music.entity.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface SongMapper extends BaseMapper<Song> {
}