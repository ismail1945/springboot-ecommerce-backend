# Scalable E-Commerce Backend System Using Spring Boot

A production-style e-commerce backend application built using Spring Boot, MySQL, JWT Authentication, Redis caching, and Docker.

This project provides secure REST APIs for user authentication, product management, cart operations, and order processing with scalable backend architecture and optimized database interactions.

---

# Features

- User Registration & Login
- JWT Authentication & Authorization
- Product Management APIs
- Cart Management System
- Order Processing
- Redis Caching
- Swagger API Documentation
- Docker Containerization
- RESTful API Architecture

---

# Tech Stack

- Java 17
- Spring Boot
- Spring Security
- MySQL
- Redis
- JWT
- Docker
- Maven
- Swagger OpenAPI

---

# Project Structure

```text
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
 ├── security/
 ├── config/
 └── exception/
```

---

# Run Project

## Run MySQL & Redis

```bash
docker-compose up
```

## Run Spring Boot Application

```bash
mvn spring-boot:run
```

---

# Swagger Documentation

```text
http://localhost:8080/swagger-ui.html
```

---

# Future Enhancements

- Payment Gateway Integration
- Kafka Event Streaming
- AWS Deployment
- Elasticsearch Product Search
- Microservices Architecture

---

# Author

Ismail Khan