package controller;

import com.video.entity.VideoType;
import com.video.service.VideoTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class VideoTypeController {

    @Autowired
    private VideoTypeService videoTypeService;

    private static final String ADDVIDEOVIEW="addVideo";

    @RequestMapping("/getAllVideoType")
    public String getAllVideoType(HttpServletRequest request){
        request.setAttribute("videoTypeList",videoTypeService.getAllVideoType());
        return ADDVIDEOVIEW;
    }
}
