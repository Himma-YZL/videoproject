package com.video.service;

import com.video.entity.VideoInfo;
import com.video.entity.vo.VideoInfoVo;

import java.util.List;

public interface VideoInfoService {

    List<VideoInfoVo> getAllVideoInfo();

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer id);

}
