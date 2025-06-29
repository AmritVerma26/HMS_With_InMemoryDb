package cityhospital;

import cityhospital.exceptions.PatientDetailsNotFoundException;
import cityhospital.pojos.Patient;
import cityhospital.services.PatientService;
import cityhospital.services.PatientServiceImpl;

public class Main {
    public static void main(String[] args)  {

        System.out.println("******* Patient : ************");
        PatientService patientService = new PatientServiceImpl();

        System.out.println("Accept Patient - ");
        System.out.println(patientService.acceptPatient(new Patient("Ram", "Kumar", 40, "O+" ,99234412)));
        System.out.println(patientService.acceptPatient(new Patient("Shyam", "C", 50, "A+" ,99234412)));
        System.out.println(patientService.acceptPatient(new Patient("Geeta", "s", 60, "B+" ,99234412)));

        System.out.println("Retrieve patient based on id - ");
        try {
            Patient retrieved = patientService.getPatientById(1);
            System.out.println("Patient retrieved: " + retrieved);
        } catch (PatientDetailsNotFoundException e) {
            System.out.println("Patient ID not present");
        }

        System.out.println("Update Patient - ");
        try {
            patientService.updatePatientById(new Patient(10, "Shreya", "Patel", 32, "AB-", 14143423));
        } catch (PatientDetailsNotFoundException e) {
            System.out.println("The given Patient ID is not present.");
        }

        System.out.print("Removing Patient - ");
        try {
            patientService.removePatientById(5);
        } catch (PatientDetailsNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
