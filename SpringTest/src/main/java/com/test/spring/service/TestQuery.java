package com.test.spring.service;

import com.test.spring.entity.StudentDAO;
import com.test.spring.entity.StudentDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestQuery implements ApplicationListener<ApplicationReadyEvent> {
    private StudentDAO studentDAO;

    public TestQuery(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        StudentDO studentDO = studentDAO.getStudent("Jimmy");
        log.info("{}", studentDO);
    }
}
