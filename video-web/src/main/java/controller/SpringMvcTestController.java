package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SpringMvcTestController {
    public static Logger log=Logger.getLogger(TestController.class);
    private static final String SPRINGMVC="Test";

    @RequestMapping("/Hello")
    public String SpringMvcTest(){
        log.info("log4j Test!");
        return SPRINGMVC;
    }
}
