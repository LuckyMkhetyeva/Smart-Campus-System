public class Attendance {
    private String id;
    private String date;
    private String status;

    public Attendance(String id, String date, String status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public void markAttendance() {
        this.status = "Present";
    }

    public void updateAttendance(String status) {
        this.status = status;
    }
}