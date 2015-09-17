package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 9/17/15.
 */
public class Rectorat {
  private List<Student> list = new ArrayList<>();
  public void registerStudent(Student student) {
     list.add(student);
  }

  public void updateStudent(Student student){
    for(Student s: list){
      if(s.idNumber == student.idNumber){
        s.age = student.age;
        s.isPaid = student.isPaid;
        s.year = student.year;
      }
    }
  }

  public void deleteStudent() {
    List<Student> student = new ArrayList<>();
   for(Student s: list){
     if(s.year == 4 || s.isPaid.equals("no")){
       student.add(s);
     }
   }
    for(Student d: student){
        list.remove(d);
    }

  }

  public List<Student> allStudents() {
    return list;
  }
}
