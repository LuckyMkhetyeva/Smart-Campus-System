public class UserFactory {
    public static Object createUser(String type) {
        if (type.equalsIgnoreCase("student")) {
            return new Student("1", "Lucky", "mail");
        } else if (type.equalsIgnoreCase("lecturer")) {
            return new Lecturer("2", "Dr Smith", "IT");
        }
        throw new IllegalArgumentException("Invalid type");
    }
}