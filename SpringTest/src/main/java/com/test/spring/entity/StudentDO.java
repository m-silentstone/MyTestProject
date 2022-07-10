package com.test.spring.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StudentDO {
    Long id;
    String name;
    String gender;
    LocalDate birthday;
    LocalDateTime modifyTime;
}
