package com.video.entity.vo;

public class VideoInfoVo {
    private Integer id;

    private String videoName;

    private String videoUrl;

    private String videoHtml;

    private Integer videoTypeId;

    private Integer videoDel;

    private String typeName;

    public VideoInfoVo() {
    }

    public VideoInfoVo(Integer id, String videoName, String videoUrl, String videoHtml, Integer videoTypeId, Integer videoDel, String typeName) {
        this.id = id;
        this.videoName = videoName;
        this.videoUrl = videoUrl;
        this.videoHtml = videoHtml;
        this.videoTypeId = videoTypeId;
        this.videoDel = videoDel;
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "VideoInfoVo{" +
                "id=" + id +
                ", videoName='" + videoName + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", videoHtml='" + videoHtml + '\'' +
                ", videoTypeId=" + videoTypeId +
                ", videoDel=" + videoDel +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoHtml() {
        return videoHtml;
    }

    public void setVideoHtml(String videoHtml) {
        this.videoHtml = videoHtml;
    }

    public Integer getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(Integer videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public Integer getVideoDel() {
        return videoDel;
    }

    public void setVideoDel(Integer videoDel) {
        this.videoDel = videoDel;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
