package com.rcz.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rcz.music.entity.Playlist;
import com.rcz.music.entity.PlaylistSong;
import com.rcz.music.entity.Song;
import com.rcz.music.mapper.PlaylistMapper;
import com.rcz.music.mapper.PlaylistSongMapper;
import com.rcz.music.mapper.SongMapper;
import com.rcz.music.service.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl extends ServiceImpl<PlaylistMapper, Playlist> implements PlaylistService {

    private final SongMapper songMapper;

    private final PlaylistSongMapper playlistSongMapper;


    @Override
    public List<Song> getSongsByPlaylistId(Long playlistId) {
        List<Long> songList = playlistSongMapper.selectList(new LambdaQueryWrapper<PlaylistSong>()
                        .eq(PlaylistSong::getPlaylistId, playlistId)
                        .select(PlaylistSong::getSongId))
                .stream()
                .map(PlaylistSong::getSongId)
                .toList();
        if (!songList.isEmpty()) {
            return songMapper.selectByIds(songList);
        }
        return List.of();
    }


}