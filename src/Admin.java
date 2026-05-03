public class Admin {
    private String adminId;
    private String fullName;

    public Admin(String adminId, String fullName) {
        this.adminId = adminId;
        this.fullName = fullName;
    }

    public void generateReports() {
        System.out.println("Generating reports...");
    }
}