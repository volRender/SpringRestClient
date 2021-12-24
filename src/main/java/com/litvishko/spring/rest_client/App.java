package com.litvishko.spring.rest_client;

import com.litvishko.spring.rest_client.configuration.MyConfig;
import com.litvishko.spring.rest_client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        //getAllEmployees
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);

        //getEmployee
//        Employee employee = communication.getEmployee(6);
//        System.out.println(employee);

        //addOrUpdateEmployee
//        Employee employee = new Employee("Vlad", "Varakin", "IT", 1000);
//        employee.setId(8);
//        communication.addOrUpdateEmployee(employee);

        //deleteEmployee
//          communication.deleteEmployee(8);

    }
}
