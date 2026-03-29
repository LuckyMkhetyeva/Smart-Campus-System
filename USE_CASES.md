
Use Case 1: Login
Actor: Student, Lecturer, Administrator, Advisor
Purpose/Description: Allow users to access the system securely.
Precondition: User must have valid credentials.
Postcondition: User is logged in and directed to their dashboard.
Basic
User opens the Smart Campus system.
Enters username and password.
Clicks “Login.”
System validates credentials.
Us
Alternative Flow:
If username/password is incorrect → system displays “Invalid credentials.”
If account is locked → system shows “Account locked, contact administrator.”

Use Case 2: Book Appointment
Actor:Student
Purpose/Description: Allow students to schedule consultations with lecturers.
Precondition: Student is logged in.
Postcondition: Appointment is recorded, and lecturer receives a notification.
Basic Flow:
Student navigates to “Book Appointment.”
Selects a lecturer from the list.
Chooses an available time slot.
Clicks “Confirm.”
System saves the appointment and sends notification to the lecturer.
Alternative Flow:
If time slot is already booked → system asks student to select a different slot.

Use Case 3: Approve Appointment
Actor: Lecturer
Purpose/Description: Allow lecturers to approve or reject student appointment requests.
Precondition: Lecturer is logged in; there are pending appointments.
Postcondition: Appointment status is updated; student receives notification.
Basic Flow:
Lecturer views pending appointments.
Selects a request.
Approves or rejects it.
System
Alternative Flow:
If system fails to update → lecturer is prompted to retry.

Use C 
Actor: Reading
Purpose/Description: Record attendance for a class session.
Precondition: Lecturer is logged in; class session exists.
Postcondition: Attendance is saved in the system.
Basic Flow:
Lecturer selects the course and session date.
System displays enrolled students.
Lecturer marks each student as present or absent.
Lecturer submits the attendance.
System updates records and confirms submission.
Alternative Flow:
If submission fails → system prompts lecturer to retry or contact IT Support.

Use Case 5: View Attendance Records
Actor: Lecturer
Purpose/Description: Allow lecturers to review past attendance records.
Precondition: Lecturer is logged in.
Postc Attendance data is displayed for review.
Basic Flow:
Lecturer selects course/class.
Clicks “View Attendance Records.”
System retrieves historical attendance data.
Records are displayed.
Alternative Flow:
If no records exist → system shows “No records found.”

Use Case 6: View Appointment Schedule
Actor: Student, Lecturer
Purpose/Description: Display upcoming appointments for the user.
Precondition: User is logged in.
Postcondition: Upcoming appointments are displayed.
Down
User navigates to “View Schedule.”
System retrieves all appointments for the user.
System displays appointments in calendar or list view.
alternator
If no appointments exist → system shows “No upcoming appointments.”

Use Case 7: View Reports/Statistics
Actor: Administrator, Advisor
Purpose/Description: Provide insight into system usage and student attendance.
Precondition: User is logged in with proper access.
Postcondition: Reports are displayed and can be exported.
Basic Flow:
User selects type of report (attendance, appointments, system usage).
Clicks “Generate Report.”
System generates and displays report.
User can export the report as PDF.
Alternative Flow:
If data is incomplete → system displays available data with a warning message.

Use Case 8: Maintain Sys
Actor: IT Support
Purpose/Description: Perform system maintenance (backups, updates, troubleshooting).
Precondition: IT Support is logged in.
Postcondition: System is operational, and maintenance logs are created.
Basic
IT Support selects maintenance option.
System runs updates or backup scripts.
System confirms completion and creates logs.
Alternative Flow:
If backup or update fails → system prompts retry and notifies admin.