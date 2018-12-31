package com.sms.resource;

import com.sms.model.Student;
import com.sms.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "/student", description = "Student Service", produces = "application/json")
@RequestMapping("/student")
public class StudentResource implements StudentService {

    @Override
    @GetMapping("/getAllStudents")
    @ResponseBody
    public List<Student> getStudentList() {
        return null;
    }
}
