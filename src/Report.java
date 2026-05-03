public class Report {
    private String reportId;
    private String type;

    public Report(String reportId, String type) {
        this.reportId = reportId;
        this.type = type;
    }

    public void generate() {
        System.out.println("Report generated: " + type);
    }
}