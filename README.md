# Java-Database-Connectivity
Steps and Program to connect to Database using java and Oracle Database.

To connect java application with the oracle database, we need to follow 5 following steps. In this example, we are using Oracle 10g as the database. So we need to know following information for the oracle database:

Driver class: The driver class for the oracle database is oracle.jdbc.driver.OracleDriver.
Connection URL: The connection URL for the oracle10G database is jdbc:oracle:thin:@localhost:1521:xe where jdbc is the API, oracle is the database, thin is the driver, localhost is the server name on which oracle is running, we may also use IP address, 1521 is the port number and XE is the Oracle service name. You may get all these information from the tnsnames.ora file.
Username: The default username for the oracle database is system.
Password: It is the password given by the user at the time of installing the oracle database.

Create a table in Oracle (DDL)
create table student(name varchar(255), usn (varchar(255), marks1 int(10), marks2 int(20));

