-- alter table UNIVERCITYPRACTICE_GROUP add column AUDITORIUM_ID varchar(36) ^
-- update UNIVERCITYPRACTICE_GROUP set AUDITORIUM_ID = <default_value> ;
-- alter table UNIVERCITYPRACTICE_GROUP alter column AUDITORIUM_ID set not null ;
alter table UNIVERCITYPRACTICE_GROUP add column AUDITORIUM_ID varchar(36) not null ;
