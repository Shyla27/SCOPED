 SET MODE PostgreSQL;

 CREATE DATABASE organisational_api ;
    \c organisational_api;


CREATE TABLE  IF NOT EXISTS departments (
 id int PRIMARY KEY ,
 name 	VARCHAR,
 description VARCHAR,
 website VARCHAR,
 workers INTEGER,
 email VARCHAR
);

CREATE TABLE  IF NOT EXISTS  users (
 id int PRIMARY KEY ,
 name VARCHAR,
 role VARCHAR,
  departmentid INTEGER,
 position VARCHAR
 );

CREATE TABLE IF NOT EXISTS news (
id int  PRIMARY KEY ,
author VARCHAR,
content VARCHAR,
departmentid INTEGER 
);
