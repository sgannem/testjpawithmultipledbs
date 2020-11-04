## testjpawithmultipledbs

# References
# About
A simple tutorial about configuring and using two databases in a single Spring Boot 2 application.

Video at: https://www.youtube.com/watch?v=0vO0tZGgmAk

create schema:testdb1
--DROP TABLE users;
CREATE TABLE users ( firstname varchar(100) NULL, lastname varchar(100) NULL, id numeric, primary KEY(id) );
create sequence testseq1;
CREATE TABLE department (name varchar(100),location varchar(100),id numeric,primary key (id));
create sequence deptseq;

create schema:testdb2
--DROP TABLE product;
CREATE TABLE product (name varchar(100),price numeric default 0,id numeric,	primary key (id));
create sequence testseq2;

-- spring batch cleanup scripts.
delete from mif_batch_job_execution_params;
delete from mif_batch_step_execution_context;
delete from mif_batch_step_execution;
delete from mif_batch_job_execution_context;
delete from mif_batch_job_execution;
delete from mif_batch_job_instance;
