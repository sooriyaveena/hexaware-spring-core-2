package com.example.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.nestedclass.Department;
import com.example.demo.nestedclass.Employee;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

 
        Patient patient = (Patient) context.getBean("patient");
        patient.displayPatient();

    
        Doctor d1 = (Doctor) context.getBean("doctor1");
        Doctor d2 = (Doctor) context.getBean("doctor1");

        System.out.println( d1);
        System.out.println(d2);
       

      
        Department dept = (Department) context.getBean("dept1");
        System.out.println(dept);

        Employee emp = (Employee) context.getBean("emp2");
        System.out.println(emp);

       
        context.registerShutdownHook();
    }
}