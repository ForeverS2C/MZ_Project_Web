package com.slx.boot.mzproject.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.slx.boot.mzproject.bean.Films;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;


@Service
public interface FilmsService extends IService<Films> {
    Page<Films> selectFilmsPage(Page<Films> page);
}
