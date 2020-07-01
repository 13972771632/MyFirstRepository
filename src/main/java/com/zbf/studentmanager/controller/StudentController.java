package com.zbf.studentmanager.controller;

import com.alibaba.fastjson.JSON;
import com.zbf.studentmanager.entity.SchoolClass;
import com.zbf.studentmanager.entity.Student;
import com.zbf.studentmanager.entity.Teacher;
import com.zbf.studentmanager.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//zhe shi 2

//这是1

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value="/getListAll")
    public String getStudentAll() {
        List<Student> studentList = studentService.getStudentList();

        String students = JSON.toJSONString(studentList);

        return students;
    }

    @RequestMapping(value="/getSchoolClassAll")
    public String getSchoolClass() {
        List<SchoolClass> schoolClassAll = studentService.getSchoolClassAll();

        String schoolClassList = JSON.toJSONString(schoolClassAll);

        return schoolClassList;
    }

    @RequestMapping(value="/getTeacherAll")
    public String getTeacherAll() {

        List<Teacher> teacherAll =studentService.getTeacherAll();

        String teacherList = JSON.toJSONString(teacherAll);

        return teacherList;
    }

    @RequestMapping(value="/getStudentById")
    public String getStudentById(Integer id) {

        Student studentById = studentService.getStudentById(id);

        String student = JSON.toJSONString(studentById);

        return student;
    }
}
