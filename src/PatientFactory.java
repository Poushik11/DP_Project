import java.util.ArrayList;

public interface PatientFactory {
    Patient createPatient(String name, int age, ArrayList<String> symptoms);
}
