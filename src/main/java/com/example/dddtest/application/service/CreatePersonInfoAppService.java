package com.example.dddtest.application.service;

import com.example.dddtest.application.event.publish.PersonEventPublish;
import com.example.dddtest.domain.person.entity.Person;
import com.example.dddtest.domain.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description: 应用层：应用服务-创建个人客户信息
 * @Author: chensd
 * @date 2022/2/8 14:50
 */
@Slf4j
@Service
public class CreatePersonInfoAppService {

    @Resource
    private PersonEventPublish personEventPublish;
    @Resource
    private PersonService personService;

    public boolean createPersonInfoAppService() {
        log.info("应用服务：创建个人客户信息成功");
        //1.调用领域服务中创建个人客户信息接口
        Person person = new Person();
        boolean personInfoDomService = personService.createPersonInfoDomService();
        if (personInfoDomService) {
            //2.如果创建成功，则发布领域事件
            boolean b = personEventPublish.personEventProcess();
            if (b) {
                log.info("应用服务：领域事件-客户已创建发布成功");
            } else {
                log.info("应用服务：领域事件-客户已创建发布失败");
            }
        }

        return personInfoDomService;
    }
}
