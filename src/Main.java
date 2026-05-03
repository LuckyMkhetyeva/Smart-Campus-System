public class Main {
    public static void main(String[] args) {

        System.out.println("=== SMART CAMPUS SYSTEM ===");

        // Create users using Factory
        Student student = (Student) UserFactory.createUser("student");
        Lecturer lecturer = (Lecturer) UserFactory.createUser("lecturer");

        // Create appointment using Builder
        Appointment appointment = new AppointmentBuilder()
                .setId("A1")
                .setDate("2026-06-01")
                .setStatus("Pending")
                .build();

        // Student books appointment
        student.bookAppointment(appointment);

        // Lecturer approves appointment
        lecturer.approveAppointment(appointment);
        System.out.println("Appointment Status: " + appointment.getStatus());

        // Attendance recording
        Attendance attendance = new Attendance("ATT1", "2026-06-01", "Absent");
        lecturer.recordAttendance(attendance);

        // Prototype cloning
        try {
            AppointmentPrototype prototype = new AppointmentPrototype("A2");
            AppointmentPrototype clone = (AppointmentPrototype) prototype.clone();
            System.out.println("Cloned Appointment ID: " + clone.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Singleton database connection
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Single DB Instance: " + (db1 == db2));

        // Notification
        Notification notification = new Notification("Appointment Approved");
        notification.send();

        // Admin report
        Admin admin = new Admin("ADM1", "System Admin");
        admin.generateReports();

        System.out.println("=== SYSTEM RUN COMPLETE ===");
    }
}