package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //searches XML configuration from Classpath
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        //fetches bean based on value passed and typecast it
        Student student1 = (Student)context.getBean("student1");
        
        //value will be printed from IoC container, i.e., xml file
        System.out.println(student1);
        
//        Student student2 =  (Student)context.getBean("student2");
//        System.out.println(student2);
    }
}
