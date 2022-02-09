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
public class BankAccount {
    private String id;

    private String cardCode;


    /**
     * 创建银行账号
     * @return
     */
    public boolean createBankAccount() {
        log.info("领域层: 创建银行账号成功");
        return true;
    }

    /**
     * 修改银行账号
     * @return
     */
    public boolean updateBankAccount() {
        log.info("领域层: 修改银行账号成功");
        return true;
    }
}
