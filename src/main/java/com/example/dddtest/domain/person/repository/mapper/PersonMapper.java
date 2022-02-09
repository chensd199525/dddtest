package com.example.dddtest.domain.person.repository.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dddtest.domain.person.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Author: chensd
 * @date 2022/2/8 22:01
 */
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}
