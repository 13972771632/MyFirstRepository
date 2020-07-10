package com.zbf.studentmanager.dao;

import com.zbf.studentmanager.entity.SchoolClass;
import com.zbf.studentmanager.entity.Student;
import com.zbf.studentmanager.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStudentMapper {
    //查询所有学生
    List<Student> getStudentAll();

    //根据学生ID查找学生
    Student getStudentById(Integer id);

    //查询所有学校班级
    List<SchoolClass> getSchoolClassAll();

    //查询所有老师
    List<Teacher> getTeacherAll();

}


