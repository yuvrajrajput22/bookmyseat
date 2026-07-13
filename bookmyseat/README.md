# BookMySeat 🎬

A movie/event ticket booking backend built with Spring Boot, focused on solving real-world concurrency problems in seat booking.

## Features
- CRUD APIs for Seats, Shows, and Bookings
- Concurrency-safe seat booking using Database-level Pessimistic Locking
- Relational database design with Many-to-One relationships (Foreign Keys)
- Centralized exception handling with custom exceptions and proper HTTP status codes
- RESTful API design, tested with Postman

## Tech Stack
- Java, Spring Boot
- MySQL, Spring Data JPA / Hibernate
- Postman (API testing)

## Upcoming
- JWT-based Authentication & Authorization
- Redis distributed locking
- React frontend
## Security Notes
- Database credentials are managed via environment variables (not hardcoded) for security best practices

## Author
Yuvraj Mandloi