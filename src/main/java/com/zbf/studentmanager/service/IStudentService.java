package com.zbf.studentmanager.service;

import com.zbf.studentmanager.entity.SchoolClass;
import com.zbf.studentmanager.entity.Student;
import com.zbf.studentmanager.entity.Teacher;

import java.util.List;

public interface IStudentService {

    List<Student> getStudentList();

    List<SchoolClass> getSchoolClassAll();

    List<Teacher> getTeacherAll();

    Student getStudentById(Integer id);

}
