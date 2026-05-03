public class Appointment {
    private String id;
    private String date;
    private String status;

    public Appointment(String id, String date, String status) {
        this.id = id;
        this.date = date;
        this.status = status;
    }

    public void approve() { status = "Approved"; }
    public void reject() { status = "Rejected"; }
    public void cancel() { status = "Cancelled"; }

    public String getId() { return id; }
    public String getStatus() { return status; }
}