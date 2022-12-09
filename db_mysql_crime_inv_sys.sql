
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
DROP TABLE employees cascade;
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

CREATE TABLE if not exists caseDetails 
(
	emailId varchar(50) NOT NULL,
    phoneNum varchar(10) NOT NULL,
	dateOfReport DATE NOT NULL,
    officerName varchar(50) NOT NULL
);

ALTER TABLE caseDetails ADD PRIMARY KEY(emailId);

ALTER TABLE caseDetails ADD UNIQUE (crimeId, dateOfOffence, descr);

drop table casedetails cascade;

CREATE TABLE if not exists firDetails 
(
	dateOfOffence DATE NOT NULL,
    descr VARCHAR(250) NOT NULL,
    policeStationLoc varchar(20) NOT NULL,
    accorvic varchar(10) NOT NULL,
    firstname varchar(10) NOT NULL,
    lastname varchar(10) NOT NULL,
    emailId varchar(50) NOT NULL,
    phoneNum varchar(10) NOT NULL,
    address varchar(100) NOT NULL
);

ALTER TABLE firDetails ADD PRIMARY KEY(emailId);

alter table caseDetails add index idx_case_descr (descr);

alter table firDetails add index idx_descr (descr);

ALTER TABLE firDetails ADD UNIQUE (firId, dateOfOffence, descr, policeStationLoc);

ALTER TABLE casedetails ADD CONSTRAINT fk_1 FOREIGN KEY (dateOfOffence) REFERENCES firDetails(dateOfOffence);

ALTER TABLE casedetails ADD CONSTRAINT fk_2 FOREIGN KEY (descr) REFERENCES firDetails(descr);

drop table firDetails cascade;

select * from casedetails;
select * from firDetails;

truncate table firDetails;
truncate table casedetails;

CREATE TABLE if not exists officerDetails
(
    officerName varchar(20) NOT NULL,
    officerAddress varchar(100) NOT NULL,
    officerEmail varchar(50) NOT NULL,
    officerPhoneNumber varchar(10) NOT NULL
);
ALTER TABLE officerDetails ADD PRIMARY KEY(officerEmail);
select * from officerDetails;
drop table officerDetails cascade;
truncate table officerDetails;