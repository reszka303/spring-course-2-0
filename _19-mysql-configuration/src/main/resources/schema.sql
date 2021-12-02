# CREATE DATABASE company DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_polish_ci;

CREATE TABLE IF NOT EXISTS company.employee(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    salary DOUBLE
);