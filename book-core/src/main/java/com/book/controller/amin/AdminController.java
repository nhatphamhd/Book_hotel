package com.book.controller.amin;

import com.book.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "Admin")
public class AdminController {
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("admin/home");
        UserDTO user=new UserDTO();
        user.setFullName("Wellcome Admin");
        mav.addObject("user",user.getFullName());
        return mav;
    }
}
