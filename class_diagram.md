Class Diagram – Smart Campus Attendance and Appointment System

```mermaid
classDiagram

class Student {
    -studentId: String
    -fullName: String
    -email: String
    +bookAppointment()
    +viewAttendance()
}

class Lecturer {
    -lecturerId: String
    -fullName: String
    -department: String
    +approveAppointment()
    +recordAttendance()
}

class Appointment {
    -appointmentId: String
    -date: Date
    -status: String
    +approve()
    +reject()
    +cancel()
}

class Attendance {
    -attendanceId: String
    -date: Date
    -status: String
    +markAttendance()
    +updateAttendance()
}

class Admin {
    -adminId: String
    -fullName: String
    +manageUsers()
    +generateReports()
}

class Report {
    -reportId: String
    -reportType: String
    -generatedDate: Date
    +generate()
    +view()
}

class Notification {
    -notificationId: String
    -message: String
    -status: String
    +sendNotification()
}

Student "1" --> "0..*" Appointment : books
Lecturer "1" --> "0..*" Appointment : manages
Student "1" --> "0..*" Attendance : has
Lecturer "1" --> "0..*" Attendance : records
Admin "1" --> "0..*" Report : generates
Notification "0..*" --> "1..*" Student : sentTo
Notification "0..*" --> "1..*" Lecturer : sentTo