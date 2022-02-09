package com.example.dddtest.domain.person.service;

import com.example.dddtest.domain.person.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 领域层：领域服务-创建个人客户信息
 * @Author: chensd
 * @date 2022/2/8 21:18
 */
@Slf4j
@Service
public class PersonService {

    @Resource
    private Person person;

    /**
     * 创建个人客户信息
     * @return
     */
    public boolean createPersonInfoDomService() {
        log.info("领域服务：创建个人客户信息成功");
        boolean personInfo = person.createPersonInfo();

        return personInfo;
    }

    /**
     * 修改个人客户信息
     * @return
     */
    public boolean updatePersonInfoDomService() {
        log.info("领域服务：修改个人客户信息成功");
        boolean personInfo = person.updatePersonInfo();

        return personInfo;
    }

    /**
     * 查询个人客户信息
     * @return
     */
    public Person getPersonInfoDomService() {
        log.info("领域服务：查询个人客户信息成功");
        Person personEntity = person.getPersonInfo();

        return personEntity;
    }
}
