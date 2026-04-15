package com.example.demo.nestedclass;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee {

    private int empId;
    private String name;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + "]";
    }

    @PostConstruct
    public void start(){
        System.out.println("bean creation started");
    }
    @PreDestroy
    public void stop(){
         System.out.println("bean creation ended");
    }
}
