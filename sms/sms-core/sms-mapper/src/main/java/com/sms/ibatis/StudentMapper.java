package com.sms.ibatis;

import com.sms.model.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("SELECT first_name FROM student")
    List<Student> getStudentDetails();
}
