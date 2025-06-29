package cityhospital.dao;

import cityhospital.dbutil.DBUtil;
import cityhospital.pojos.Patient;

public class PatientServiceDAOImpl implements PatientServiceDAO{
    @Override
    public Patient savePatient(Patient patient) {
        patient.setPatientId(DBUtil.Patient_Id_Counter++);
        DBUtil.patientHashMap.put(patient.getPatientId(),patient);
        return patient;
    }

    @Override
    public Patient getPatient(int id) {
        return DBUtil.patientHashMap.get(id);
    }

//    @Override
//    public void updatePatient(Patient patient) {
//        DBUtil.patientHashMap.put(patient.getPatientId(), patient);
//        System.out.println("Patient data are updated : " +patient);
//    }

    @Override
    public void updatePatient(Patient patient) {
        if (DBUtil.patientHashMap.containsKey(patient.getPatientId())) {
            DBUtil.patientHashMap.put(patient.getPatientId(), patient);
            System.out.println("Patient data are updated: " + patient);
        } else {
            System.out.println("ID not present");
        }
    }


    @Override
    public void deletePatient(int id) {
        if (DBUtil.patientHashMap.containsKey(id)) {
            DBUtil.patientHashMap.remove(id);
            System.out.println("Patient with id : " +id+ "removed.");
        } else {
            System.out.println("Patient with id : " +id+ " not found.");
        }
    }
}
