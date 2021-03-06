package com;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Zornitsa Petkova on 9/15/15.
 */
public class PersistentStudentRepository implements StudentRepository {
  private JDBCTemplate template;
  private Object[] students = new Object[5];

  public PersistentStudentRepository(JDBCTemplate template) {
    this.template = template;
  }

  @Override
  public void registerStudent(Student student) {
    students[0] = student.name;
    students[1] = student.age;
    students[2] = student.idNumber;
    students[3] =student.year;
    students[4] = student.isPaid;
    String query = "insert into student(name,age,idNumber,year,isPaid) value(?,?,?,?,?)";
    template.execute(query, students);
  }

  @Override
  public void deleteStudent() {
    List<Student> list = findAll();
    for(Student student:list){
      if (student.year == 4 || student.isPaid.equals("no")) {
    String query = "delete from student where idNumber = '"+student.idNumber+"'";
    template.makeRequest(query);
      }
    }
  }

  @Override
  public void updateStudent(Student student){
    String query = "update student set age = '"+student.age + "', year ='"+student.year+"'," +
            " isPaid = '"+student.isPaid+"' where idNumber = '"+student.idNumber+"'";
    template.makeRequest(query);
  }

  @Override
  public List<Student> findAll() {
    String query = "select * from student";
    return template.execute(query,new RowFetcher<Student>() {
      @Override
      public Student fetch(ResultSet rs) throws SQLException {
        String name = rs.getString("name");
        int age = rs.getInt("age");
        int idNumber = rs.getInt("idNumber");
        int year = rs.getInt("year");
        String isPaid = rs.getString("isPaid");
        return new Student(name,age,idNumber,year,isPaid);
      }
    });
  }
}
