public class Doctor1 implements Visitor {

    @Override
    public void visit(InPatientRecord inPatient) {
        System.out.println("InPatient Details:");
        System.out.println("Name: " + inPatient.getName());
        System.out.println("Age: " + inPatient.getAge());
        System.out.println("Symptoms: " + inPatient.getSymptoms());
        System.out.println("Room Number: " + inPatient.getRoomNumber());
        System.out.println();
    }

    @Override
    public void visit(OutPatientRecord outPatient) {
        System.out.println("Doctor1 does not handle OutPatient visits.");
        System.out.println();
    }
}