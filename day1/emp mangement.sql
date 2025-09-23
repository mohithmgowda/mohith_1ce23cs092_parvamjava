create database emp_mangement;
use emp_mangement;

create table employee(
emp_id int primary key,
emp_name varchar(50),
emp_roll int,
emp_email varchar(40)
);

insert into employee(emp_id,emp_name,emp_roll,emp_email)
values(1,"mohith",101,'mmg@1234.com'),
(2,"ohith",102,'mmg@1234.com'),
(3,"ith",103,'mmg@134.com');

select * from employee;

select emp_name,emp_email from employee;


alter table employee
add column std_office_room varchar(20) default 'cs103';

desc employee;

alter table employee
drop column std_office_room;

select * from employee limit 1;
select * from employee where emp_id=1;

select * from employee limit 3 offset 1;

update employee
set emp_name= 'roy'
where emp_id=2;

delete from employee
where emp_id=1;

truncate employee;

drop table employee;

drop database emp_management;

select database();

