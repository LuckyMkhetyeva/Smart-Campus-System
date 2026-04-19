# Smart Campus Attendance and Appointment System

## Project Description
The Smart Campus Attendance and Appointment System is a web-based application designed to help educational institutions manage student attendance and appointment scheduling between students and lecturers.

The system enables lecturers to digitally record attendance while allowing students to book academic consultation sessions with lecturers.

This solution improves record management, reduces administrative workload, and enhances communication between students and academic staff.

---

## System Features

### Attendance Management
- Record student attendance
- View attendance records
- Track attendance statistics

### Appointment Booking
- Students can book appointments with lecturers
- Lecturers can approve appointments
- Appointment scheduling with date and time

### Dashboard
- Admin can view total attendance records
- Admin can view total appointments

---

## Technologies Used

- HTML
- CSS
- JavaScript
- Local Storage (simulated database)

---

## Project Structure

## Assignment 7: Kanban Board

This project uses an **Automated Kanban board** to manage development tasks for the Smart Campus System.

### Customizations
- Added **Testing** column for quality assurance
- Added **Blocked** column for dependency tracking
- Set WIP limit to 3 tasks in progress

### Features
- Task tracking using GitHub Issues
- Agile workflow visualization
- Task assignment using GitHub @mentions

### Screenshot


Smart Campus System – Assignment 8

Overview

This assignment focuses on modeling the dynamic behavior of the Smart Campus Attendance and Appointment System using UML diagrams. The goal is to represent how system objects behave over time and how workflows are executed.

Objectives

Model object lifecycles using State Transition Diagrams
Model workflows using Activity Diagrams
Ensure alignment with Functional Requirements, Use Cases, and User Stories from previous assignments

Object State Modeling

State diagrams were created to represent how key system objects change states during their lifecycle.

Objects Modeled

Appointment
Attendance
User Account
Booking Slot
Report
Notification
System Session
Request

Purpose

These diagrams help visualize how objects behave under different conditions and events.

Example

The Appointment object transitions from Requested to Approved to Completed, or from Requested to Rejected.

Activity Workflow Modeling

Activity diagrams were created to represent workflows and processes in the system.

Workflows Modeled

Book Appointment
Login Process
Record Attendance
Approve Appointment
Generate Report
View Attendance
Notification Process
System Maintenance

Purpose

These diagrams show step-by-step processes, decision points, parallel actions, and responsibilities of different system users.

Integration with Previous Assignments

All diagrams are aligned with previous work.

Functional Requirements Mapping

FR-001 maps to Login System
FR-002 maps to Appointment Booking
FR-003 maps to Approval Process
FR-004 maps to Attendance Recording
FR-005 maps to Report Generation

User Stories Mapping

Students booking appointments
Lecturers recording attendance
Administrators generating reports

This ensures consistency and traceability throughout the system design.

Project Structure

diagrams folder contains all exported diagram images
state_diagrams document contains all state models
activity_diagrams document contains all workflows
integration document links diagrams to requirements
assignment8_reflection document contains reflection

Diagrams

State Diagrams include appointment and attendance diagrams
Activity Diagrams include booking and login workflows

Tools Used

Mermaid for diagram creation
Draw.io for visual diagram export
GitHub for project management and version control

Conclusion

This assignment demonstrates how UML diagrams can be used to model system behavior and workflows. It provides a clear understanding of how different components of the Smart Campus System interact and operate.

The diagrams improve system clarity, support better design decisions, and ensure alignment with requirements and user needs.