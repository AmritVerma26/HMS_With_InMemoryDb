package cityhospital;

import cityhospital.dbutil.DBUtil;
import cityhospital.exceptions.DoctorDetailsNotFoundException;
import cityhospital.exceptions.PatientDetailsNotFoundException;
import cityhospital.pojos.Doctor;
import cityhospital.pojos.Patient;
import cityhospital.services.DoctorService;
import cityhospital.services.DoctorServiceServiceImpl;
import cityhospital.services.PatientService;
import cityhospital.services.PatientServiceImpl;

public class Main {
    public static void main(String[] args)  {

        System.out.println("********** Doctor Records : ************ ");
        DoctorService doctorService = new DoctorServiceServiceImpl();

        System.out.println("Accept Doctor - ");
        System.out.println(doctorService.acceptDoctor(new Doctor("Amrit", "Verma", 24,"Cardiologists")));
        System.out.println(doctorService.acceptDoctor(new Doctor("Aarzoo", "Verma", 25,"Gyano")));
        System.out.println(doctorService.acceptDoctor(new Doctor("Reeya", "Chaudhary", 22,"Surgeon")));
        System.out.println(doctorService.acceptDoctor(new Doctor("Ramba", "C", 22,"General")));
        System.out.println(doctorService.acceptDoctor(new Doctor("Virat", "Kohli", 22,"Physician")));

        System.out.println("Retrieve details based on id -");
        try {
            Doctor retrieve = doctorService.getDoctorById(100);
            System.out.println("Docotr details retrieved: " +retrieve);
        } catch (DoctorDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Update Doctor - ");
        try {
            doctorService.updateDoctorById(new Doctor(103, "Reeta", "Verma", 54,"Physician"));
        } catch (DoctorDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Deleting Doctor : ");
        try {
            doctorService.removeDoctorById(104);
        } catch (DoctorDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Remaining Doctors Records After Deletion:");
        for (Doctor doctor : DBUtil.doctorHashMap.values()) {
            System.out.println(doctor);
        }


        System.out.println("******* Patient Records : ************");
        PatientService patientService = new PatientServiceImpl();

        System.out.println("Accept Patient - ");
        System.out.println(patientService.acceptPatient(new Patient("Ram", "Kumar", 40, "O+" ,99234412)));
        System.out.println(patientService.acceptPatient(new Patient("Shyam", "C", 50, "A+" ,99234412)));
        System.out.println(patientService.acceptPatient(new Patient("Geeta", "s", 60, "B+" ,99234412)));

        System.out.println("Retrieve patient based on id - ");
        try {
            Patient retrieved = patientService.getPatientById(1);
            System.out.println("Patient details retrieved: " + retrieved);
        } catch (PatientDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Update Patient - ");
        try {
            patientService.updatePatientById(new Patient(2, "Shreya", "Patel", 32, "AB-", 14143423));
        } catch (PatientDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Removing Patient - ");
        try {
            patientService.removePatientById(5);
        } catch (PatientDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Remaining Patient Records After Deletion:");
        for (Patient patient : DBUtil.patientHashMap.values()) {
            System.out.println(patient);
        }
    }
}
