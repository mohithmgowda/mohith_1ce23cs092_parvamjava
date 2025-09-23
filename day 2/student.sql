create database student_course_system;
use student_course_system;

CREATE TABLE StudentCourses_UNF(
    Student_ID INT,
    Student_Name VARCHAR(50),
    Courses_Taken VARCHAR(100),     -- Multiple values stored as comma-separated
    Instructor_Names VARCHAR(100)   -- Multiple values stored as comma-separated
);

show tables;
desc StudentCourses_UNF;

INSERT INTO StudentCourses_UNF VALUES
(1, 'John Doe',  'Math, Physics',       'Mr. Alan, Mrs. Smith'),
(2, 'Jane Smith','Math',                'Mr. Alan'),
(3, 'Alex Brown','Physics, Chemistry',  'Mrs. Smith, Dr. White');

select * from StudentCourses_UNF;


CREATE TABLE Students_1NF (
    Student_ID INT PRIMARY KEY,
    Student_Name VARCHAR(50)
);

desc students_1nf;

CREATE TABLE StudentCourses_1NF (
    Student_ID INT,
    Course_Name VARCHAR(50),
    Instructor_Name VARCHAR(50),
    PRIMARY KEY (Student_ID, Course_Name)  -- composite key to ensure uniqueness
);

desc StudentCourses_1NF;

INSERT INTO Students_1NF VALUES
(1, 'John Doe'),
(2, 'Jane Smith'),
(3, 'Alex Brown');

select * from Students_1NF;

INSERT INTO StudentCourses_1NF VALUES
(1, 'Math',      'Mr. Alan'),
(1, 'Physics',   'Mrs. Smith'),
(2, 'Math',      'Mr. Alan'),
(3, 'Physics',   'Mrs. Smith'),
(3, 'Chemistry', 'Dr. White');

select * from StudentCourses_1nf;


show tables;

CREATE TABLE Courses_2NF (
    Course_ID INT PRIMARY KEY,
    Course_Name VARCHAR(50),
    Instructor_Name VARCHAR(50)
);

desc courses_2nf;

INSERT INTO Courses_2NF VALUES
(101, 'Math', 'Mr. Alan'),
(102, 'Physics', 'Mrs. Smith'),
(103, 'Chemistry', 'Dr. White');

select * from courses_2nf;

CREATE TABLE StudentCourses_2NF (
    Student_ID INT,
    Course_ID INT,
    PRIMARY KEY (Student_ID, Course_ID),
    FOREIGN KEY (Student_ID) REFERENCES Students_1NF(Student_ID),
    FOREIGN KEY (Course_ID) REFERENCES Courses_2NF(Course_ID)
);

desc StudentCourses_2NF;

INSERT INTO StudentCourses_2NF VALUES
(1, 101),
(1, 102),
(2, 101),
(3, 102),
(3, 103);

select * from StudentCourses_2NF;


