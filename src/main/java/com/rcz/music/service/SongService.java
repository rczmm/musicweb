package com.rcz.music.service;

import com.rcz.music.entity.Song;

import java.util.List;

public interface SongService {
    List<Song> listAllSongs(); // 修改返回类型为List
}