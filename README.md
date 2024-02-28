# Study Abroad Program Management Application

This Spring Boot application provides RESTful APIs for managing study abroad programs. It allows users to perform CRUD operations (Create, Read, Update, Delete) on study abroad programs.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Getting Started

### Prerequisites

- Java JDK (11 or higher)
- MySQL database server

### Setup

 Clone the repository:

   ```bash
   git clone https://github.com/Riyah-Razak/study_abroad_program.git

1. Navigate to the project directory:

2. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, etc.).
3. Configure the MySQL database connection:
    . Open src/main/resources/application.properties.
    . Update the spring.datasource.url, spring.datasource.username, and spring.datasource.password properties with your MySQL database connection details.
4. Set up the MySQL database table:

 CREATE TABLE study_abroad_programs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    program_name VARCHAR(255),
    destination VARCHAR(255),
    duration_months INT,
    start_date DATE,
    end_date DATE,
    description VARCHAR(255)
);

5. Run the application:
    . Build the project using Maven:
        mvn clean install
    . Run the application:
        mvn spring-boot:run
6. The application should now be running on http://localhost:8080.


API Endpoints

1. Retrieve all programs
   GET /programs/all
   - Retrieves a list of all study abroad programs.
2. Retrieve a program by ID
   GET /programs/{id}
   - Retrieves details of a specific study abroad program by its ID.
3. Create a new program
   POST /programs/create
   - Creates a new study abroad program.
4. Update a program
   PUT /programs/update/{id}
   - Updates details of an existing study abroad program.
5. Delete a program
   DELETE /programs/delete/{id}
   - Deletes a study abroad program by its ID.





