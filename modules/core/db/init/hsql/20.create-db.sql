-- begin UNIVERCITYPRACTICE_EMPLOYMENT
alter table UNIVERCITYPRACTICE_EMPLOYMENT add constraint FK_UNIVERCITYPRACTICE_EMPLOYMENT_ON_TEACHER foreign key (TEACHER_ID) references UNIVERCITYPRACTICE_TEACHER(ID)^
alter table UNIVERCITYPRACTICE_EMPLOYMENT add constraint FK_UNIVERCITYPRACTICE_EMPLOYMENT_ON_AUDITORIUM foreign key (AUDITORIUM_ID) references UNIVERCITYPRACTICE_AUDITORIUM(ID)^
create index IDX_UNIVERCITYPRACTICE_EMPLOYMENT_ON_TEACHER on UNIVERCITYPRACTICE_EMPLOYMENT (TEACHER_ID)^
create index IDX_UNIVERCITYPRACTICE_EMPLOYMENT_ON_AUDITORIUM on UNIVERCITYPRACTICE_EMPLOYMENT (AUDITORIUM_ID)^
-- end UNIVERCITYPRACTICE_EMPLOYMENT
-- begin UNIVERCITYPRACTICE_STUDENT_GROUP_LINK
alter table UNIVERCITYPRACTICE_STUDENT_GROUP_LINK add constraint FK_STUGRO_ON_STUDENT foreign key (STUDENT_ID) references UNIVERCITYPRACTICE_STUDENT(ID)^
alter table UNIVERCITYPRACTICE_STUDENT_GROUP_LINK add constraint FK_STUGRO_ON_GROUP foreign key (GROUP_ID) references UNIVERCITYPRACTICE_GROUP(ID)^
-- end UNIVERCITYPRACTICE_STUDENT_GROUP_LINK
-- begin UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK
alter table UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK add constraint FK_EMPGRO_ON_GROUP foreign key (GROUP_ID) references UNIVERCITYPRACTICE_GROUP(ID)^
alter table UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK add constraint FK_EMPGRO_ON_EMPLOYMENT foreign key (EMPLOYMENT_ID) references UNIVERCITYPRACTICE_EMPLOYMENT(ID)^
-- end UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK
