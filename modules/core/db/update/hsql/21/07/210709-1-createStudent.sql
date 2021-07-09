create table UNIVERCITYPRACTICE_STUDENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    SECOND_NAME varchar(255) not null,
    THIRD_NAME varchar(255),
    NUMBER_BOOKS integer not null,
    --
    primary key (ID)
);