
CREATE DATABASE IF NOT EXISTS crime_inv_sys;
USE crime_inv_sys;
CREATE TABLE employees 
(
	emp_id int AUTO_INCREMENT,
    firstname VARCHAR(10) NOT NULL,  
    lastname VARCHAR(10) NOT NULL,  
    email VARCHAR(30) NOT NULL,
    salary int NOT NULL,
    emp_role varchar(20) NOT NULL,
    UNIQUE KEY three_values(emp_id,firstname,lastname)
);
#alter table DemoTable1400 add unique key name_age_unique(Name,Age);
DROP TABLE employees;
select * from employees;
INSERT INTO employees (firstname, lastname, email, salary, emp_role)
VALUES ('Rithik','Shah', 'a@b.com',91000, 'cyber_officer');
INSERT INTO employees (firstname, lastname, email, salary, emp_role)
VALUES ('Rohan','Shah', 'a@c.com',50000, 'hacker');
INSERT INTO employees (firstname, lastname, email, salary, emp_role)
VALUES ('Rehan','Patel', 'd@b.com',65000,'police_inspector');
INSERT INTO employees (firstname, lastname, email, salary, emp_role)
VALUES ('Karan','Grover', 's@b.com',32000, 'cid_officer');
INSERT INTO employees (firstname, lastname, email, salary, emp_role)
VALUES ('Varsha','Hindupur', 'v@h.com',100000, 'system_admin');
CREATE TABLE person 
(
	per_id int NOT NULL,
	emp_id int NOT NULL,
    firstname VARCHAR(10) NOT NULL,  
    lastname VARCHAR(10) NOT NULL,  
    age int NOT NULL,
    email VARCHAR(30) NOT NULL,
    salary int NOT NULL,
    emp_role varchar(20) NOT NULL,
    primary key (per_id),
    FOREIGN KEY (emp_id) REFERENCES employees(emp_id)
);