create database student_management;
use student_management;
create table student(
std_id int primary key,
std_name varchar(50),
std_roll int,
std_email varchar(40)
);
insert into student(std_id,std_name,std_roll,std_email)
values(1,"mohith",101,'mmg@1234.com');
select * from student;
select std_name,std_email from student;

alter table student
add column std_clss_room varchar(20) default 'cs103';

desc student;
alter table students
drop column std_clss_room;