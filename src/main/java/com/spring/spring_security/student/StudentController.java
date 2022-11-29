package com.spring.spring_security.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    // creating a dummy student list to check the API
    private static List<Student> studentList = Arrays.asList(
            new Student(1, "Muntasir Adnan"),
            new Student(2, "Anwar Hossain"),
            new Student(3, "Maksuda Anwar")
    );

    @GetMapping(path = "/student/{studentID}")
    public Student getStudent(@PathVariable("studentID") Integer studentID) throws Exception {
        return studentList.stream()
                .filter(student -> student.getStudentID().equals(studentID))
                .findFirst()
                .orElseThrow(() -> new Exception("StuddentID " + studentID + "not found"));
    }

}
