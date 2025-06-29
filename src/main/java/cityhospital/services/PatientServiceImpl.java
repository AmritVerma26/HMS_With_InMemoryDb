package cityhospital.services;

import cityhospital.dao.PatientServiceDAO;
import cityhospital.dao.PatientServiceDAOImpl;
import cityhospital.exceptions.PatientDetailsNotFoundException;
import cityhospital.pojos.Patient;

public class PatientServiceImpl implements PatientService {

    PatientServiceDAO patientServiceDAO = new PatientServiceDAOImpl();

    @Override
    public Patient acceptPatient(Patient patient) {
        return patientServiceDAO.savePatient(patient);
    }

    @Override
    public Patient getPatientById(int id) throws PatientDetailsNotFoundException {
        Patient patient = patientServiceDAO.getPatient(id);
        if (patient == null)
            throw new PatientDetailsNotFoundException("Patient with id " + id + " not found");
        return patient;
    }

    @Override
    public void updatePatientById(Patient patient) throws PatientDetailsNotFoundException {
        patientServiceDAO.updatePatient(patient);
    }

    @Override
    public void removePatientById(int id) throws PatientDetailsNotFoundException {
        patientServiceDAO.deletePatient(id);
    }
}
