package com;


import java.util.List;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class University {
  ConnectionJDBC connect = new ConnectionJDBC();
  JDBCTemplate template = new JDBCTemplate(Providers.of(connect.getConnection()));
  PersistentStudentRepository repository = new PersistentStudentRepository(template);

  public void registerStudent(Student student) {
    repository.registerStudent(student);
  }

  public void updateStudent(Student student){
    repository.updateStudent(student);
  }

  public void deleteStudent() {

      repository.deleteStudent();



  }

  public List<Student> allStudents() {
    return repository.findAll();
  }


}
