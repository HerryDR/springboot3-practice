package com.jsf.sb305springbootmybatis.repository;

import com.jsf.sb305springbootmybatis.model.Vip;

import java.util.List;

/**
 * @Description
 * @FileName VipMapper
 * @Author JSF
 * @date 2024-12-24
 **/
public interface VipMapper {
    int insert(Vip vip);
    int deleteById(Long id);
    int update(Vip vip);
    Vip selectById(Long id);
    List<Vip> selectAll();
}
