# 使用到的表结构
```
create table t_user
(
    id       int auto_increment
        primary key,
    username varchar(20) null,
    password varchar(20) null,
    age      int         null,
    sex      char        null,
    email    varchar(20) null
);
```