package com.MongoDB_Sample.Controllers;
import com.MongoDB_Sample.Entities.Student;
import com.MongoDB_Sample.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentControllers {

    @Autowired
    private StudentRepository studentRepository ;

    @PostMapping("/add")
    public ResponseEntity < ? > addNewStudent (@RequestBody Student student ) {
           Student s = this.studentRepository.save(student) ;
           return new ResponseEntity<>( s , HttpStatus.CREATED) ;
    }

    @GetMapping("/get")
    public  List<Student>  getAllStudent ( ) {
        int id = 1 ;
        List<Student> s = this.studentRepository.findAll() ;
        return s ;
    }
}
