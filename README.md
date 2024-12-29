                                                                                                              ***Hotel Booking System Backend***
This project is the backend service for a hotel booking system. It is built using Java and Spring Boot, with a MySQL database for storage. It supports user registration, login, room management, booking management, and JWT-based authentication.

***Features***

User Management: Registration, login, and retrieving user information.
Room Management: Adding, updating, deleting, and retrieving rooms.
Booking Management: Booking rooms, managing bookings, and retrieving booking history.
Authentication: JWT-based authentication to secure endpoints.
AWS S3 Integration: Storing images securely in an AWS S3 bucket.
Technologies Used
Programming Language: Java
Framework: Spring Boot (version 3.4.1)
Database: MySQL
Authentication: JWT
Cloud Storage: AWS S3
Build Tool: Maven

***Prerequisites***


Before setting up the project, ensure you have the following installed:

Java Development Kit (JDK) 23
MySQL
Maven
IntelliJ IDEA
An AWS S3 bucket and access credentials.
Setup Instructions
Clone the Repository:


git clone https://github.com/your-repo/Hotel-Management-Back.git
cd HOTEL-Management-Back
Open the Project: Open the project in IntelliJ IDEA.

Configure the Database:

Create a new MySQL database.
Update the application.properties file with your database details:
properties
Копировать код
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_database_user
spring.datasource.password=your_database_password
spring.jpa.hibernate.ddl-auto=update

Set Up AWS S3:

Create an AWS S3 bucket.
Retrieve your aws.s3.access-key and aws.s3.secret-key.
Add the following to your application.properties:
properties
Копировать код
aws.s3.bucket-name=your_bucket_name
aws.s3.access-key=your_access_key
aws.s3.secret-key=your_secret_key
Install Dependencies: Run the following command to download the Maven dependencies:


mvn clean install
Run the Application: Start the server by running:


mvn spring-boot:run
Access the API: The application will run at http://localhost:8080.

***API Endpoints***

=====User Endpoints:=====
I will add you to my postman workspace

Register User: POST /RegisterUser
Login: POST /Login
Get All Users: GET /GetAllUsersAsAdmin
Get User by ID: GET /GetUserbyID
Get Logged-In User Info: GET /getLoggedInUserInfo
Get User Booking History: GET /getUserBookingHistory
Delete User: DELETE /DeleteUser
=====Room Endpoints=====
Add Room: POST /AddRoom
Get All Rooms: GET /GetAllRooms
Get Room by ID: GET /GetRoomById
Update Room by ID: PUT /UpdateRoomById
Delete Room by ID: DELETE /DeleteRoomById
Get Available Rooms: GET /AllAvailableRooms
Get Available Rooms by Date: GET /GetAvailableRoomByDate
Get Room Types: GET /allRoomTypes
=====Booking Endpoints=====
Book a Room: POST /BookARoom
Get Booking Confirmation: GET /GetBokingConfirmation
Get Bookings by User ID: GET /GetBookingsByUserId
Cancel Booking: DELETE /CancelBookingByUserId


***Dependencies***
The project relies on the following dependencies (defined in pom.xml):

Spring Boot Starter Web, Data JPA, and Security
MySQL Connector
JSON Web Token (JWT) libraries
AWS SDK for Java (S3)
Lombok
Refer to the pom.xml file for a complete list.

***Environment Variables***
You must configure the following environment variables:

aws.s3.access-key: Your AWS S3 access key.
aws.s3.secret-key: Your AWS S3 secret key.
spring.datasource.url: Your MySQL database URL.
spring.datasource.username: Your MySQL username.
spring.datasource.password: Your MySQL password.
License
This project is licensed under the MIT License. See the LICENSE file for details.
