package controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.video.entity.VideoInfo;
import com.video.entity.VideoType;
import com.video.entity.vo.VideoInfoVo;
import com.video.service.VideoInfoService;
import com.video.service.VideoTypeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class VideoInfoController {

    @Autowired
    private VideoInfoService videoInfoService;

    @Autowired
    private VideoTypeService videoTypeService;

    private static final String VIDEOINFOVIEW ="video";

    private static final String ADDVIDEOVIEW ="addVideo";

    private static final String VIDEOSHOWVIEW ="videoShow";


    private Logger log=Logger.getLogger(VideoInfoController.class);
    @RequestMapping("/video")
    public String getAllVideoInfo(HttpServletRequest request){
        //pageHelper分页，一定要在调用dao方法之前使用
        Page startPage = PageHelper.startPage(1, 3);
        List<VideoInfoVo> videoInfoVoList=videoInfoService.getAllVideoInfo();
        log.info(videoInfoVoList.toString());
        request.setAttribute("videoInfos",videoInfoVoList);
        return VIDEOINFOVIEW;
    }
    @RequestMapping("/addVideoView")
    public String addVideoView(HttpServletRequest request){
        List<VideoType> videoTypeList=videoTypeService.getAllVideoType();
        request.setAttribute("videoTypeList",videoTypeService.getAllVideoType());
        return ADDVIDEOVIEW;
    }
    @RequestMapping("/videoShow")
    public String videoShow(HttpServletRequest request,int id){
        List<VideoType> videoTypeList=videoTypeService.getAllVideoType();
        request.setAttribute("videoInfos",videoInfoService.selectByPrimaryKey(id));
        return VIDEOSHOWVIEW;
    }

    @RequestMapping("/addVideo")
    public String addVideo(HttpServletRequest request, VideoInfo videoInfo, @RequestParam("file") MultipartFile multipartFile){
       String path="E:\\ideaproject\\videoproject\\video-web\\src\\main\\webapp\\static\\imgs";
       String fileName=multipartFile.getOriginalFilename();
       //判断照片格式
       if (fileName.substring(fileName.lastIndexOf(".")).equals(".png")||fileName.substring(fileName.lastIndexOf(".")).equals(".jpg")){
           String imgName= UUID.randomUUID()+".png";
           File file=new File(path,imgName);
           if (!file.exists()){
               file.mkdir();
           }
           try {
               multipartFile.transferTo(file);
           } catch (IOException e) {
               e.printStackTrace();
               request.setAttribute("img","图片上传失败！");
               return ADDVIDEOVIEW;
           }
           videoInfo.setVideoUrl(imgName);
           int resours=videoInfoService.insertSelective(videoInfo);
           if (resours>0){
               request.setAttribute("msg","视频上传成功！");
               return "redirect:/video";
           }else {
               request.setAttribute("msg","视频上传失败!");
               return ADDVIDEOVIEW;
           }
       }
        request.setAttribute("img","图片格式错误!");
        return ADDVIDEOVIEW;
    }
}
