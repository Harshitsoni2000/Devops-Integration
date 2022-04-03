package com.devops.devopsmanager.Controller;

import com.devops.devopsmanager.Model.Student;
import com.devops.devopsmanager.Service.devopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devops")
public class devopsController {

    @Autowired
    private devopsService service;

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getById(@PathVariable int id) {
        return service.getStudent(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student) {
        service.addStudent(student);
    }
}
