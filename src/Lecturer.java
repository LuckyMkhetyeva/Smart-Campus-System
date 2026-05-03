public class Lecturer {
    private String lecturerId;
    private String fullName;
    private String department;

    public Lecturer(String id, String name, String dept) {
        this.lecturerId = id;
        this.fullName = name;
        this.department = dept;
    }

    public void approveAppointment(Appointment appointment) {
        appointment.approve();
    }

    public void recordAttendance(Attendance attendance) {
        attendance.markAttendance();
    }
}