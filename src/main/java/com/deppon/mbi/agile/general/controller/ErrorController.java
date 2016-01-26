package com.deppon.mbi.agile.general.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunyamorn on 1/27/16.
 *
 * Error Controller
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping(value = "404")
    public String error404() {
        return "global/error/404";
    }

    @RequestMapping(value = "500")
    public String error500() {
        return "global/error/500";
    }

    @RequestMapping(value = "403")
    public String error403() {
        return "global/error/403";
    }

    @RequestMapping(value = "expire")
    public String expire() {
        return "global/error/expire";
    }
}
