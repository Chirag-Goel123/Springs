package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started..............." );

        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/jdbcconfig.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        Student student=new Student();
//        student.setId(666);
//        student.setCity("Kanpur");
//        student.setName("Ram");
//        int result = studentDao.insert(student);
        
//        Student student=new Student();
//        student.setId(666);
//        student.setCity("Kanpur");
//        student.setName("Sita");
//        int result = studentDao.change(student);
        
        
        int result = studentDao.delete(422);
        System.out.println("Data change.."+result);
        
        
        
    }
}
