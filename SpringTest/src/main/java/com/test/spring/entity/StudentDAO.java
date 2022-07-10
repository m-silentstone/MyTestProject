package com.test.spring.entity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentDAO {

    @Select("select * from student where name = #{name}")
    StudentDO getStudent(@Param("name") String name);



}
