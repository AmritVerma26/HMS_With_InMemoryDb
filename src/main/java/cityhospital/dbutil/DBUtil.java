package cityhospital.dbutil;

import cityhospital.pojos.Doctor;
import cityhospital.pojos.Patient;

import java.util.HashMap;

public class DBUtil {
    public static HashMap<Integer, Doctor> doctorHashMap = new HashMap<>();
    public static int Doctor_Id_Counter = 100;

    public static HashMap<Integer, Patient> patientHashMap = new HashMap<>();
    public static int Patient_Id_Counter = 1;
}
