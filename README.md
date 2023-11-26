## java_soap_api
Java SOAP Api ( Students CRUD API)
# Project Description
a simple java soap api for students crup operations using jaka jax-ws library and maven build tool and Myslq database

## Api Documentation 
# [Link to API Documentation](https://documenter.getpostman.com/view/25366464/2s9YeD9tKR)


## Frontend of Java SOAP API for students CRUD operations
# [Link to reactjs_soap_api GitHub Repository](https://github.com/AmraneAchraf1/reactjs_soap_api)


# Project Dependencies
1. Java 11
2. Maven (Apache Maven 3.9.5) : link to maven installation guide:  https://www.baeldung.com/install-maven-on-windows-linux-mac
3. Mysql (10.4.27-MariaDB)
4. Jax-ws 4.0.2
6. Jakarta.servlet-api 5.0.0


# How To start the project
1. Clone the project and import the database file "scolarite.sql" in your mysql server 
2. Open the project in your IDE
3. Create a database in your mysql server with the name "scolarite" and table "etudiants"
    - or import the database file in your mysql server
4. Run the project from ServerWS.java
5. Open the url http://127.0.0.1:8080/scolarite in your browser to see the wsdl file
6. Now you can test the project in Postman or Chrome


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



# Project Structure
```
java_soap_api
└── src
    └── main
        └── java
            └── com
                └── iam
                    ├── CrosFilter.java
                    ├── ServerWS.java
                    ├── Student.java
                    ├── ScolariteService.java
                    ├── Filiere.java
                    ├── MySqlConction.java
                    └── Main.java (for Test)
└── .vscode
    └── settings.json
└── target
    └── demo-1.0-SNAPSHOT.jar
    └── maven-archiver
    └── maven-status
    └── test-classes
    └── classes
    └── generated-sources
└── pom.xml
└── README.md
└── scolarite.sql

```

# Project Structure Description
1. CrosFilter.java : a filter to allow cross origin requests
2. ServerWS.java : the main class of the project
3. Student.java : the student model
4. ScolariteService.java : the service class of the project
5. Filiere.java : Is a ENUM class that contains the filiere of the students 
6. MySqlConction.java : the class that contains the connection to the database
7. Main.java : a class for testing the project
8. settings.json : the vscode settings file













