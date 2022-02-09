package com.example.dddtest.domain.person.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Description: 领域层：值对象-客户证件类型
 * @Author: chensd
 * @date 2022/2/8 17:45
 */
@Data
@Component
public class IdType {
    private String type;
}
