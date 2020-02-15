package com.example.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafControl {

    @RequestMapping("/welcome")
    public ModelAndView test(ModelAndView mv)
    {
        mv.setViewName("/welcome");
        mv.addObject("title","欢迎使用thymeleaf");
        return mv;
    }

}
