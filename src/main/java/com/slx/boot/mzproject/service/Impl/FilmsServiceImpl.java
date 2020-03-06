package com.slx.boot.mzproject.service.Impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.slx.boot.mzproject.bean.Films;
import com.slx.boot.mzproject.mapper.FilmsMapper;
import com.slx.boot.mzproject.service.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

@Service
public class FilmsServiceImpl extends ServiceImpl<FilmsMapper,Films> implements FilmsService {

    @Autowired
    private FilmsMapper filmsMapper;

    @Override
    public Page<Films> selectFilmsPage(Page<Films> page) {
        page = page.setRecords(baseMapper.selectFilmsList(page));
        return page;
    }
}
