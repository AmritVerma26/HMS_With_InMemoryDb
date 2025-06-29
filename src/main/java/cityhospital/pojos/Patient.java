package cityhospital.pojos;

import java.util.Objects;

public class Patient {
    private int patientId;
    private String patientFirstName;
    private String patientLastName;
    private int age;
    private String bloodGroup;
    private int contact;

    public Patient(int patientId, String patientFirstName, String patientLastName, int age, String bloodGroup, int contact) {
        this.patientId = patientId;
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.contact = contact;
    }
    public Patient(String patientFirstName, String patientLastName, int age, String bloodGroup, int contact) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.contact = contact;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientId == patient.patientId && age == patient.age && contact == patient.contact && Objects.equals(patientFirstName, patient.patientFirstName) && Objects.equals(patientLastName, patient.patientLastName) && Objects.equals(bloodGroup, patient.bloodGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, patientFirstName, patientLastName, age, bloodGroup, contact);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", contact=" + contact +
                '}';
    }
}
