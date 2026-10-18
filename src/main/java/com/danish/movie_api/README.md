# Movie API

A Spring Boot REST API built as part of my journey to become a Java developer.
It will grow into a Movie Ticket Booking backend (Spring Boot, JPA, MySQL, JWT).

## Tech Stack
- Java 25
- Spring Boot 4
- Maven

## Features (so far)
- Basic REST endpoints with `@RestController`
- Service layer using Dependency Injection

## Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| GET | /hello | Returns a welcome message |
| GET | /status | Returns app status as JSON |
| GET | /greeting?name=Ali | Returns a greeting from GreetingService |

## How to Run
1. Clone the repo: `git clone https://github.com/Danishbuilds-code/movie-api.git`
2. Open it in IntelliJ IDEA
3. Run `MovieApiApplication`
4. Open `http://localhost:8080/hello`

## Roadmap
- [x] Project setup and first endpoints
- [x] Dependency Injection
- [ ] Movie CRUD API
- [ ] MySQL with Spring Data JPA
- [ ] JWT authentication
- [ ] React frontend

## Author
Mohammed Danish B - [LinkedIn](https://www.linkedin.com/in/mohammed-danish-b75391377)