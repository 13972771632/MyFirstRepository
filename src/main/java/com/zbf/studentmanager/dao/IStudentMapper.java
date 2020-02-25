package com.zbf.studentmanager.dao;

import com.zbf.studentmanager.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {

    List<Student> getStudentAll();
}
