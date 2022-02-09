package com.example.dddtest.domain.person.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Description: 领域层：实体-电话
 * @Author: chensd
 * @date 2022/2/8 20:43
 */
@Data
@Component
public class PhoneNumber {
    private String id;

    private String phoneNumber;
}
