package com.zbf.studentmanager.service.serviceImp;

import com.zbf.studentmanager.bean.Student;
import com.zbf.studentmanager.dao.IStudentMapper;
import com.zbf.studentmanager.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements IStudentService {

    @Autowired
    private IStudentMapper studentMapper;

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentAll();
    }
}
