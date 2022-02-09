package com.example.dddtest.domain.person.repository.persistence;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dddtest.domain.person.entity.Person;
import com.example.dddtest.domain.person.repository.facade.PersonRepositoryInterface;

import com.example.dddtest.domain.person.repository.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 领域层：仓储实现
 * @Author: chensd
 * @date 2022/2/8 21:48
 */
@Service
public class PersonRepositoryImpl implements PersonRepositoryInterface {

    @Resource
    private PersonMapper personMapper;

    @Override
    public List<Person> personRepositoryInterface() {
        Wrapper<Person> queryWrapper = new QueryWrapper<>();

        List<Person> personList = personMapper.selectList(queryWrapper);
        return personList;
        // List<Person> personList = new ArrayList<>();
        // return personList;
    }
}
