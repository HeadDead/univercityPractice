-- begin UNIVERCITYPRACTICE_AUDITORIUM
create table UNIVERCITYPRACTICE_AUDITORIUM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    NUMBER_CABINET integer not null,
    NUMBER_OF_GROUP integer,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_AUDITORIUM
-- begin UNIVERCITYPRACTICE_EMPLOYMENT
create table UNIVERCITYPRACTICE_EMPLOYMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DURATION integer not null,
    START_TIME timestamp not null,
    TEACHER_ID varchar(36),
    NAME_EMPLOYMENT longvarchar not null,
    AUDITORIUM_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_EMPLOYMENT
-- begin UNIVERCITYPRACTICE_GROUP
create table UNIVERCITYPRACTICE_GROUP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_NAME_GROUP varchar(255) not null,
    EMPLOYMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_GROUP
-- begin UNIVERCITYPRACTICE_TEACHER
create table UNIVERCITYPRACTICE_TEACHER (
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
    EMAIL varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_TEACHER
-- begin UNIVERCITYPRACTICE_STUDENT
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
    NUMBER_BOOKS integer,
    GROUP_ID varchar(36),
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_STUDENT
