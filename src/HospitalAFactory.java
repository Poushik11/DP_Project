import java.util.ArrayList;

public class HospitalAFactory implements HospitalFactory {
    @Override
    public Patient createPatient(String name, int age, ArrayList<String> symptoms) {
        return new InPatientRecord(name, age, symptoms);
    }

    @Override
    public PatientRecord createPatientRecord() {
        return PatientRecord.getInstance();
    }
}