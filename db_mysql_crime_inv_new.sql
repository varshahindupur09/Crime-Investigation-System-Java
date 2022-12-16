CREATE DATABASE IF NOT EXISTS crime_inv_sys;
USE crime_inv_sys;


#----- Crime branch tables -----------

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

drop table firDetails cascade;

CREATE TABLE if not exists officerDetails
(
    officerName varchar(20) NOT NULL,
    officerAddress varchar(100) NOT NULL,
    officerEmail varchar(50) NOT NULL,
    officerPhoneNumber varchar(10) NOT NULL
);

ALTER TABLE officerDetails ADD PRIMARY KEY(officerEmail);

drop table officerDetails cascade;

truncate table firDetails;
truncate table casedetails;
truncate table officerDetails;
truncate table adminUser;

create table adminUser
(
    username varchar(20) NOT NULL,
    pass varchar(20) NOT NULL,
    roleCategory varchar(100) NOT NULL
);

ALTER TABLE adminUser ADD PRIMARY KEY(username);
drop table adminUser cascade;

select * from officerDetails;
select * from adminUser;
select * from casedetails;
select * from firDetails;

#----- newspaper tables -----------

create table if not exists author
(
    authorId varchar(20) NOT NULL,
    authorName varchar(20) NOT NULL,
    authorAge int NOT NULL,
    authorYOE int NOT NULL,
    authorGender varchar(50) NOT NULL,
    authorDOJ varchar(10) NOT NULL
);

ALTER TABLE author ADD PRIMARY KEY(authorid);
select * from author;
drop table author cascade;
truncate table author;

create table if not exists newspaper
(
    npId varchar(20) NOT NULL,
    npName varchar(20) NOT NULL,
    npPrice int NOT NULL,
    npNoOfPages int NOT NULL,
    npDate varchar(10) NOT NULL,
    npPublicationId varchar(10) NOT NULL
);

ALTER TABLE newspaper ADD PRIMARY KEY(npId);
select * from newspaper;
drop table newspaper cascade;
truncate table newspaper;

create table if not exists news
(
    newsId varchar(20) NOT NULL,
    newsCrime varchar(20) NOT NULL,
    newsCrimeDate varchar(20) NOT NULL,
    newsAuthor varchar(100) NOT NULL,
    newsReporter varchar(100) NOT NULL,
    newsPublication varchar(100) NOT NULL
);

ALTER TABLE news ADD PRIMARY KEY(newsId);
select * from news;
drop table news cascade;
truncate table news;

#----- resource tables -----------

create table if not exists army
(
    generalId varchar(100) NOT NULL,
    generalName varchar(100) NOT NULL,
    department varchar(100) NOT NULL,
    country varchar(100) NOT NULL
);

ALTER TABLE army ADD PRIMARY KEY(generalId);
select * from army;
drop table army cascade;
truncate table army;

create table if not exists trainedAnimal
(
    trainerId int NOT NULL,
    trainerName varchar(100) NOT NULL,
    animalId int NOT NULL,
    animalName varchar(100) NOT NULL
);

ALTER TABLE trainedAnimal ADD PRIMARY KEY(trainerId);
select * from trainedAnimal;
drop table trainedAnimal cascade;
truncate table trainedAnimal;

create table if not exists weapon
(
    weaponId int NOT NULL,
    wType varchar(100) NOT NULL,
    wcount varchar(100) NOT NULL
);

ALTER TABLE weapon ADD PRIMARY KEY(weaponId);
select * from weapon;
drop table weapon cascade;
truncate table weapon;

create table if not exists prison
(
    prisonId int NOT NULL,
    prisonName varchar(100) NOT NULL,
    officerId int NOT NULL,
    officerName varchar(100) NOT NULL,
    jailCount int NOT NULL,
    city varchar(100) NOT NULL
);

ALTER TABLE prison ADD PRIMARY KEY(prisonId);
select * from prison;
drop table prison cascade;
truncate table prison;

create table if not exists jail
(
    jailId int NOT NULL,
    jailerId int NOT NULL,
    jailerName varchar(100) NOT NULL,
    criminalCount int NOT NULL
);

ALTER TABLE jail ADD PRIMARY KEY(jailId);
select * from jail;
drop table jail cascade;
truncate table jail;

create table if not exists government
(
    partyLeaderId int NOT NULL,
    partyLeaderName varchar(100) NOT NULL,
    party varchar(100) NOT NULL,
    state varchar(100) NOT NULL
);

ALTER TABLE government ADD PRIMARY KEY(partyLeaderId);
select * from government;
drop table government cascade;
truncate table government;

#----- hospital tables -----------

create table if not exists hospital
(
    hospId int NOT NULL,
    hospName varchar(100) NOT NULL,
    community varchar(100) NOT NULL,
    city varchar(100) NOT NULL,
    docName varchar(100) NOT NULL
);

ALTER TABLE hospital ADD PRIMARY KEY(hospId);
select * from hospital;
drop table hospital cascade;
truncate table hospital;

create table if not exists doctor
(
    docId int NOT NULL,
    docName varchar(100) NOT NULL,
    docPhone varchar(100) NOT NULL,
    hospId int NOT NULL,
    hospName varchar(100) NOT NULL
);

ALTER TABLE doctor ADD PRIMARY KEY(docId);
select * from doctor;
drop table doctor cascade;
truncate table doctor;

create table if not exists forensicLab
(
    forLabId int NOT NULL,
    hospId int NOT NULL,
    hospName varchar(100) NOT NULL
);

ALTER TABLE forensicLab ADD PRIMARY KEY(forLabId);
select * from forensicLab;
drop table forensicLab cascade;
truncate table forensicLab;
