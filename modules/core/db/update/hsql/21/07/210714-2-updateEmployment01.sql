alter table UNIVERCITYPRACTICE_EMPLOYMENT add constraint FK_UNIVERCITYPRACTICE_EMPLOYMENT_ON_TEACHER foreign key (TEACHER_ID) references UNIVERCITYPRACTICE_TEACHER(ID);
create index IDX_UNIVERCITYPRACTICE_EMPLOYMENT_ON_TEACHER on UNIVERCITYPRACTICE_EMPLOYMENT (TEACHER_ID);