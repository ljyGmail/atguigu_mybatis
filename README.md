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

```
create table t_emp
(
    eid      int auto_increment
        primary key,
    emp_name varchar(20) null,
    age      int         null,
    sex      char        null,
    email    varchar(20) null,
    did      int         null
);

create table t_dept
(
    did       int auto_increment
        primary key,
    dept_name varchar(20) null
);
```