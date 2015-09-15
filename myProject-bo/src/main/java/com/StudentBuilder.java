package com;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class StudentBuilder {
  private String name;
  private int age;
  private int idNumber;
  private int year;
  private String isPaid;

  public static StudentBuilder newStudent() {
    return new StudentBuilder();
  }

  public StudentBuilder year(int year) {
    this.year = year;
    return this;
  }

  public StudentBuilder isPaid(String isPaid) {
    this.isPaid = isPaid;
    return this;
  }

  public StudentBuilder name(String name) {
    this.name = name;
    return this;
  }

  public StudentBuilder age(int age) {
    this.age = age;
    return this;
  }

  public StudentBuilder idNumber(int idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  public Student build() {
    return new Student(name, age, idNumber,year,isPaid);
  }
}
