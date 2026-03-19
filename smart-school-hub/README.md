Smart School Hub (Backend)

Smart School Hub is a secure and scalable backend system for managing school operations. It is built with Spring Boot and follows clean architecture principles, modular design, and RESTful API best practices.

This project showcases my ability to design and implement a real-world backend system with proper authentication, structured APIs, and maintainable code.

🚀 Tech Stack
Java 17
Spring Boot 3.2.5
Spring Security (JWT Authentication)
Spring Data JPA (Hibernate)
PostgreSQL

🧠 Key Features
🔐 JWT-based Authentication & Authorization
🧩 Modular Structure (Auth, Students, Teachers, etc.)
🗃️ Relational Database Design with JPA
📊 Full School Domain Modeling
⚡ Clean RESTful APIs
🔄 Scalable and Maintainable Code


🔐 Authentication
Uses JWT for secure API access
All /api/** routes are protected except authentication
Public Endpoints
POST /api/auth/login
POST /api/auth/register


📌 API Modules
Base path: /api

Core Management
/students
/teachers
/classes
/subjects

Attendance
/attendance
/teacher-attendance

Academics
/exams
/grades
/timetable

Finance & Evaluation
/fees
/teacher-evaluations

Insights
/dashboard/summary
/reports/*

Parent Portal
/parent-portal/students/{studentId}/progress

🏗️ System Design
Entity relationships managed using JPA
Automatic schema updates:
spring.jpa.hibernate.ddl-auto=update
Designed for easy extension (roles, permissions, new modules)

💡 What This Project Shows
Ability to build a production-ready backend system
Strong understanding of security and authentication
Experience with database design and API architecture
Writing clean, scalable, and maintainable code

🎯 Goal

This project reflects my readiness to contribute to a backend team by building secure, efficient, and scalable systems that solve real-world problems.