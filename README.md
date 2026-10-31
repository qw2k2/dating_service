# Dating Service

A REST API for managing user profiles, likes, and matches. The project is built with Java and Spring Boot and uses PostgreSQL for persistence.

## Tech stack

- Java 17
- Spring Boot 4
- Spring Web MVC
- Spring Data JPA
- PostgreSQL 17
- Maven
- JUnit 5

## Features

- Create, list, update, and delete user profiles
- Store profile information such as name, age, bio, gender, and city
- Create likes between users
- Create match records
- Persist application data in PostgreSQL

## Architecture

The application follows a layered structure:

- **Controller** — REST endpoints and HTTP request handling
- **Service** — application operations
- **Repository** — database access through Spring Data JPA
- **Model** — JPA entities

## REST API

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
| --- | --- | --- |
| `POST` | `/users` | Create a user |
| `GET` | `/users` | Get all users |
| `PUT` | `/users/{id}` | Update a user |
| `DELETE` | `/users/{id}` | Delete a user |
| `POST` | `/likes` | Create a like |
| `POST` | `/matches` | Create a match |

Requests with a body should use JSON and the `Content-Type: application/json` header.

### Example: create a user

```http
POST /users
Content-Type: application/json

{
  "name": "Alex",
  "age": 24,
  "bio": "Interested in hiking and music",
  "gender": "male",
  "city": "Berlin"
}
```

## Running locally

### Requirements

- JDK 17 or newer
- Maven
- Docker and Docker Compose

### 1. Start PostgreSQL

```bash
docker compose up -d
```

The Compose configuration uses development defaults. You can override them with environment variables:

| Variable | Default |
| --- | --- |
| `POSTGRES_DB` | `dating` |
| `POSTGRES_USER` | `dating_user` |
| `POSTGRES_PASSWORD` | `dating_password` |
| `POSTGRES_PORT` | `5432` |

The Spring Boot application reads `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD`. Their defaults match the local Compose database. For a custom setup, set these variables before launching the application.

### 2. Run the application

```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`.

## Tests

Run the test suite with:

```bash
mvn test
```

The current test suite includes an application-context loading test.

## Demo

[Watch the application demo](https://drive.google.com/file/d/1pmRD2iHx36QGj8NeGi1PqC5_Uu6v0paZ/view?usp=drive_link)

## Project status

This is an educational project demonstrating a basic Spring Boot REST application with layered structure and PostgreSQL persistence. Authentication, authorization, request validation, and comprehensive integration tests are not currently implemented.

The default database credentials are intended for local development only. Use environment-specific credentials outside a local environment.
