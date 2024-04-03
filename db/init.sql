create database user;

create table user.user(
   user_id varchar(64) not null,
   name varchar(64),
   primary key (user_id)
);

insert into user.user(user_id, name) values
('user_id0', 'username0'), 
('user_id1', 'username1');