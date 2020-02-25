package com.zbf.studentmanager.controller;

import com.alibaba.fastjson.JSON;
import com.zbf.studentmanager.bean.Student;
import com.zbf.studentmanager.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value="/getListAll")
    @ResponseBody
    public String getStudentAll() {
        List<Student> studentList = studentService.getStudentList();
        String stirng = JSON.toJSONString(studentList);

        return stirng;
    }
}
