insert into PUBLIC.UNIVERCITYPRACTICE_AUDITORIUM (ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, DTYPE, NUMBER_CABINET, NUMBER_OF_GROUP)
values  ('3be77b33-9e77-ade9-2e30-cc5e197ab9f6', 1, '2021-07-21 02:10:26.019000', 'admin', '2021-07-21 02:10:26.019000', null, null, null, 'univercitypractice_Laboratory', 15, null),
        ('8274f942-6c7b-c3e8-7fe0-10668ceb288d', 1, '2021-07-21 02:13:36.063000', 'admin', '2021-07-21 02:13:36.063000', null, null, null, 'univercitypractice_Lecture', 2, 2),
        ('9fa56896-2db7-3a08-1464-523e6c356044', 2, '2021-07-21 02:09:38.511000', 'admin', '2021-07-21 02:10:16.580000', 'admin', null, null, 'univercitypractice_Lecture', 10, 3),
        ('b3bae5fc-6ca4-6975-cbdc-299fd17b561d', 1, '2021-07-21 02:13:33.539000', 'admin', '2021-07-21 02:13:33.539000', null, null, null, 'univercitypractice_Lecture', 1, 3);

insert into PUBLIC.UNIVERCITYPRACTICE_GROUP (ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, NUMBER_NAME_GROUP)
values  ('16211d6d-0bed-0365-22f6-e18996fda7ca', 1, '2021-07-21 02:09:17.246000', 'admin', '2021-07-21 02:09:17.246000', null, null, null, 'Пи-91'),
        ('4073b1a8-d1da-fd0c-d5a5-6b84d0332dcf', 1, '2021-07-21 02:08:59.074000', 'admin', '2021-07-21 02:08:59.074000', null, null, null, 'Рпис-92');

insert into PUBLIC.UNIVERCITYPRACTICE_STUDENT (ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, SECOND_NAME, THIRD_NAME, NUMBER_BOOKS)
values  ('1cb8be18-377f-8980-5298-b408f9710715', 1, '2021-07-22 02:10:08.578000', 'admin', '2021-07-22 02:10:08.578000', null, null, null, 'Артем', 'Миронов', 'Максимович', 122312),
        ('30a3acc5-619f-9468-9bf4-91782c2c0f2f', 1, '2021-07-22 02:11:05.305000', 'admin', '2021-07-22 02:11:05.305000', null, null, null, 'Анна', 'Пушкина', 'Сергеевна', 213414),
        ('9fdbd187-92b2-1323-19a8-7e78f677ab5d', 1, '2021-07-22 02:10:37.016000', 'admin', '2021-07-22 02:10:37.016000', null, null, null, 'Богдан', 'Тихомиров', 'Титомирович', 413241),
        ('da427016-8df7-c842-2277-ee3feb2c4436', 1, '2021-07-22 02:09:21.841000', 'admin', '2021-07-22 02:09:21.841000', null, null, null, 'Николай', 'Попов', 'Артемонович', 121321);

insert into PUBLIC.UNIVERCITYPRACTICE_TEACHER (ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, FIRST_NAME, SECOND_NAME, THIRD_NAME, EMAIL)
values  ('9457cbe9-ca7a-15b1-a394-c78011613dd1', 1, '2021-07-22 02:08:26.150000', 'admin', '2021-07-22 02:08:26.150000', null, null, null, 'Егор', 'Николаев', 'Юрьевич', 'abobus@mail.ru'),
        ('9852b355-cbd7-29e5-23c9-0a4e24cde09e', 1, '2021-07-22 02:08:52.187000', 'admin', '2021-07-22 02:08:52.187000', null, null, null, 'Сергей', 'Романов', 'Николаевич', 'amogus@mail.ru');

insert into PUBLIC.UNIVERCITYPRACTICE_EMPLOYMENT (ID, VERSION, CREATE_TS, CREATED_BY, UPDATE_TS, UPDATED_BY, DELETE_TS, DELETED_BY, DURATION, START_TIME, TEACHER_ID, NAME_EMPLOYMENT, AUDITORIUM_ID)
values  ('8ed83b87-beac-bbc4-26e9-1a966c57d4b0', 1, '2021-07-22 02:11:36.724000', 'admin', '2021-07-22 02:11:36.724000', null, null, null, 90, '2021-07-22 11:00:00.000000', '9852b355-cbd7-29e5-23c9-0a4e24cde09e', '1С программирование', '9fa56896-2db7-3a08-1464-523e6c356044'),
        ('f2d4953a-c9ad-758e-d50d-733428d4101b', 1, '2021-07-22 02:12:03.112000', 'admin', '2021-07-22 02:12:03.112000', null, null, null, 90, '2021-07-22 12:00:00.000000', '9457cbe9-ca7a-15b1-a394-c78011613dd1', 'Java SE', 'b3bae5fc-6ca4-6975-cbdc-299fd17b561d');

insert into PUBLIC.UNIVERCITYPRACTICE_EMPLOYMENT_GROUP_LINK (GROUP_ID, EMPLOYMENT_ID)
values  ('16211d6d-0bed-0365-22f6-e18996fda7ca', '8ed83b87-beac-bbc4-26e9-1a966c57d4b0'),
        ('4073b1a8-d1da-fd0c-d5a5-6b84d0332dcf', 'f2d4953a-c9ad-758e-d50d-733428d4101b');

insert into PUBLIC.UNIVERCITYPRACTICE_STUDENT_GROUP_LINK (STUDENT_ID, GROUP_ID)
values  ('1cb8be18-377f-8980-5298-b408f9710715', '16211d6d-0bed-0365-22f6-e18996fda7ca'),
        ('30a3acc5-619f-9468-9bf4-91782c2c0f2f', '16211d6d-0bed-0365-22f6-e18996fda7ca'),
        ('9fdbd187-92b2-1323-19a8-7e78f677ab5d', '4073b1a8-d1da-fd0c-d5a5-6b84d0332dcf'),
        ('da427016-8df7-c842-2277-ee3feb2c4436', '4073b1a8-d1da-fd0c-d5a5-6b84d0332dcf');

insert into PUBLIC.UNIVERCITYPRACTICE_TEACHER_EMPLOYMENT_LINK (TEACHER_ID, EMPLOYMENT_ID)
values  ('9457cbe9-ca7a-15b1-a394-c78011613dd1', 'f2d4953a-c9ad-758e-d50d-733428d4101b'),
        ('9852b355-cbd7-29e5-23c9-0a4e24cde09e', '8ed83b87-beac-bbc4-26e9-1a966c57d4b0');