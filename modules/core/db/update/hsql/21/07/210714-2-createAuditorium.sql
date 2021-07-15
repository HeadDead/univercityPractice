alter table UNIVERCITYPRACTICE_AUDITORIUM add constraint FK_UNIVERCITYPRACTICE_AUDITORIUM_ON_LABORATORY_NUMBERCABINET foreign key (LABORATORY_NUMBERCABINET) references UNIVERCITYPRACTICE_AUDITORIUM(ID);
alter table UNIVERCITYPRACTICE_AUDITORIUM add constraint FK_UNIVERCITYPRACTICE_AUDITORIUM_ON_LECTURE foreign key (LECTURE_ID) references UNIVERCITYPRACTICE_AUDITORIUM(ID);
create index IDX_UNIVERCITYPRACTICE_AUDITORIUM_ON_LABORATORY_NUMBERCABINET on UNIVERCITYPRACTICE_AUDITORIUM (LABORATORY_NUMBERCABINET);
create index IDX_UNIVERCITYPRACTICE_AUDITORIUM_ON_LECTURE on UNIVERCITYPRACTICE_AUDITORIUM (LECTURE_ID);