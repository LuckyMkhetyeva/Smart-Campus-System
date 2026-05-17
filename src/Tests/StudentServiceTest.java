@Test
public void testAddStudent() {
    StudentService service =
        new StudentService(
            new InMemoryStudentRepository());

    Student student =
        new Student("S1","Lucky","mail@test.com");

    service.addStudent(student);

    assertEquals("S1", student.getStudentId());
}