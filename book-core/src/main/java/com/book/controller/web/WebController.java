package com.book.controller.web;

import com.book.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Web") //khai báo value khi 2 controller của admin và web giống nhau thôi
public class WebController {
    @RequestMapping(value = "/trangchu", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("web/home");
//        UserDTO user=new UserDTO();
//        user.setFullName("Wellcome Web");
//        mav.addObject("user",user);
        return mav;
    }
}
