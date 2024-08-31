
# CO528-Assignment1-E18154

**A REST Service Application using Spring Boot**

## Overview

This project is a RESTful service application built with Spring Boot. It allows you to manage employees records via a set of RESTful APIs.

---

## REST API Endpoints

### Get All Employees
```http
GET api/employee/getAllEmployees
```
- **Description**: Retrieve a list of all employees.

### Search Employee by id
```http
GET api/employee/searchEmployee/{id}
```
- **Example**: 
  ```http
  GET api/employee/searchEmployee/1
  ```
- **Description**: Retrieve details of a student by their ID.

### Save a new Employee
```http
POST api/employee/saveEmployee
```
- **Description**: Add a new employee to the database.

### Update an Employee
```http
PUT api/employee/updateEmployee
```
- **Description**: Update the details of an employee.

### Delete an employee by ID
```http
DELETE api/employee/deleteEmployee/{id}
```
- **Example**: 
  ```http
  DELETE api/employee/deleteEmployee/1
  ```
- **Description**: Delete an employee record by their ID.
