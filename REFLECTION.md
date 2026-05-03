# Reflection

## Challenges in Balancing Stakeholder Needs

During the requirements analysis process, several challenges were encountered when balancing the needs of different stakeholders.

One major challenge was ensuring that the system remains simple for students while still providing advanced functionality for lecturers and administrators. Students require a user-friendly interface, whereas administrators need access to detailed reports and system statistics.

Another challenge involved balancing system performance with usability. For example, students expect quick appointment scheduling, while IT staff prioritize system reliability and security.

Additionally, designing features that satisfy lecturers and students simultaneously required careful consideration. Lecturers prefer structured appointment management, while students want flexible scheduling options.

## Lessons Learned

This process highlighted the importance of understanding stakeholder perspectives when designing software systems. Effective communication and clear documentation are essential to ensure that the system meets the needs of all users.

By carefully analyzing stakeholder concerns and translating them into functional and non-functional requirements, the Smart Campus System can provide a balanced and efficient solution for academic institutions.











Reflection – Assignment 10

This assignment focused on transforming a conceptual UML class diagram into a fully functional software implementation while applying creational design patterns. The process required careful consideration of object-oriented principles, design patterns, and testing strategies.

One of the main challenges encountered was ensuring that the code implementation aligned accurately with the previously developed UML class diagram. While the diagram provided a structural overview, translating it into code required decisions about data types, method responsibilities, and relationships between classes. For example, determining how the Student and Appointment classes interact required balancing simplicity with correctness. This highlighted the importance of abstraction and proper encapsulation.

Another significant challenge was understanding and correctly implementing all six creational design patterns. While some patterns such as the Singleton and Simple Factory were relatively straightforward, others like Abstract Factory and Builder required deeper understanding. The Builder pattern, for instance, was particularly useful in handling optional attributes in the Appointment class, but it required careful validation to ensure that required fields (such as the ID) were always provided.

The Prototype pattern introduced a different perspective on object creation by emphasizing cloning instead of instantiation. This required understanding Java’s cloning mechanism and handling potential exceptions. Similarly, implementing a thread-safe Singleton pattern using double-checked locking added complexity but improved the robustness of the system.

Unit testing also presented challenges. Writing tests that not only validate functionality but also cover edge cases required a structured approach. For example, testing the Builder pattern involved verifying both successful object creation and failure scenarios when required fields were missing. Testing the Singleton pattern required ensuring that multiple calls returned the same instance.

This assignment strongly aligned with previous work, particularly the use case diagrams and state models. The methods implemented in the classes directly correspond to actions identified in use cases, such as booking appointments and recording attendance. This demonstrated the importance of traceability between design and implementation.

Several trade-offs were made during development. For instance, inheritance was minimized in favor of simpler class structures to maintain clarity. While more complex hierarchies could have been introduced, the decision to prioritize readability and maintainability proved beneficial. Additionally, some implementations were simplified to ensure focus on demonstrating design patterns rather than over-engineering the solution.

A key lesson learned is that design patterns are not just theoretical concepts but practical tools that solve real problems in software development. Each pattern provided a different way of handling object creation, and understanding when to use each one is critical for building scalable systems.

Overall, this assignment improved my understanding of object-oriented design, strengthened my ability to translate diagrams into code, and enhanced my knowledge of software design patterns. It also emphasized the importance of testing and maintaining alignment between system design and implementation. These skills are essential for developing reliable and maintainable software systems in real-world environments.