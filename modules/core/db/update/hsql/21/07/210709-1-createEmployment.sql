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
    AUDITORIUM_ID varchar(36) not null,
    --
    primary key (ID)
);