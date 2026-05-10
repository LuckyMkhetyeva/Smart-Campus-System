Smart Campus Attendance and Appointment System

Assignment 11 – Persistence Repository Layer

Overview

This assignment introduces a repository layer to separate storage logic from business logic. The repository pattern improves scalability, maintainability, and testability.

Repository Design

A generic Repository<T, ID> interface was implemented to support CRUD operations across all entities.

Benefits of Generics
- Reduces code duplication
- Improves reusability
- Ensures consistent CRUD operations

Storage Mechanism

The project uses an in-memory HashMap implementation for persistence.

A Factory Pattern was implemented using RepositoryFactory to allow easy switching between:
- In-memory repositories
- Database repositories
- Future storage systems

Future-Proofing

A stub DatabaseStudentRepository was added to demonstrate scalability for future database integration.

Testing

JUnit tests validate:
- Save operations
- Read operations
- Delete operations
- Repository correctness

Conclusion

The repository layer successfully separates persistence logic from business logic and prepares the Smart Campus System for future database integration.