package cityhospital.dao;

import cityhospital.pojos.Doctor;

public interface DoctorServiceDAO {
    Doctor saveDoctor(Doctor doctor);
    Doctor getDoctor(int id);
    void updateDoctor(Doctor doctor);
    boolean deleteDoctor(int id);
}
