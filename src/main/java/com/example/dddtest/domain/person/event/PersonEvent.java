package com.example.dddtest.domain.person.event;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description: 领域层：领域事件-事件实体
 * @Author: chensd
 * @date 2022/2/8 20:44
 */
@Data
@Slf4j
@Component
public class PersonEvent extends DomainEvent<String>{

    /**
     * 领域事件-客户以创建
     * @return
     */
    public boolean personEventProcess() {
        log.info("领域层：客户已创建发布成功");
        return true;
    }
}
