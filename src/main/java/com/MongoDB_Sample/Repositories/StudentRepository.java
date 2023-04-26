package com.MongoDB_Sample.Repositories;
import com.MongoDB_Sample.Entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student , Integer > {

}
