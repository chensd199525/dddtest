package com.example.dddtest.application.service;

import com.example.dddtest.domain.person.entity.Person;
import com.example.dddtest.domain.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 应用层：应用服务-查询个人客户信息
 * @Author: chensd
 * @date 2022/2/8 14:55
 */
@Slf4j
@Service
public class GetPersonInfoAppService {

    @Resource
    private PersonService personService;

    public Person getPersonInfoAppService() {
        log.info("应用服务：查询个人客户信息成功");
        Person person = personService.getPersonInfoDomService();
        return person;
    }
}
