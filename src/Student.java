public class Student {
    private String studentId;
    private String fullName;
    private String email;

    public Student(String studentId, String fullName, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
    }

    public void bookAppointment(Appointment appointment) {
        System.out.println(fullName + " booked appointment " + appointment.getId());
    }

    public void viewAttendance() {
        System.out.println("Viewing attendance...");
    }

    public String getStudentId() { return studentId; }
    public String getFullName() { return fullName; }
}