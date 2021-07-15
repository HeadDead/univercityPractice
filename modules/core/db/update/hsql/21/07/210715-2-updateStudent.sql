-- update UNIVERCITYPRACTICE_STUDENT set GROUP_ID = <default_value> where GROUP_ID is null ;
alter table UNIVERCITYPRACTICE_STUDENT alter column GROUP_ID set not null ;
