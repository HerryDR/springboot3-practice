package com.jsf.sb307externalconfig.service;

import com.jsf.sb307externalconfig.bean.CollectionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName CollectionConfigService
 * @Author JSF
 * @date 2024-12-20
 **/
@Service("collectionConfigService")
public class CollectionConfigService {
    @Autowired
    private CollectionConfig collectionConfig;

    public void printInfo() {
        System.out.println(collectionConfig);
    }
}
