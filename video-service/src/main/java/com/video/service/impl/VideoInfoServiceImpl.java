package com.video.service.impl;

import com.video.dao.VideoInfoMapper;
import com.video.entity.VideoInfo;
import com.video.entity.vo.VideoInfoVo;
import com.video.service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoServiceImpl implements VideoInfoService {
    @Autowired
    private VideoInfoMapper videoInfoMapper;
    public List<VideoInfoVo> getAllVideoInfo() {
        return videoInfoMapper.getAllVideoInfo();
    }

    public int insertSelective(VideoInfo record) {
        return videoInfoMapper.insertSelective(record);
    }

    public VideoInfo selectByPrimaryKey(Integer id) {
        return videoInfoMapper.selectByPrimaryKey(id);
    }
}
