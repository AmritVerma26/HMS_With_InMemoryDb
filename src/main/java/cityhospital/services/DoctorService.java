package cityhospital.services;

import cityhospital.exceptions.DoctorDetailsNotFoundException;
import cityhospital.pojos.Doctor;

public interface DoctorService {
    Doctor acceptDoctor(Doctor doctor);
    Doctor getDoctorById(int id) throws DoctorDetailsNotFoundException;
    void updateDoctorById(Doctor doctor)throws DoctorDetailsNotFoundException;
    void removeDoctorById(int id)throws DoctorDetailsNotFoundException;
}
