package com;

import java.util.List;

import static com.StudentBuilder.newStudent;


/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class Demo {
  public static void main(String[] args) {
    Student student1 = newStudent().name("Ivan").age(23).idNumber(18007).year(3).isPaid("yes").build();
    Student student2 = newStudent().name("Kaloqn").age(23).idNumber(18004).year(3).isPaid("no").build();
    Student student3 = newStudent().name("Marina").age(24).idNumber(18005).year(4).isPaid("yes").build();

    University university = new University();
    university.registerStudent(student1);
    university.registerStudent(student2);
    university.registerStudent(student3);

    List<Student> list = university.allStudents();
    for(Student s: list){
      System.out.println(s.toString());
    }

    university.updateStudent(newStudent().name("Ivan").age(24).idNumber(18007).year(3).isPaid("yes").build());

    university.deleteStudent();

    System.out.println("");

    List<Student> afterDeleted = university.allStudents();
    for(Student s: afterDeleted){
      System.out.println(s.toString());
    }
  }


}
