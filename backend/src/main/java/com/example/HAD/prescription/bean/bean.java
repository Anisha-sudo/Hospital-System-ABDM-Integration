package com.example.HAD.prescription.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class bean {


    @Id
    String patientId;
    String pulse;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    String bloodPressure;
    String diagnosis;
    String prescription;

    String Date;



    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }


}
