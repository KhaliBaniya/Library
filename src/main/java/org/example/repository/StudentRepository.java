package org.example.repository;

import org.example.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;




    public List<Student> getStudentByPhoneAndPassword2(String phone, String password) {
        String sql = "select * from lesson where phone = ? and password = ? ";
        List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class), phone,password);
        return list;
    }
    public  Student getStudentByPhoneAndPassword(String phone, String password) {
    String sql ="Slect * from student where phone = '?' and  password = '?'  "+ phone + password ;
      //  List<Student> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class), phone,password);
      Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class),phone,password);
        return student;
    }

    public void create(Student student) {
    String sql = "insert into student (name,surname,phone,visible,created_date,role,password)  values (?,?,?,?,now(),?,?)";
    int n = jdbcTemplate.update(sql,student.getName(),student.getSurname(),student.getPhone(),student.getVisible(),
            student.getCreated_date(),student.getRole(), student.getPassword());
        System.out.println(n);


    }

    public Student getStudentByPhone(String phone) {
        String sql = "SELECT * FROM student Where phone = "+ phone;
        Student list = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class));
     return list;

    }
}
