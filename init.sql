CREATE TABLE users(
    id integer GENERATED by default as identity primary key ,
    email varchar(50) not null ,
    password varchar(20) not null ,
    regDate date
);
insert into users(email, password, regDate)
values('i@bikmeev.ru','123',CURRENT_DATE),('ivanoff256@mail.ru','qwerty123',CURRENT_DATE);