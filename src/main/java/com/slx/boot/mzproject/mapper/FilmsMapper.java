package com.slx.boot.mzproject.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.slx.boot.mzproject.bean.Films;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface FilmsMapper extends BaseMapper<Films> {
    @Select("SELECT * FROM films")
    List<Films> selectFilmsList(Page<Films> page);

}
