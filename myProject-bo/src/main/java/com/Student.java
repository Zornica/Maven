package com;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class Student {
  public String name;
  public  int age;
  public int idNumber;
  public int year;
  public String isPaid;

  public Student(String name, int age, int idNumber,int year,String isPaid) {
    this.name = name;
    this.age = age;
    this.idNumber = idNumber;
    this.year = year;
    this.isPaid=isPaid;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", idNumber=" + idNumber +
            ", year=" + year +
            ", isPaid='" + isPaid + '\'' +
            '}';
  }
}
