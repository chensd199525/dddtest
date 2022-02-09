package com.example.dddtest.domain.person.event;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Description: 领域层：领域事件-事件基类
 * @Author: chensd
 * @date 2022/2/8 17:01
 */

@Data
@Component
public class DomainEvent<T> {
    private String id;
    private Long timestamp;
    private String source;
    private T data;
}
