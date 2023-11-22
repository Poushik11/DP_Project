public class Doctor2 implements Visitor {

    @Override
    public void visit(InPatientRecord inPatient) {
        System.out.println("Doctor2 does not handle InPatient visits.");
        System.out.println();
    }

    @Override
    public void visit(OutPatientRecord outPatient) {
        System.out.println("OutPatient Details:");
        System.out.println("Name: " + outPatient.getName());
        System.out.println("Diagnosis: " + outPatient.getDiagnosis());
        System.out.println("Appointment Date: " + outPatient.getAppointmentDate());
        System.out.println();
    }
}