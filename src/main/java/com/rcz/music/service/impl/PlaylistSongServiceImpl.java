package com.rcz.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rcz.music.entity.PlaylistSong;
import com.rcz.music.mapper.PlaylistSongMapper;
import com.rcz.music.service.PlaylistSongService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistSongServiceImpl extends ServiceImpl<PlaylistSongMapper, PlaylistSong> implements PlaylistSongService {
}
