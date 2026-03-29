Functional Test Cases
Test Case 1: User Login (Valid Credentials)
Requirement: FR-001
Description: Verify that a registered user can log in successfully.
Steps:
Open the Smart Campus system.
Enter a valid username and password.
Click the “Login” button.
Expected Result: User is logged in and redirected to their dashboard.
Test Case 2: User Login (Invalid Credentials)
Requirement: FR-001
Described Verify that invalid login attempts are handled correctly.
Steps:
Open the system.
Enter an invalid username or password.
Click “Login.”
Expected Result: System displays an error message: “Invalid credentials.”
Test Case 3: Record Attendance
Requirement: FR-002
Of the Ensure lecturers can record attendance for a class session.
Steps:
Login as a Reader
Select a course and session date.
Mark students as present or absent.
Submit the attendance.
Expected Result: Attendance records are saved in the system and confirmation message is displayed.
Test Case 4: Book Appointment
Requirement: FR-003
Of the Check that students can book appointments with lecturers.
Step
Login
Cell
Click “Book Appointment.”
Expected Result: Appointment is saved; the system sends a notification to the lecturer.
Test Case 5: Approve Appointment
Requirement: FR-004
Description: Verify that lecturers can approve or reject student appointment requests.
Steps:
It
View pending appointments.
Approve or reject a request.
Expected Result: Appointment status updates accordingly, and the student receives a notification.
Test Case 6: View Attendance Records
Requirement: FR-005
Desc Ensure lecturers can view historical attendance data.
Steps:
Login
Select a course/class.
Click “View Attendance Records.”
Expected Result: Attendance records are displayed correctly for the selected class.
Test Case 7: View Appointment Schedule
Requirement: FR-006
Description: Verify that students and lecturers can view upcoming appointments.
Steps:
Login as a Student or Lecturer.
Navigate to “View Schedule.”
Expected Result: All upcoming appointments are displayed in calendar or list format.
Test Case 8: View Reports / Statistics
I need FR-007
Of the Ensure administrators and advisors can view system statistics.
Steps:
Login as Administrator or Advisor.
Select the type of report to generate.
Click “Generate Report.”
Expected Result: Report is displayed and can be exported as PDF.
Non-Functional Test Cases
Test Case 9: Performance (Page Load Time)
Requirement: NFR-001
Description: Check that pages load quickly.
Steps:
Login as any user.
Navigate through dashboard, attendance, and appointment pages.
Expected Result: All pages load within 2 seconds.
Test Case 10: Security (Unauthorized Access)
Requirement: NFR-002
Description: Ensu
Steps:
Attempt to open admin or IT support pages without logging in.
Try to manipulate URL to access restricted pages.
Expected Result: Access is denied, and the system redirects to the login page.