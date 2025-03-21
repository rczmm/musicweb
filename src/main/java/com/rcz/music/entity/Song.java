package com.rcz.music.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data // 新增Lombok注解自动生成getter/setter
@TableName("song")
public class Song {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String singer;
    private String album;
    private String path;

    // 删除原有注释
    // // Getters and Setters
}