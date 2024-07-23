package com.spring.hiber.net.HiberNetBySpring;

import javax.transaction.Transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.hiber.dao.Studentdao;
import com.spring.hiber.entyties.Student;

/**
 * Hello world!
 *
 */
@Transactional
public class App 
{
	
    public static void main( String[] args )
    {
           ApplicationContext context=new ClassPathXmlApplicationContext("/com/spring/hiber/dao/config.xml");
           Studentdao studentdao=context.getBean("studentDao",Studentdao.class);
          
        //   HibernateTemplate hibernateTemplate =context.getBean(HibernateTemplate.class);
           
           Student student =new Student(232,"nsdnf","sjoj");
      
//          Student student2 =  hibernateTemplate.get(Student.class, 123);
//           System.out.println(student2);
           
         int r=  studentdao.insert(student);
         System.out.println(r);
    }
}
