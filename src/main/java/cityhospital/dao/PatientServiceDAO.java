package cityhospital.dao;

import cityhospital.pojos.Patient;

public interface PatientServiceDAO {
    Patient savePatient(Patient patient);
    Patient getPatient(int id);
    void updatePatient (Patient patient);
    void deletePatient(int id);
}