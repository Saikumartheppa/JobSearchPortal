<h1 align="center"> Job Search Portal</h1>

>### Framework
* [SpringBoot](javatpoint.com/spring-boot-tutorial)
>### Language
* [Java](https://www.java.com/en/download/help/whatis_java.html)
>## Data flow
In this project, we have four layers-
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer maintains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things - the various classes required for the project and these classes consists the attributes to be stored.

>## Data Structure used in my project
The project uses a relational database with tables for storing job data. The database design is based on the Job entity attributes, with each attribute corresponding to a column in the table. The primary key is the id field, which uniquely identifies each job entry.
>## Project Summary
The Job Search Portal is a Spring Boot application that provides RESTful APIs to perform CRUD operations on job listings. It allows users to create new job listings, view job details by ID, update existing job listings, and delete job listings. Additionally, users can perform various custom searches, such as searching by job title, description, salary, company name, employer name, and location.

The application follows a layered architecture, promoting separation of concerns. The controller handles incoming HTTP requests, the service contains the business logic, and the repository manages the interaction with the database. The project uses H2 Database for data storage, making it easy to set up and run locally.

The Job Search Portal provides a simple and effective way for users to manage job listings and search for relevant opportunities based on different criteria. It can be extended and customized further to meet specific requirements of a job portal application.