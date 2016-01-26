package com.deppon.mbi.agile.core.controller;

import com.deppon.mbi.agile.core.context.SessionConstants;
import com.deppon.mbi.agile.core.domain.auth.User;
import com.deppon.mbi.agile.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * Created by sunyamorn on 1/27/16.
 */
@Controller
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/authentication/login", method = RequestMethod.GET)
    public ModelAndView indexPage(@RequestParam(value = "login", required = false) String login,
                                  @RequestParam(value = "error", required = false) String error,
                                  @RequestParam(value = "logout", required = false) String logout,
                                  ModelAndView modelAndView) {
        if (login != null) {
            modelAndView.addObject("msg", "Login");
        }

        if (error != null) {
            modelAndView.addObject("msg", "Invalid username and password!");
        }

        if (logout != null) {
            modelAndView.addObject("msg", "Logout success.");
            modelAndView.setViewName("authentication/logout");
            return modelAndView;
        }
        modelAndView.setViewName("authentication/login");
        return modelAndView;
    }

    @RequestMapping(value = "/core/main", method = RequestMethod.GET)
    public ModelAndView loginSuccess(Principal principal, HttpSession httpSession, ModelAndView modelAndView) {
        String userId = principal.getName();
        User user = userService.query(userId);
        httpSession.setAttribute(SessionConstants.USER, user);
        modelAndView.setViewName("core/main");
        return modelAndView;
    }

}
