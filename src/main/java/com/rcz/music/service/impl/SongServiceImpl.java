package com.rcz.music.service.impl;

import com.rcz.music.entity.Song;
import com.rcz.music.mapper.SongMapper;
import com.rcz.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongMapper songMapper;

    @Autowired
    public SongServiceImpl(SongMapper songMapper) {
        this.songMapper = songMapper;
    }

    @Override
    public List<Song> listAllSongs() {
        return songMapper.selectList(null); // 直接返回List
    }
}