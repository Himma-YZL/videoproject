package com.video.service;

import com.video.entity.VideoType;

import java.util.List;

public interface VideoTypeService {

    VideoType selectByPrimaryKey(Integer id);

    List<VideoType> getAllVideoType();

}
