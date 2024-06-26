# SpringCRUD
# Cloud Vendor Management API

## Overview

This project is a simple Spring Boot REST API for managing cloud vendors. It provides endpoints to create, read, update, and delete cloud vendor details.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)    
- [Usage](#usage)
  - [API Endpoints](#api-endpoints)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Features

- **Create Cloud Vendor**: Add a new cloud vendor.
- **Get Cloud Vendor**: Retrieve details of a cloud vendor by ID.
- **Update Cloud Vendor**: Update existing cloud vendor details.
- **Delete Cloud Vendor**: Remove a cloud vendor by ID.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

### Installation

1. **Clone the repository**:
   ```sh
   git clone https://github.com/your-username/cloud-vendor-management.git
   cd cloud-vendor-management

2.Build the project:
mvn clean install

3.Run the application:
mvn spring-boot:run

Usage

API Endpoints
Create Cloud Vendor

URL: /cloudvendor
Method: POST
Request Body:
json
Copy code
{
  "vendorId": "C1",
  "name": "Vendor 1",
  "address": "Address One",
  "contactNumber": "xxxxx"
}
Response: Cloud vendor created successfully
Get Cloud Vendor

URL: /cloudvendor/{vendorId}
Method: GET
Response:
json
Copy code
{
  "vendorId": "C1",
  "name": "Vendor 1",
  "address": "Address One",
  "contactNumber": "xxxxx"
}
Update Cloud Vendor

URL: /cloudvendor
Method: PUT
Request Body:
json
Copy code
{
  "vendorId": "C1",
  "name": "Vendor 1 Updated",
  "address": "Address One Updated",
  "contactNumber": "yyyyy"
}
Response: Cloud vendor updated successfully
Delete Cloud Vendor

URL: /cloudvendor/{vendorId}
Method: DELETE
Response: Cloud vendor deleted successfully
Running Tests

To run the tests for this project, use the following command:

sh
Copy code
mvn test
Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

Fork the repository.
Create a new branch: git checkout -b feature/your-feature-name.
Commit your changes: git commit -m 'Add some feature'.
Push to the branch: git push origin feature/your-feature-name.
Open a pull request.
