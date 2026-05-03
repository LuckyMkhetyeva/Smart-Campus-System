public class SimpleFactoryTest {
    public static void main(String[] args) {
        Object user = UserFactory.createUser("student");
        assertTrue(user instanceof Student);
    }
}