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
    NUMBER_ integer not null,
    --
    -- from univercitypractice_Lecture
    CAPACITY integer not null,
    --
    primary key (ID)
);