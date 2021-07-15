create table UNIVERCITYPRACTICE_STUDENT_GROUP_LINK (
    STUDENT_ID varchar(36) not null,
    GROUP_ID varchar(36) not null,
    primary key (STUDENT_ID, GROUP_ID)
);
