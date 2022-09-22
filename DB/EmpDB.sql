create database EmpDB;
show databases;
use EmpDB;
create table Emp_table(EMP_ID int not null primary key,MANAGER_ID int,FIRST_NAME varchar(20 ) not null,LAST_NAME varchar(20) not null,EMP_TITLE varchar(30) not null,salary varchar(50) not null,JOINING_DATA  varchar(50)not null,DEP varchar(50) not null);
show tables;
desc Emp_table;
insert into Emp_table values
(1,NULL,"monika","arora","manager","100000","02/20/14 9:00","HR"),
(2,1,"niharika","verma","executive","80000","06/11/14 9:00","admin"),
(3,1,"vishal","singhal","executive","300000","02/20/14 9:00","HR"),
(4,NULL,"amitabh","singh","manager","500000","02/20/14 9:00","admin"),
(5,4,"VIVEK","bhati","asst manager","500000","06/11/14 9:00","admin"),
(6,5,"vipul","diwan","executive","200000","06/11/14 9:00","account"),
(7,4,"satish","kumar","lead","75000","01/20/14 9:00","account"),
(8,4,"geetika","chauhan","lead","90000","04/11/14 9:00","admin");
select * from Emp_table;



 


select MANAGER_ID fROM Emp_table where MANAGER_ID IS NULL;
Select concat(FIRST_NAME," ",LAST_NAME) as NAME from Employee where SALARY between 50000 and 1000000;

alter table Employee change column EXP_ID EMP_ID int not null;
desc Employee;
select concat(a.FIRST_NAME," ",a.LAST_NAME) as EMPLOYEE, b.FIRST_NAME as MANAGER from Employee a, Employee b where b.EMP_ID = a.MANAGER_ID;

select DEP, count(*) as no_of_employee from Employee group by DEP order by no_of_employee desc;

select FIRST_NAME from Employee where MANAGER_ID is null;

select count(EMP_ID) from Employee group by JOINING_DATE>01/01/15 and JOINING_DATE<31/12/15;






 

