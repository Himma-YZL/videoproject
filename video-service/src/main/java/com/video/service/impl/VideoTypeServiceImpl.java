package com.video.service.impl;

import com.video.dao.VideoTypeMapper;
import com.video.entity.VideoType;
import com.video.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoTypeServiceImpl implements VideoTypeService {
    @Autowired
    VideoTypeMapper videoTypeMapper;
    public VideoType selectByPrimaryKey(Integer id) {
        return videoTypeMapper.selectByPrimaryKey(id);
    }


}
