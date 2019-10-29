 SET MODE PostgreSQL;

CREATE TABLE  IF NOT EXISTS departments (
 id int PRIMARY KEY  auto_increment,
 name 	VARCHAR,
 description VARCHAR,
 website VARCHAR,
 workers INTEGER,
 email VARCHAR
);

CREATE TABLE  IF NOT EXISTS  users (
 id int PRIMARY KEY auto_increment,
 name VARCHAR
);

CREATE TABLE IF NOT EXISTS news (
id int  PRIMARY KEY auto_increment,
author VARCHAR,
content VARCHAR,
departmentid INTEGER 
);
