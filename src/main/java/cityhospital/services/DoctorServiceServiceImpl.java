package cityhospital.services;

import cityhospital.dao.DoctorServiceDAO;
import cityhospital.dao.DoctorServiceDAOImpl;
import cityhospital.exceptions.DoctorDetailsNotFoundException;
import cityhospital.pojos.Doctor;

public class DoctorServiceServiceImpl implements DoctorService {

    DoctorServiceDAO doctorServiceDAO = new DoctorServiceDAOImpl();

    @Override
    public Doctor acceptDoctor(Doctor doctor) {
        return doctorServiceDAO.saveDoctor(doctor);
    }

    @Override
    public Doctor getDoctorById(int id) throws DoctorDetailsNotFoundException {
        Doctor doctor = doctorServiceDAO.getDoctor(id);
        if (doctor == null)
            throw new DoctorDetailsNotFoundException("Doctor with id " +id+ " not found");
        return doctor;
    }

    @Override
    public void updateDoctorById(Doctor doctor) throws DoctorDetailsNotFoundException {
        doctorServiceDAO.updateDoctor(doctor);
    }

    @Override
    public void removeDoctorById(int id) throws DoctorDetailsNotFoundException {
        doctorServiceDAO.deleteDoctor(id);

    }
}
