drop sequence author_sequence if exists;
drop sequence book_sequence if exists;

insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Thorben','Janssen', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Joshua','Bloch', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Martin','Fowler', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Mario','Fusco', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Eugen','Baeldung', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Venkat','Subramaniam', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Vlad','Mihalcea', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Christian','Baver', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Gavin','King', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Gary','Gregory', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Elder','Moraes', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Robert','C.Martin', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Brian','Goetz', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'David','Holmes', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Eric','Freeman', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Craig','Walls', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Scott','Oaks', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Herbert','Schildt', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Josh','Long', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Kenny','Bastani', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'John','Carnell', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Greg','Turnquist', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Cay','S. Horstmann', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Richard','Warburton', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Jeff','Brown', 0);
insert into author (id, firstName, lastName, version) values (nextval('author_sequence'),'Graeme','Rocher', 0);


insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Hibernate Tips', 1, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Java 8 in Action', 4, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Modern Java in Action', 4, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Refactoring', 3, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Patterns of Enterprise Application Architecture', 3, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Effective Java 1st Edition', 2, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Effective Java 2nd Edition', 2, 0);
insert into book (id, title, author_id, version) values (nextval('book_sequence'),'Effective Java 3rd Edition', 2, 0);
