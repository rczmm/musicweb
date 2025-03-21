package com.rcz.music.controller;

import com.rcz.music.entity.Song;
import com.rcz.music.entity.Playlist;
import com.rcz.music.service.SongService;
import com.rcz.music.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;


@RestController
@RequestMapping("music")
public class MusicController {

    private final SongService songService;
    private final PlaylistService playlistService;

    @Autowired
    public MusicController(SongService songService, PlaylistService playlistService) {
        this.songService = songService;
        this.playlistService = playlistService;
    }

    @Operation(summary = "获取所有歌曲", description = "返回系统中所有歌曲的列表")
    @GetMapping("/songs")
    public List<Song> getSongs() {
        return songService.listAllSongs();
    }

    @Operation(summary = "获取所有歌单", description = "返回系统中所有歌单的列表")
    @GetMapping("/playlists")
    public List<Playlist> getPlaylists() {
        return playlistService.list();
    }
}