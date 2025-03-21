package com.rcz.music.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("playlist_song")
public class PlaylistSong {
    private Long playlistId; // 对应playlist_id字段
    private Long songId;     // 对应song_id字段
}