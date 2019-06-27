package com.video.dao;

import com.video.entity.VideoInfo;
import com.video.entity.vo.VideoInfoVo;

import java.util.List;

public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);

    List<VideoInfoVo> getAllVideoInfo();
}