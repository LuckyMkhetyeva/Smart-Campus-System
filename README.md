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











Smart Campus Attendance and Appointment System

Overview
This project implements a Smart Campus System designed to manage student attendance and academic appointments efficiently. The system was developed using object-oriented principles and aligns with previously designed UML class diagrams, use cases, and system requirements.

Language Choice
Java was selected due to its strong support for object-oriented programming, clear class structure, and compatibility with UML-based design. It allows for clean implementation of relationships such as associations and encapsulation.

Project Structure
- /src → Core system classes (Student, Lecturer, Appointment, etc.)
- /creational_patterns → All six creational design patterns
- /tests → Unit tests for validating object creation and behavior
- README.md → Project documentation
- CHANGELOG.md → Development history

System Design Alignment
The implementation directly follows the class diagram created in earlier assignments. Each class includes:
- Attributes (private fields)
- Methods (based on system functionality)
- Relationships (e.g., Student books Appointment, Lecturer approves Appointment)

Creational Design Patterns Implemented

1. Simple Factory
Used to centralize user creation (Student, Lecturer).
This reduces duplication and improves maintainability.

2. Factory Method
Used to delegate appointment creation to subclasses.
This improves flexibility and scalability.

3. Abstract Factory
Used to create related objects (Student and Lecturer) as part of a family.
Ensures consistency across object creation.

4. Builder Pattern
Used for constructing Appointment objects with optional attributes.
Improves readability and prevents constructor overloading.

5. Prototype Pattern
Used to clone existing objects instead of creating new ones.
Improves performance when object creation is costly.

6. Singleton Pattern
Used for DatabaseConnection to ensure only one instance exists.
Thread-safe implementation ensures reliability in concurrent environments.

Testing Strategy
Unit tests were implemented to verify:
- Correct object creation
- Attribute initialization
- Edge cases (e.g., missing ID in Builder)
- Singleton uniqueness

Conclusion
This project demonstrates the practical application of UML design into working code, while effectively using creational design patterns to improve flexibility, scalability, and maintainability.