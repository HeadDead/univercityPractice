create table UNIVERCITYPRACTICE_TEACHER_EMPLOYMENT_LINK (
    TEACHER_ID varchar(36) not null,
    EMPLOYMENT_ID varchar(36) not null,
    primary key (TEACHER_ID, EMPLOYMENT_ID)
);
