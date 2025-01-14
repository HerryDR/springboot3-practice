package com.jsf.sb307ssm.service.impl;

import com.jsf.sb307ssm.model.Vip;
import com.jsf.sb307ssm.repository.VipMapper;
import com.jsf.sb307ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName VipServiceImpl
 * @Author JSF
 * @date 2024-12-25
 **/
@Service("vipService")
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;


    @Override
    public Vip getById(Long id) {
        return vipMapper.selectByPrimaryKey(id);
    }
}
