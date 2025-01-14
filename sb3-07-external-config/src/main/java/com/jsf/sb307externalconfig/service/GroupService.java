package com.jsf.sb307externalconfig.service;

import com.jsf.sb307externalconfig.bean.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName GroupService
 * @Author JSF
 * @date 2024-12-23
 **/
@Service("groupService")
public class GroupService {
    @Autowired
    private Group group;
    public void printInfo() {
        System.out.println(group);
    }
}
