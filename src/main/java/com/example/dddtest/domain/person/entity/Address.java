package com.example.dddtest.domain.person.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Description: 领域层：实体-地址
 * @Author: chensd
 * @date 2022/2/8 21:08
 */
@Data
@Slf4j
@Component
public class Address {
    private String id;

    private String province;

    private String city;

    private String area;

    /**
     * 新增地址
     * @return
     */
    public boolean createAddress() {
        log.info("领域层: 新增地址成功");
        return true;
    }

    /**
     * 修改地址
     * @return
     */
    public boolean updateAddress() {
        log.info("领域层: 修改地址成功");
        return true;
    }
}
