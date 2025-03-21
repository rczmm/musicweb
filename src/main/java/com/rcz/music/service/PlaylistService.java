package com.rcz.music.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rcz.music.entity.Playlist;
import com.rcz.music.entity.Song;
import java.util.List;

public interface PlaylistService extends IService<Playlist> {
    // 新增方法声明
    List<Song> getSongsByPlaylistId(Long playlistId);


}