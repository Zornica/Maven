package com;


import com.Student;

import java.util.List;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public interface StudentRepository {
  void registerStudent(Student student);

  void deleteStudent(Student student);

  void updateStudent(Student student);

  List<Student> findAll();
}
