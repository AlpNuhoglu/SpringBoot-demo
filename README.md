# Demo Project

This is a Spring Boot application designed to manage a simple student database. The project demonstrates core Spring Boot features including REST APIs, JPA (Java Persistence API), and database integration for CRUD operations.

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Setup Instructions](#setup-instructions)
- [Endpoints](#endpoints)
- [Project Structure](#project-structure)

---

## Features

- **REST APIs:** Exposes endpoints for clients to interact with the student database.
- **CRUD Operations:** Create, Read, Update, and Delete student data.
- **Age Calculation:** Automatically calculates student age based on their date of birth.
- **Validation:** Implements validation for data integrity (e.g., valid email, non-empty name).
- **Database Integration:** Supports persistent storage with standard Java Persistence.

---

## Technologies

This project uses the following technologies:

- **Java 17 or higher** (ensure Java SDK is installed)
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (default) or **PostgreSQL** (optional)
- **Maven** for dependency management
- **Lombok** (if annotations like `@Getter`, `@Setter` are applied)

---

## Setup Instructions

### Prerequisites

- Install **Java 17+**
- Install **Maven** (if not bundled with your IDE)
- Install **Git** (optional, if handling the repository)

### Steps to Run the Project

1. Clone this repository:
   ```bash
   git clone https://github.com/<your-github-username>/demo.git
   ```

2. Navigate to the project directory:
   ```bash
   cd demo
   ```

3. Build the project using Maven:
   ```bash
   ./mvnw clean install
   ```

4. Run the project:
   ```bash
   ./mvnw spring-boot:run
   ```

5. Access the application at:
   ```
   http://localhost:8080/
   ```

---

## Endpoints

The application exposes the following RESTful endpoints:

| HTTP Method | Endpoint                        | Description                     |
|-------------|---------------------------------|---------------------------------|
| **GET**     | `/api/v1/student`              | Fetch all students             |
| **POST**    | `/api/v1/student`              | Register a new student         |
| **DELETE**  | `/api/v1/student/{studentID}`   | Delete a student by ID         |
| **PUT**     | `/api/v1/student/{studentID}`   | Update a student’s details     |

### Example Request Payload (POST `/api/v1/student`):
```json
{
  "name": "John Doe",
  "email": "johndoe@gmail.com",
  "dob": "2000-01-01"
}
```

---

## Project Structure

The project follows the standard **Spring Boot MVC** structure:

demo
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── demo
│   │   │               ├── student/
│   │   │               │   ├── Student.java              # Entity class
│   │   │               │   ├── StudentController.java    # REST controller
│   │   │               │   ├── StudentService.java       # Service layer
│   │   │               │   ├── StudentRepository.java    # Repository interface
│   │   │               │   └── StudentConfig.java        # Configuration class
│   │   │               └── DemoApplication.java          # Main Spring Boot application
│   │   ├── resources
│   │   │   ├── application.properties                    # Application configuration
│   │   │   └── data.sql                                  # Optional SQL script for seeding data
│   │   └── static/                                       # Frontend static assets (if applicable)
│   │       └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── DemoApplicationTests.java     # Test cases for the application
├── .gitignore                                            # Git ignored files
├── .gitattributes                                        # Git attributes file
├── mvnw                                                  # Maven wrapper (Linux/Mac)
├── mvnw.cmd                                              # Maven wrapper (Windows)
├── pom.xml                                               # Maven dependencies and build file
└── README.md                                             # Documentation for the project

