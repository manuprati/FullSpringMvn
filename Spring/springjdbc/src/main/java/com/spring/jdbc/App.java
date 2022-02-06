package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = ctx.getBean("studentDao",StudentDao.class);

//        Student s1 = new Student();
//        s1.setId(333);
//        s1.setName("Vrinda");
//        s1.setCity("Pahasu");
//        int result = studentDao.insert(s1);
//        System.out.println("Student added "+result);
        
//        System.out.println("Please enter the id u want to delete");
//        Scanner scan = new Scanner(System.in);
//        int sc = scan.nextInt();
//        System.out.println(sc);
//        StudentDao studentDao = ctx.getBean("studentDao",StudentDao.class);
//        Student s3 = new Student();
//        
//        s3.setId(sc);
//        int res = studentDao.delet(s3);
//        System.out.println("Student" + sc + "deleted successfully " +res);
//        Student student = studentDao.getStudent(111);
//        System.out.println(student);
        List<Student> student = studentDao.getAllStudent();
        for(Student s:student) {
        System.out.println(s);
        }
    }
}
