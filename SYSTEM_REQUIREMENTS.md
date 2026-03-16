# System Requirements Document (SRD)

## Project
Smart Campus Attendance and Appointment System

---

# 1 Functional Requirements

The system shall provide the following capabilities:

### FR1
The system shall allow users to log in using their role (student, lecturer, admin).

**Acceptance Criteria**
Users must successfully access the system after entering valid credentials.

---

### FR2
The system shall allow lecturers to record student attendance.

**Acceptance Criteria**
Attendance records must be stored and displayed immediately.

---

### FR3
The system shall allow students to book appointments with lecturers.

**Acceptance Criteria**
Students must select lecturer, date, and time before booking.

---

### FR4
The system shall allow lecturers to approve or reject appointment requests.

**Acceptance Criteria**
Appointment status must update immediately after lecturer approval.

---

### FR5
The system shall display a list of attendance records.

**Acceptance Criteria**
Attendance records must show student name, status, and date.

---

### FR6
The system shall display appointment schedules.

**Acceptance Criteria**
Appointments must display lecturer, student, date, and time.

---

### FR7
The system shall store attendance records.

**Acceptance Criteria**
Records must persist even after page refresh.

---

### FR8
The system shall store appointment bookings.

**Acceptance Criteria**
Appointments must remain available in the schedule.

---

### FR9
The system shall allow administrators to view system statistics.

**Acceptance Criteria**
Dashboard must display number of attendance records and appointments.

---

### FR10
The system shall allow users to log out of the system.

**Acceptance Criteria**
Users must return to the login screen after logout.

---

# 2 Non-Functional Requirements

## Usability

### NFR1
The interface shall be simple and easy to navigate.

### NFR2
Users shall complete attendance recording within 10 seconds.

---

## Deployability

### NFR3
The system shall run on modern web browsers including Chrome, Firefox, and Edge.

---

## Maintainability

### NFR4
The system code shall be modular and documented for future improvements.

---

## Scalability

### NFR5
The system shall support at least 1000 users during peak usage.

---

## Security

### NFR6
User authentication shall restrict system access based on roles.

### NFR7
Sensitive user data shall be protected from unauthorized access.

---

## Performance

### NFR8
The system shall load pages within 2 seconds.

### NFR9
Attendance and appointment operations shall be processed within 3 seconds.

---

# Requirements Traceability

The requirements were derived from stakeholder concerns identified in the stakeholder analysis document. Each functional requirement directly supports stakeholder needs such as efficient attendance tracking and appointment scheduling.