package com.devops.devopsmanager.Service;

import org.springframework.stereotype.Service;
import com.devops.devopsmanager.Model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class devopsService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                new Student(1, "Harsh", "CSE", "harsh@gmail.com"),
                new Student(2, "Lovlesh", "MECH", "lovlesh@gmail.com")
            )
    );

    public List<Student> getAll() {
        return students;
    }

    public Student getStudent(int id) {
        for(Student s : students)
            if(s.getId() == id)
                return s;
        return null;
    }
}
