# Event-Driven Order System (Reactive)

## Overview

This project is a Reactive Order Management Microservice built using Spring Boot WebFlux.

It demonstrates:
- Non-blocking REST APIs
- Reactive programming using Project Reactor (Mono/Flux)
- Clean layered architecture (Controller → Service → DTO)
- Production-style health endpoint
- Integration-ready design for event-driven systems

---

## Tech Stack

- Java 17
- Spring Boot 3
- Spring WebFlux
- Gradle
- Project Reactor

---

## Features Implemented

- Health Check API (`GET /health`)
- Reactive REST controller
- Structured JSON responses
- Proper HTTP status handling

---

## Running the Application

```bash
./gradlew bootRun
```

Or run via IntelliJ.

Application runs on:

```
http://localhost:8080
```

---

## API Endpoints

### Health Check

```
GET /health
```

Response:

```json
{
  "service": "Order Service",
  "status": "UP",
  "timestamp": "2026-02-24T18:10:12"
}
```

---

## Future Enhancements

- Reactive Database Integration (R2DBC)
- Event Publishing (Kafka)
- Spring Boot Actuator
- Liveness & Readiness Probes
- Dockerization
- Kubernetes deployment