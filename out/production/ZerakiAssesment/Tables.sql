CREATE DATABASE education;

CREATE TABLE institution (
    institutionid INT(11) PRIMARY KEY,
    name VARCHAR(250)
);

CREATE TABLE course (
    courseid INT(11) PRIMARY KEY,
    name VARCHAR(250),
    institution INT,
    FOREIGN KEY (institution) REFERENCES institution(institutionid)
);

CREATE TABLE student (
    studentid INT(11) PRIMARY KEY,
    name VARCHAR(250),
    course INT(11),
    FOREIGN KEY (course) REFERENCES course(courseid)
);
