import java.util.ArrayList;

public class PatientRecord {

    private static PatientRecord patientRecord;
    private ArrayList<Patient> patients;

    private PatientRecord() {
        patients = new ArrayList<>();
    }

    public static synchronized PatientRecord getInstance() {
        if (patientRecord == null) {
            patientRecord = new PatientRecord();
        }
        return patientRecord;
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }


}
