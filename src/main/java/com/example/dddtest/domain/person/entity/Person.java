package com.example.dddtest.domain.person.entity;

import com.example.dddtest.domain.person.repository.facade.PersonRepositoryInterface;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * @Description: 领域层：聚合根-个人客户
 * @Author: chensd
 * @date 2022/2/8 14:48
 */
@Data
@Slf4j
@Component
@JsonIgnoreProperties(value = {"personRepositoryInterface", "personInfo"})  //忽略值为null的字段
public class Person implements Serializable {
    private static final long serialVersionUID = -278380890175091337L;

    @Resource
    private PersonRepositoryInterface personRepositoryInterface;


    /**
     * 个人客户id
     */
    private String id;

    /**
     * 个人客户名称
     */
    private String name;

    /**
     * 个人客户年龄
     */
    private String age;

    /**
     * 客户证件类型
     */
    private IdType idType;

    /**
     * 客户证件类型
     */
    private PhoneNumber phoneNumber;

    /**
     * 地址
     */
    private Address address;

    /**
     * 银行账号
     */
    private BankAccount bankAccount;


    /*充血模型范例*/
    /**
     * 创建个人客户信息
     */
    public boolean createPersonInfo() {
        log.info("领域层：创建个人客户信息成功");
        return true;
    }

    /**
     * 修改个人客户信息
     */
    public boolean updatePersonInfo() {
        log.info("领域层：修改个人客户信息成功");
        return true;
    }

    /**
     * 查询个人客户信息
     */
    // @JsonIgnore  //忽略值为null的字段
    public Person getPersonInfo() {
        log.info("领域层：查询个人客户信息成功");

        // List<Person> personList = personRepositoryInterface.personRepositoryInterface();

        String personId = createPersonId();
        this.id = personId;
        this.name = "小明";
        this.age = "20";

        // Person person = new Person();
        // person.setId(createPersonId());
        // person.setName("小黄");
        // person.setAge("20");

        return this;
    }

    /**
     * 生成客户编码
     * @return
     */
    public String createPersonId () {
        log.info("领域层：生成客户编码成功");
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
