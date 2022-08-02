package com.Prograde.CrudOperation.Controllers;

import com.Prograde.CrudOperation.Service.StudentService;
import com.Prograde.CrudOperation.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public  ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }
    @GetMapping
    public  List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
    @GetMapping("{id}")
    public  ResponseEntity<Student> getStudentById(@PathVariable("id")int id)
    {
        return new ResponseEntity<Student>((Student) studentService.getStudentById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public  ResponseEntity<Student> updateStudent(@PathVariable("id")int id, @RequestBody Student student)
    {
        return new ResponseEntity<Student>(studentService.updateStudent(student,id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id")int id)
    {
        studentService.deleteStudent(id);
        return new ResponseEntity<String>("Student deleted successfully",HttpStatus.OK);
    }
}
