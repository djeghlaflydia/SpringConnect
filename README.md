# SpringConnect

**SpringConnect** is a modern web application built using Spring Boot that simplifies the authentication process. This project offers a versatile login experience by allowing users to either:

- **Log in using a traditional form** with a username and password.

  ![git1](https://github.com/user-attachments/assets/1266a29c-c50a-4eb2-b6c0-4d335f5e1478)

- **Authenticate via GitHub** using your GitHub credentials.
- **Sign in with Google** for a quick and secure login.

![git2](https://github.com/user-attachments/assets/2a8a55c5-c7b9-4b39-89c6-c50b786c8c6f)

## Features

- **Traditional Form Login**: Securely log in with your username and password.
- **GitHub Authentication**: Easily log in using your GitHub account.
- **Google Sign-In**: Authenticate quickly with your Google account.

## How It Works

1. **Login via Form**:
    - Enter your credentials in the login form provided by the application.

2. **OAuth2 Login**:
    - **GitHub Authentication**: Click the GitHub login button to authenticate with your GitHub credentials.
    - **Google Sign-In**: Click the Google sign-in button to authenticate using your Google account.
    - After successful authentication, the user is redirected back to SpringConnect with a valid session.

## Technologies Used

- **Spring Boot**: For building the application.
- **OAuth2**: For handling authentication via GitHub and Google.

## Getting Started

To get started with SpringConnect:

1. **Clone the Repository**:

    ```bash
    git clone https://github.com/djeghlaflydia/SpringConnect.git
    ```

2. **Navigate to the Project Directory**:

    ```bash
    cd SpringConnect
    ```

3. **Run the Application**:

    ```bash
    ./mvnw spring-boot:run
    ```
   or

    ```bash
    mvn spring-boot:run
    ```

4. **Access the Application**:
    - Open your browser and go to `http://localhost:8080` to start using SpringConnect.

## Contributing
Feel free to open issues or submit pull requests to contribute to the development of SpringConnect. Your feedback and contributions are welcome!

---

**Contact Information**
- GitHub: https://github.com/djeghlaflydia