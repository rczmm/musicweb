package com.rcz.music.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

@Data // 新增Lombok注解自动生成getter/setter
@TableName("playlist")
public class Playlist {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String creator;
    private String description;
    private Date createTime; // 修正字段类型大小写

    // 删除原有注释
    // // Getters and Setters
}