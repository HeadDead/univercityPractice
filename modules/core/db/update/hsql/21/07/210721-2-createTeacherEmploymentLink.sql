alter table UNIVERCITYPRACTICE_TEACHER_EMPLOYMENT_LINK add constraint FK_TEAEMP_ON_TEACHER foreign key (TEACHER_ID) references UNIVERCITYPRACTICE_TEACHER(ID);
alter table UNIVERCITYPRACTICE_TEACHER_EMPLOYMENT_LINK add constraint FK_TEAEMP_ON_EMPLOYMENT foreign key (EMPLOYMENT_ID) references UNIVERCITYPRACTICE_EMPLOYMENT(ID);