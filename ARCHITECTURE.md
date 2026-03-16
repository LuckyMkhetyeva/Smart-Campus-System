# System Architecture

## Project Title
Smart Campus Attendance and Appointment System

---

## Architecture Overview

The system follows a simple web application architecture consisting of three main layers:

1. User Interface (Frontend)
2. Application Logic (JavaScript)
3. Data Storage (Local Storage / Database)

---

# C4 Model Diagrams

## Level 1 – System Context Diagram

```mermaid
C4Context
title Smart Campus System Context Diagram

Person(student, "Student", "Books appointments and views records")
Person(lecturer, "Lecturer", "Records attendance and manages appointments")
Person(admin, "Administrator", "Manages system and monitors usage")

System(system, "Smart Campus System", "Manages attendance and appointment scheduling")

Rel(student, system, "Books appointments")
Rel(lecturer, system, "Records attendance")
Rel(admin, system, "Manages system")