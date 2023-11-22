import java.util.ArrayList;

public class OutPatient implements PatientFactory {
    @Override
    public Patient createPatient(String name, int age, ArrayList<String> symptoms) {
        return new OutPatientRecord(name, age, symptoms);
    }
}