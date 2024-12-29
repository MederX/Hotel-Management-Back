# Hotel Booking System Backend

This project is the backend service for a hotel booking system. It is built using Java and Spring Boot, with a MySQL database for storage. It supports user registration, login, room management, booking management, and JWT-based authentication.

## Features

- **User Management**: Registration, login, and retrieving user information.
- **Room Management**: Adding, updating, deleting, and retrieving rooms.
- **Booking Management**: Booking rooms, managing bookings, and retrieving booking history.
- **Authentication**: JWT-based authentication to secure endpoints.
- **AWS S3 Integration**: Storing images securely in an AWS S3 bucket.

## Technologies Used

- **Programming Language**: Java
- **Framework**: Spring Boot (version 3.4.1)
- **Database**: MySQL
- **Authentication**: JWT
- **Cloud Storage**: AWS S3
- **Build Tool**: Maven

## Prerequisites

Before setting up the project, ensure you have the following installed:

- Java Development Kit (JDK) 23
- MySQL
- Maven
- IntelliJ IDEA
- An AWS S3 bucket and access credentials

## Setup Instructions

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/your-repo/Hotel-Management-Back.git
   cd Hotel-Management-Back
   ```

2. **Open the Project**: Open the project in IntelliJ IDEA.

3. **Configure the Database**:

   - Create a new MySQL database.
   - Update the `application.properties` file with your database details:

     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
     spring.datasource.username=your_database_user
     spring.datasource.password=your_database_password
     spring.jpa.hibernate.ddl-auto=update
     ```

4. **Set Up AWS S3**:

   - Create an AWS S3 bucket.
   - Retrieve your AWS S3 `access-key` and `secret-key`.
   - Add the following to your `application.properties`:

     ```properties
     aws.s3.bucket-name=your_bucket_name
     aws.s3.access-key=your_access_key
     aws.s3.secret-key=your_secret_key
     ```

5. **Install Dependencies**:

   Run the following command to download the Maven dependencies:

   ```bash
   mvn clean install
   ```

6. **Run the Application**:

   Start the server by running:

   ```bash
   mvn spring-boot:run
   ```

7. **Access the API**:

   The application will run at `http://localhost:8080`.

## API Endpoints
I will add you to my postman workspace

### User Endpoints

- `POST /16.171.253.87:8080/auth/register` - Register a new user.  
- `POST /16.171.253.87:8080/auth/login` - Log in to the application.  
- `GET /16.171.253.87:8080/users/all` - Retrieve all users (Admin access). (You can register as admin like this:
    -"email": "....@gmail.com",
    -"password": "....",
    -"phoneNumber": ".....",
    -"name": ".....",
    -"role":ADMIN
  -THEN USE THE TOKEN YOU GOT AS ADMIN TO TO ALL STUFF ONLY ADMIN CAN(UPDATE/DELETE ROOMS etc.)
- `GET /16.171.253.87:8080/users/get-by-id/2` - Get user information by ID.  
- `GET /16.171.253.87:8080/users/get-logged-in-profile-info` - Retrieve logged-in user details.  
- `GET /16.171.253.87:8080/users/get-user-bookings/2` - View user booking history.  
- `DELETE /l16.171.253.87:8080/users/delete/4` - Delete a user profile.

### Room Endpoints
- `POST /16.171.253.87:8080/rooms/add` - Add a new room (Admin access).  
- `GET /16.171.253.87:8080/rooms/all` - View all available rooms.  
- `GET /16.171.253.87:8080/rooms/room-by-id/2` - Retrieve room details by ID.  
- `PUT /16.171.253.87:8080/rooms/update/2` - Update room details (Admin access).  
- `DELETE /16.171.253.87:8080/rooms/delete/8` - Remove a room from the system (Admin access).  
- `GET /16.171.253.87:8080/rooms/all-available-rooms` - View currently available rooms.  
- `GET /16.171.253.87:8080/rooms/available-rooms-by-date-and-type?checkInDate=2024-12-12&checkOutDate=2024-12-13&roomType=Standart Single` - Check room availability for specific dates.  
- `GET /16.171.253.87:8080/rooms/types` - View all room types.

### Booking Endpoints
- `POST /16.171.253.87:8080/bookings/book-room/2/6` - Make a room booking.  
- `GET /16.171.253.87:8080/bookings/get-by-confirmation-code/ZOTKPBQK1V` - Retrieve booking confirmation details.  
- `GET /16.171.253.87:8080/users/get-user-bookings/6` - Fetch bookings for a specific user.  
- `DELETE /16.171.253.87:8080/bookings/cancel/1` - Cancel an existing booking.

## Dependencies

The project relies on the following dependencies (defined in `pom.xml`):

- Spring Boot Starter Web, Data JPA, and Security
- MySQL Connector
- JSON Web Token (JWT) libraries
- AWS SDK for Java (S3)
- Lombok

Refer to the `pom.xml` file for a complete list.

## Environment Variables

You must configure the following environment variables:

- `aws.s3.access-key`: Your AWS S3 access key.
- `aws.s3.secret-key`: Your AWS S3 secret key.
- `spring.datasource.url`: Your MySQL database URL.
- `spring.datasource.username`: Your MySQL username.
- `spring.datasource.password`: Your MySQL password.

## License

This project is licensed under the MIT License. See the LICENSE file for details.












