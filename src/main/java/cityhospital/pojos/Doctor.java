package cityhospital.pojos;

import java.util.Objects;

public class Doctor {

    private String docotrId;
    private String firstName;
    private String lastName;
    private int age;
    private String specialization;

    public Doctor(String docotrId, String firstName, String lastName, int age, String specialization) {
        this.docotrId = docotrId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
    }

    public String getDocotrId() {
        return docotrId;
    }

    public void setDocotrId(String docotrId) {
        this.docotrId = docotrId;
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
        return age == doctor.age && Objects.equals(docotrId, doctor.docotrId) && Objects.equals(firstName, doctor.firstName) && Objects.equals(lastName, doctor.lastName) && Objects.equals(specialization, doctor.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docotrId, firstName, lastName, age, specialization);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "docotrId='" + docotrId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
