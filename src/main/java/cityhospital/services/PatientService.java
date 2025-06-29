package cityhospital.services;

import cityhospital.exceptions.PatientDetailsNotFoundException;
import cityhospital.pojos.Patient;

public interface PatientService {
    Patient acceptPatient(Patient patient);
    Patient getPatientById(int id) throws PatientDetailsNotFoundException;
    void updatePatientById(Patient patient)throws PatientDetailsNotFoundException;
    void removePatientById(int id)throws PatientDetailsNotFoundException;
}
