import java.util.ArrayList;

public class InPatient implements PatientFactory {
    @Override
    public Patient createPatient(String name, int age, ArrayList<String> symptoms) {
        return new InPatientRecord(name, age, symptoms);
    }
}