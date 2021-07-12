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
    --
    LABORATORY_NUMBERCABINET varchar(36),
    LECTURE_ID varchar(36),
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_AUDITORIUM
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
    DAY_ date not null,
    TIME_ time not null,
    TEACHER_ID varchar(36) not null,
    NAME_EMPLOYAMENT longvarchar not null,
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
    NUMBER_NAME_GROUP Название группы,
    EMPLOYMENT_ID varchar(36),
    AUDITORIUM_ID varchar(36),
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_GROUP
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
    NUMBER_BOOKS integer not null,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_STUDENT
-- begin UNIVERCITYPRACTICE_LABORATORY
create table UNIVERCITYPRACTICE_LABORATORY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_CABINET varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_LABORATORY
-- begin UNIVERCITYPRACTICE_LECTURE
create table UNIVERCITYPRACTICE_LECTURE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAPACITY integer not null,
    NUMBER_CABINET varchar(255) not null,
    --
    primary key (ID)
)^
-- end UNIVERCITYPRACTICE_LECTURE
