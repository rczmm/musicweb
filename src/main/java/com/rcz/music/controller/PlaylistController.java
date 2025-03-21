package com.rcz.music.controller;

import com.rcz.music.entity.Song;
import com.rcz.music.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    private final PlaylistService playlistService;

    @Autowired
    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping("getSong")
    public List<Song> getPlaylistSongs(@RequestParam("id") Long playlistId) {
        return playlistService.getSongsByPlaylistId(playlistId);
    }
}