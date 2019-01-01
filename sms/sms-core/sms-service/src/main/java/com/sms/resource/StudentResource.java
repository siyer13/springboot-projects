package com.sms.resource;

import com.sms.model.Marks;
import com.sms.model.Semester;
import com.sms.model.Student;
import com.sms.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "/student", description = "Student Service", produces = "application/json")
@RequestMapping("/student")
@ComponentScan(basePackages =  {"com.sms.model"})
public class StudentResource implements StudentService {

    @Autowired
    Student student;
    @Autowired
    Marks marks;

    @Override
    @GetMapping("/getAllStudents")
    @ResponseBody
    public List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<Marks> markList = new ArrayList<>();
        Map<String,Integer> subjectScore = new HashMap<>();
       // Semester sem = Semester.SECONDYEAR_FIRSTSEM;
        Map<String,Map<String,Integer>> semScore = new HashMap<>();
        subjectScore.put("OS",70);
        subjectScore.put("DBMS",75);
        subjectScore.put("Java",79);
        semScore.put("SECONDYEAR_FIRSTSEM",subjectScore);
        marks.setSemesterSubjectScore(semScore);
        subjectScore = new HashMap<>();
        subjectScore.put("C++",70);
        subjectScore.put("Software Engineering",75);
        subjectScore.put("Networks",79);
        semScore.put("SECONDYEAR_SECONDSEM",subjectScore);
        student.setFirstName("Sridhar");
        student.setLastName("Iyer");
        student.setStudentId("084-06-010");
        marks.setSemesterSubjectScore(semScore);
        markList.add(marks);
        student.setResult(markList);
        studentList.add(student);
        return studentList;
    }
}
