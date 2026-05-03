public class AppointmentPrototype implements Cloneable {
    private String id;

    public AppointmentPrototype(String id) {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getId() {
        return id;
    }
}