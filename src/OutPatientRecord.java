import java.util.ArrayList;

public class OutPatientRecord extends Patient {

    private String appointmentDate;

    public OutPatientRecord(String name, int age, ArrayList<String> symptoms) {
        super(name, age, symptoms);
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}