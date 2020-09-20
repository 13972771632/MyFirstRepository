package com.zbf.studentmanager.controller;

import com.alibaba.fastjson.JSON;
import com.zbf.studentmanager.entity.SchoolClass;
import com.zbf.studentmanager.entity.Student;
import com.zbf.studentmanager.entity.Teacher;
import com.zbf.studentmanager.service.IStudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "学生信息管理" )
@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value="/getListAll",method = {RequestMethod.GET})
    public String getStudentAll() {
        List<Student> studentList = studentService.getStudentList();
        String stirng = JSON.toJSONString(studentList);
        return stirng;
    }

    @RequestMapping(value="/getSchoolClassAll",method = {RequestMethod.GET})
    public String getSchoolClass() {
        List<SchoolClass> schoolClassAll = studentService.getSchoolClassAll();
        String stirng = JSON.toJSONString(schoolClassAll);
        return stirng;
    }

    @RequestMapping(value="/getTeacherAll",method = {RequestMethod.GET})
    public String getTeacherAll() {
        List<Teacher> teacherAll =studentService.getTeacherAll();
        String stirng = JSON.toJSONString(teacherAll);
        return stirng;
    }

    @RequestMapping(value="/getStudentById",method = {RequestMethod.GET})
    public String getStudentById(Integer id) {
        Student studentById = studentService.getStudentById(id);
        String stirng = JSON.toJSONString(studentById);
        return stirng;
    }
}

