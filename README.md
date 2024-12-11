# BootCampAssignment - Spring Boot Application

This is a basic backend application built using Spring Boot. The application allows the creation of students and subjects, and also provides an option for students to enroll in subjects. The application uses an in-memory H2 database for simplicity and implements JWT-based authentication with roles (student and admin).

## Features

- **Entities**:
  - **Student**: Includes fields `name` and `address`.
  - **Subject**: Includes a field `name`.
  - A student can enroll in multiple subjects.

- **REST APIs**:
  - **POST /api/students**: Create a new student.
  - **POST /api/subjects**: Create a new subject.
  - **GET /api/students**: Retrieve the list of all students.
  - **GET /api/subjects**: Retrieve the list of all subjects.

- **Security**:
  - JWT-based authentication.
  - Two roles defined: `student` and `admin`.

- **Database**:
  - In-memory database (H2) used for simplicity.

## Prerequisites

- **JDK**: Version 19 or higher.
- **Build Tool**: Maven.

## Getting Started

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/yourusername/bootCampAssignment.git
