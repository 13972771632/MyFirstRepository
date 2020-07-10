package com.zbf.studentmanager.dao;

import com.zbf.studentmanager.entity.SchoolClass;
import com.zbf.studentmanager.entity.Student;
import com.zbf.studentmanager.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {

    List<Student> getStudentAll();

    Student getStudentById(Integer id);

    List<SchoolClass> getSchoolClassAll();

    List<Teacher> getTeacherAll();

}


