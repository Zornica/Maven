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

    Rectorat rectorat = new Rectorat();
    rectorat.registerStudent(student1);
    rectorat.registerStudent(student2);
    rectorat.registerStudent(student3);







    System.out.println("***********************************");
    System.out.println("Rectorat : ");
    List<Student> students = rectorat.allStudents();
    for(Student s: students){
      System.out.println(s.toString());
    }
    System.out.println("Universary :");
    List<Student> list = university.allStudents();
    for(Student s: list){
      System.out.println(s.toString());
    }
    System.out.println("***********************************");
    System.out.println("Rectorat : ");
    rectorat.updateStudent(newStudent().name("Ivan").age(24).idNumber(18007).year(3).isPaid("yes").build());
    List<Student> studentsAfterUpdate = rectorat.allStudents();
    for(Student s: studentsAfterUpdate){
      System.out.println(s.toString());
    }
    System.out.println("University : ");
    university.updateStudent(newStudent().name("Ivan").age(24).idNumber(18007).year(3).isPaid("yes").build());
    List<Student> after = university.allStudents();
    for(Student s: after){
      System.out.println(s.toString());
    }
    System.out.println("**************************************");
    System.out.println("Rectorat : ");
    rectorat.deleteStudent();
    List<Student> studentAfterDelete = rectorat.allStudents();
    for(Student s: studentAfterDelete){
      System.out.println(s.toString());
    }
    System.out.println("University : ");
    university.deleteStudent();

    List<Student> afterDeleted = university.allStudents();
    for(Student s: afterDeleted){
      System.out.println(s.toString());
    }
  }


}
