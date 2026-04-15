package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Patient {

    private int patientId;
    private String patientName;
    private String disease;

   @Autowired
   private Doctor doctor;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient() {
        System.out.println("Patient Object Created");

    }

   
    public Patient(int patientId, String patientName, String disease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.disease = disease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Disease: " + disease);
       doctor.displayDoctor();
    }
}
    
