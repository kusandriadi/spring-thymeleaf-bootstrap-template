springmvc-thymeleaf-bootstrap
=============================

Tools
-------------------
* IDE - Netbeans/Eclipse
* DB - MySQL 5
* Build Tool - Maven3
* Web Server - Tomcat 6

Database Configuration
-------------------
1. open src/main/resources/hibernate.cfg.xml
2. changes username and password database appropiate like you have in your local
3. make a database in MySQL called "db_test"
4. execute query from init.sql

How to Build With Netbeans
-------------------
1. Make sure you have internet connection.
2. Just open the project with Netbeans, wait for a moment, Netbeans will download all maven dependencies

How to Build With Eclipse
-------------------
1. Go to project directories
2. mvn clean install -DskipTests=true
3. mvn eclipse:eclipse
