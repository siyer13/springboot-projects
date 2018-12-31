package com.sms.resource;

import com.sms.model.Student;
import com.sms.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "/student", description = "Student Service", produces = "application/json")
@RequestMapping("/student")
public class StudentResource implements StudentService {

    @Autowired
    Student student;

    @Override
    @GetMapping("/getAllStudents")
    @ResponseBody
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        student.setStudentName("Sridhar");
        studentList.add(student);
        return studentList;
    }
}
