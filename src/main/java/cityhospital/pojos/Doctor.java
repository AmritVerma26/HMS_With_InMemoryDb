package cityhospital.pojos;

import java.util.Objects;

public class Doctor {

    private int docotorId;
    private String firstName;
    private String lastName;
    private int age;
    private String specialization;

    public Doctor(int docotorId, String firstName, String lastName, int age, String specialization) {
        this.docotorId = docotorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
    }

    public Doctor(String firstName, String lastName, int age, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
    }

    public int getDocotorId() {
        return docotorId;
    }

    public void setDocotorId(int docotorId) {
        this.docotorId = docotorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return docotorId == doctor.docotorId && age == doctor.age && Objects.equals(firstName, doctor.firstName) && Objects.equals(lastName, doctor.lastName) && Objects.equals(specialization, doctor.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docotorId, firstName, lastName, age, specialization);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docotorId=" + docotorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}