package com.example.dddtest.application.service;

import com.example.dddtest.domain.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 应用层：应用服务-修改个人客户信息
 * @Author: chensd
 * @date 2022/2/8 14:53
 */
@Slf4j
@Service
public class UpdatePersonInfoAppService {

    @Resource
    private PersonService personService;

    public boolean updatePersonInfoAppService() {
        log.info("应用服务：修改个人客户信息成功");
        boolean b = personService.updatePersonInfoDomService();
        return b;
    }
}
