package com.example.dddtest.application.event.publish;

import com.example.dddtest.domain.person.event.PersonEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description: 应用层： 事件发布：客户已创建
 * @Author: chensd
 * @date 2022/2/8 14:56
 */
@Component
public class PersonEventPublish {

    @Resource
    private PersonEvent personEvent;


    public boolean personEventProcess () {
        boolean b = personEvent.personEventProcess();
        return b;
    }

}
