create database project;
use project;

create table employee(
name varchar(25),
job_title varchar(45),
phone_no int,
salary int,
dept_id int,
project_id int);

create table department(
dept_id int,
dept_name varchar(300)
);

create table project(
proj_id int,
proj_name varchar(35)
);