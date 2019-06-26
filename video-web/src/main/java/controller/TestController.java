package controller;

import com.video.entity.VideoType;
import com.video.service.VideoTypeService;
import com.video.service.impl.VideoTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private VideoTypeService videoTypeService;
    @ResponseBody
    @RequestMapping("/SSM")
    public VideoType getAllVideoType(int i){
        i=1;
        return videoTypeService.selectByPrimaryKey(i);
    }
}
