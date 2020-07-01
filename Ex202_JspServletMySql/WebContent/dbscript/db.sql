create database userdb;
use userdb;

create table userinfo(sno int primary key auto_increment, fullname varchar(32), dob varchar(10), nation varchar(25), gender varchar(1), 
pwd varchar(32), email varchar(50), hobbies varchar(150), activeflag varchar(1));

insert into userinfo(fullname, dob, nation, gender, pwd, email, hobbies, activeflag ) values(?, ?, ?, ?, ?, ?, ?, ?);
select * from userinfo;

update userinfo set activeflag='y' where email='?';

select lower(activeflag) from userinfo;
