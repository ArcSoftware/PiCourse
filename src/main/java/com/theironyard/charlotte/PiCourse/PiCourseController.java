package com.theironyard.charlotte.PiCourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PiCourseController {
    private RaspberryPiManager piManager;

    public PiCourseController() {
        piManager = new RaspberryPiManager();
    }
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(String led){
        if (led != null) {
            piManager.toggleLED(led);
        }
        return "index";
    }

}
