# java_soap_api
Java SOAP Api ( Students Crup )


# Project Description
a simple java soap api for students crup operations using jaka jax-ws library and maven build tool and Myslq database

# Project Structure
```
java_soap_api
├── README.md
├── pom.xml
└── src
    └── main
        ├── java
        │   └── com
        │       └── example
        │           └── demo
        │               ├── ServerWS.java
        │               ├── Student.java
        │               ├── StudentRepository.java
        │               └── StudentWS.java
        |               └── MySQlConnection.java
        |               └── Filiere.java [ Enum ]
        └── resources
            └── application.properties
```

# Project Dependencies
1. Java 11
2. Maven (Apache Maven 3.9.5)
3. Mysql 8.0.23
4. Jax-ws 4.0.2
6. Jakarta.servlet-api 5.0.0



# How To start the project
1. Clone the project
2. Open the project in your IDE
3. Create a database in your mysql server with the name "scolarite" and table "etudiants"
4. Run the project from ServerWS.java
5. Open the url http://127.0.0.1:8080/scolarite in your browser to see the wsdl file
6. Now you can test the project in Postman




# How to test the project in Postman
1. Open the Postman
2. Import the wsdl file in the postman by adding the url: http://localhost:8080/ws/students.wsdl
3. You will see the SOAP api in the postman
4. Now you can test the project


# How to test the project in Chrome
1. Open the Chrome file location in your computer
2. Open the file location of the chrome.exe
3. Open the cmd in this location
4. Run the command: " chrome.exe --user-data-dir="C://Chrome dev session" --disable-web-security 
5. Or you can run : " chrome.exe --user-data-dir="C://chrome-dev-disabled-security" --disable-web-security --disable-site-isolation-trials"
6. Note: Dont Browse the internet with this chrome instance because it is not secure
