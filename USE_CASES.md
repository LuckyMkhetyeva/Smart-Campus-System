Use Case 1: Login
Actor:Student, Reading
Description Authenticates users to access the system.
Precondition: User has valid credentials.
Post-conventional User is granted access to their dashboard.
Basic Flow:
User enters usern
System validates credentials.
System redirects user to appropriate dashboard.
Other
Incorrect password → System displays error message.
Account
Use Case 2: Book Appointment
Actor: Student
Description: Allows students to schedule meetings with lecturers.
Precondition: Student logged in.
Postcondition Appointment saved in the system; lecturer notified.
Basic Flow:
Student selects lecturer and time slot.
System checks availability.
System confirms booking and sends notification.
Alternative Flows:
Time slot unavailable → Student prompted to choose a new time.
Use Case 3: Approve Appointment
Actor: Lecturer
Description Lecturer approves or rejects student appointment requests.
Precondition:Reading
Postcondition: Appointment status updated; student notified.
Basic Flow:
Lecturer views pending appointments.
Reading
System updates status and notifies student.
Alternative Flows:
Lecturer rejects → Student receives alternative suggestions.
Use Case 4: Record Attendance
Actor: Lecturer
Description:Reading
Precondition: Lecturer logged in; class session ongoing.
Postcondition: Attendance updated in student record.
Basic Flow:
Lecturer selects class and session date.
System displays enrolled students.
Reading
System updates records.
Alternative Flows:
System error → Retry or contact IT support.
Use Case 5: View Attendance Records
Actor: Lecturer
Description: Lecturer views historical attendance data.
Precondition: Lecturer logged in.
Postcondition: Records displayed for review or export.
Basic Flow:
Lecturer selects class/course.
System retrieves attendance data.
Data dis
Alternative Flows:
No records → System displays “No attendance data found.”
Use Case 6: View Appointment Schedule
Actor: Student, Lecturer
Description: Users view upcoming appointments.
Precondition: User logged in.
Post-conventional Schedule displayed.
Basic Flow:
User selects “View Schedule.”
System retrieves upcoming appointments.
System displays appointments in calendar view.
Alternative Flows:
No appointments → System displays empty calendar.
Use Case 7: View Reports/Statistics
Actor: Administrator, Advisor
Description: View system usage and analytics.
Precondition: User logged in with proper access rights.
Postcondition: Reports displayed for decision-making.
Basic Flow:
User selects report type.
System generates
Report displayed; user can export as PDF.
Alternative Flows:
And
Use Case 8: Maintain System
Actor: IT Support
Of the Maintain system performance, backups, and security.
Pre-ordered IT logged in with privileges.
Post-conventional System maintained and operational.
Basic Flow:
IT runs maintenance scripts.
System updates/repairs executed.
Logs generated.
Alternative Flows:
Backup fails → Retry process; notify admin.
