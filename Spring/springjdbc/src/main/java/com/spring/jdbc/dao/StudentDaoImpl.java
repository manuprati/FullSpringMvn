package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		String sql = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(sql,student.getId(),student.getName(),student.getCity());
		return r;
		
	}
	
	public int change(Student student) {
		
		String str= "update student set name=?, city=? where id=?";
		int r =this.jdbcTemplate.update(str,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delet(int studentId) {
		String sql = "delete from student where id=?";
		int r = this.jdbcTemplate.update(sql,studentId);
		return r;
	}
	public Student getStudent(int studentId) {
		String sql = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(sql, rowMapper,studentId);
		return student;
	}
	public List<Student> getAllStudent() {
		String sql = "select * from student";
		List<Student> students = this.jdbcTemplate.query(sql,new RowMapperImpl());
		return students;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	

	
	

	
	

}
