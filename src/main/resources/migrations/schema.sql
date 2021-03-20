DROP TABLE employee;
DROP TABLE company;

CREATE TABLE IF NOT EXISTS employee(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    company INT
);

CREATE TABLE IF NOT EXISTS company(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);
