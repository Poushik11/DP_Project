public interface Visitor {
    void visit(InPatientRecord inPatient);
    void visit(OutPatientRecord outPatient);
}
