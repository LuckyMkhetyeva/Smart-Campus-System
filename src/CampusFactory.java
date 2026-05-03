interface CampusFactory {
    Student createStudent();
    Lecturer createLecturer();
}

class DefaultCampusFactory implements CampusFactory {
    public Student createStudent() {
        return new Student("1", "Lucky", "mail");
    }

    public Lecturer createLecturer() {
        return new Lecturer("2", "Dr Smith", "IT");
    }
}