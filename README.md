
# Banking Application - Spring Framework Labs

This repository contains a series of labs and examples demonstrating the implementation of a **Banking Application** using the **Spring Framework**. The labs are designed to help developers understand and implement core Spring features like Dependency Injection (DI), Aspect-Oriented Programming (AOP), and more.

## Features
- **Dependency Injection (DI)**: Demonstrates how to configure and manage beans in a Spring application.
- **Aspect-Oriented Programming (AOP)**: Explains the use of aspects to separate cross-cutting concerns like logging, transaction management, and security.
- **Spring Configuration**: Covers both XML and annotation-based configurations.
- **Banking Operations**: Simulates basic banking operations such as account creation, deposit, withdrawal, and balance inquiry.
- **Transaction Management**: Ensures secure and consistent transaction handling.

## Getting Started

### Prerequisites
- **Java**: JDK 8 or later.
- **Spring Framework**: Version 5.x or later.
- **Maven**: To build and manage dependencies.
- **MySQL Database**: For persistence if required.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/jfs-rupesh/Banking_Application.git
   cd Banking_Application/Spring/Labs
   ```

2. Import the project into your favorite IDE (e.g., IntelliJ IDEA, Eclipse) as a Maven project.

3. Configure the database (if applicable):
   - Update the `application.properties` or `application.yml` file with your database credentials.
   - Run the SQL scripts in the `resources/db` directory to set up the database schema.

4. Build the project:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Directory Structure
```
Banking_Application/
│
├── Spring/
│   ├── Labs/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/                # Source code
│   │   │   │   ├── resources/           # Configuration and properties files
│   │   │   ├── test/                    # Unit tests
│   │   ├── pom.xml                      # Maven dependencies
│   ├── README.md                        # Project documentation
```

## Usage
1. **Account Management**:
   - Create, view, and manage bank accounts.
2. **Transactions**:
   - Perform deposits, withdrawals, and view transaction history.
3. **Logging and Monitoring**:
   - Utilize AOP for centralized logging.

## Technologies Used
- **Spring Framework**: Core, AOP, JDBC Template.
- **Java**: Primary programming language.
- **Maven**: Dependency and build management.
- **MySQL**: Database for persistent data storage.
- **JUnit**: Unit testing.

