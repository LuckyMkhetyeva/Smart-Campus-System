public class SingletonTest {
    public static void main(String[] args) {
        DatabaseConnection d1 = DatabaseConnection.getInstance();
        DatabaseConnection d2 = DatabaseConnection.getInstance();

        if (d1 != d2) {
            throw new AssertionError("Singleton instances differ");
        }

        System.out.println("Singleton test passed");
    }
}