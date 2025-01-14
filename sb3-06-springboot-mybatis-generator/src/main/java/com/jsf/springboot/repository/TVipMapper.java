package com.jsf.springboot.repository;

import com.jsf.springboot.model.TVip;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface TVipMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TVip record);

    int insertSelective(TVip record);

    TVip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TVip record);

    int updateByPrimaryKey(TVip record);
}