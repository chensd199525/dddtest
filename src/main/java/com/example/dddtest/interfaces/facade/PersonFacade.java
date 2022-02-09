package com.example.dddtest.interfaces.facade;

import com.example.dddtest.application.service.CreatePersonInfoAppService;
import com.example.dddtest.application.service.GetPersonInfoAppService;
import com.example.dddtest.application.service.UpdatePersonInfoAppService;
import com.example.dddtest.domain.person.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: chensd
 * @date 2022/2/8 21:50
 */
@RestController
@RequestMapping("/ddd/person")
public class PersonFacade {
    @Resource
    private CreatePersonInfoAppService createPersonInfoAppService;
    @Resource
    private GetPersonInfoAppService getPersonInfoAppService;
    @Resource
    private UpdatePersonInfoAppService updatePersonInfoAppService;

    @GetMapping("/createPersonInfoAppService")
    public boolean createPersonInfoAppService () {
        boolean personInfoAppService = createPersonInfoAppService.createPersonInfoAppService();
        return personInfoAppService;
    }


    @GetMapping("/getPersonInfoAppService")
    public Person getPersonInfoAppService () {
        Person person = getPersonInfoAppService.getPersonInfoAppService();
        return person;
    }

    @GetMapping("/updatePersonInfoAppService")
    public boolean updatePersonInfoAppService () {
        boolean personInfoAppService = updatePersonInfoAppService.updatePersonInfoAppService();
        return personInfoAppService;
    }
}
