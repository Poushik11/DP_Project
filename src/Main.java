import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        HospitalFactory hospitalFactory = new HospitalAFactory();
        PatientRecord patientRecord = hospitalFactory.createPatientRecord();

        PatientFactory inPatientFactory = new InPatient();
        PatientFactory outPatientFactory = new OutPatient();

        Patient inPatient = inPatientFactory.createPatient("John Doe", 30, new ArrayList<>(List.of("Fever", "Headache")));
        ((InPatientRecord) inPatient).setRoomNumber("101");

        Patient outPatient = outPatientFactory.createPatient("Jane Doe", 25, new ArrayList<>(List.of("Cough", "Fatigue")));
        ((OutPatientRecord) outPatient).setAppointmentDate("2023-11-15");

        patientRecord.addPatient(inPatient);
        patientRecord.addPatient(outPatient);

        Doctor1 doctor1 = new Doctor1();
        Doctor2 doctor2 = new Doctor2();

        inPatient.accept(doctor1);
        outPatient.accept(doctor2);
    }
}
