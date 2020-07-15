package hog.mag.springboot.repository;

import hog.mag.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long> {
}
