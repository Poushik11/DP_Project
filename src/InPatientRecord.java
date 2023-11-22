import java.util.ArrayList;

public class InPatientRecord extends Patient {

    private String roomNumber;

    public InPatientRecord(String name, int age, ArrayList<String> symptoms) {
        super(name, age, symptoms);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}