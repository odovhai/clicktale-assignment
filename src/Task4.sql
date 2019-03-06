#Wroking script for MySql database (tested on Ver 14.14 Distrib 5.7.24, for Linux (x86_64))

CREATE DATABASE test;

USE test;

CREATE TABLE Division (
  Id bigint not null auto_increment,
  Name varchar(127) not null unique,
  primary key (id)
);


CREATE TABLE Worker (
  Id bigint not null auto_increment,
  Name varchar(127) not null,
  Salary int not null,
  DivisionId bigint not null,
  primary key (id),
  foreign key (DivisionId) REFERENCES Division(Id)
);

INSERT INTO Division(Name) VALUES('IT');
INSERT INTO Division(Name) VALUES('Sales');


INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Joe', 70000, 1);
INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Henry', 80000, 2);
INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Sam', 60000, 2);
INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Max', 90000, 1);
INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Janet', 69000, 1);
INSERT INTO Worker(Name, Salary, DivisionId) VALUES('Randy', 85000, 1);


SELECT d.Name as Division, w.Name as Worker, w.Salary
FROM (SELECT w2.Name, w2.DivisionId, w2.Salary
      FROM (SELECT Name,
                   DivisionId,
                   Salary,
                   @Rownumber := IF(@Previous = DivisionId, @Rownumber + 1, 1) rn,
                   @Previous := DivisionId
            FROM Worker
                   JOIN (SELECT @Previous := NULL, @Rownumber := 0) v
            ORDER BY DivisionId, Salary DESC, Name) w2
      WHERE rn <= 3) w
       JOIN Division d ON d.Id = w.DivisionId
ORDER BY Division, Salary DESC, Worker;