package com.slx.boot.mzproject.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.slx.boot.mzproject.bean.Films;
import com.slx.boot.mzproject.bean.Result;
import com.slx.boot.mzproject.service.FilmsService;
import com.slx.boot.mzproject.service.Impl.FilmsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FilmsController{

    @Autowired
    private FilmsService filmsService;

    @ResponseBody
    @RequestMapping("/page")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public Object selectPage(){
        Page page=new Page(1,10);
        page = filmsService.selectFilmsPage(page);

        Result result = new Result();
        result.setCode(0);
        result.setMsg("OK");
        result.setData(page.getRecords());
        result.setTotalPage(page.getTotal());
        return result;
    }
}
