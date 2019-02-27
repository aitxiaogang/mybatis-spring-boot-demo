package com.xiaogang.mybatisspringbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/27 22:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        try {
            return "Hello world";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

}
