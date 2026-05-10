public class RepositoryFactory {

    public static StudentRepository getStudentRepository(String storageType) {

        switch (storageType.toUpperCase()) {

            case "MEMORY":
                return new InMemoryStudentRepository();

            case "DATABASE":
                return new DatabaseStudentRepository();

            default:
                throw new IllegalArgumentException("Invalid storage type");
        }
    }
}