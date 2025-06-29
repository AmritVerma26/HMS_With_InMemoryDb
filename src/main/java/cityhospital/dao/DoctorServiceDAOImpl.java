package cityhospital.dao;

import cityhospital.dbutil.DBUtil;
import cityhospital.pojos.Doctor;

public class DoctorServiceDAOImpl implements DoctorServiceDAO {

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        doctor.setDocotorId(DBUtil.Doctor_Id_Counter++);
        DBUtil.doctorHashMap.put(doctor.getDocotorId(), doctor);
        return doctor;
    }

    @Override
    public Doctor getDoctor(int id) {
        return DBUtil.doctorHashMap.get(id);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        if (DBUtil.doctorHashMap.containsKey(doctor.getDocotorId())) {
            DBUtil.doctorHashMap.put(doctor.getDocotorId(),doctor);
            System.out.println("Doctor data are updated: " +doctor);
        } else {
            System.out.println("ID not present");
        }
    }

    @Override
    public void deleteDoctor(int id) {
        if (DBUtil.doctorHashMap.containsKey(id)) {
            DBUtil.doctorHashMap.remove(id);
            System.out.println("Doctor with id : " +id+ " removed.");
        } else {
            System.out.println("Doctor with id : " +id+ " not found.");
        }
    }
}
