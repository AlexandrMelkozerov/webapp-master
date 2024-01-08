package ru.melkozerovau.webapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.melkozerovau.webapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
