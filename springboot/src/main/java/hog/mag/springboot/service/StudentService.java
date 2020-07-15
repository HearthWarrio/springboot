package hog.mag.springboot.service;

import hog.mag.springboot.model.Student;
import hog.mag.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findById(Long id) {
        return studentRepository.getOne(id);
    }
    public List<Student> findAll(){
        return studentRepository.findAll();
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }
}
