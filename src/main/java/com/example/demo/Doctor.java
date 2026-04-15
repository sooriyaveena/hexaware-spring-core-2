package com.example.demo;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    

    private int doctorId;
    private String doctorName;
    private List<String> specializations;
    private HashSet<String>skills;
    private Map<String,String> schedule;


    
    public Doctor() {
        System.out.println("Doctor Object Created");
    }

    
    public Doctor(int doctorId, String doctorName, List<String> specializations) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specializations= specializations;
    }

  
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<String> specializations) {
        this.specializations = specializations;
    }
    public HashSet<String> getSkills() {
        return skills;
    }

    public void setSkills(HashSet<String> skills) {
        this.skills = skills;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specializations);
        System.out.println("skills:"+skills);
        System.out.println("Schedule: " + schedule);
    }
}

