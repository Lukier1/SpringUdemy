package com.udemy.spring_test.testprog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/udemy/spring/test/testprog/beans/beans.xml");
       
       Person person = (Person) context.getBean("person");
       System.out.println(person);
       
       ((FileSystemXmlApplicationContext)context).close();
    }
}
