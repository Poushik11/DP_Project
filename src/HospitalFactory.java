import java.util.ArrayList;

public interface HospitalFactory {
    Patient createPatient(String name, int age, ArrayList<String> symptoms);
    PatientRecord createPatientRecord();
}