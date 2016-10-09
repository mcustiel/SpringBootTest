create table uc_users (
    id          bigint(20)  auto_increment not null,
    user_name   tinytext    not null,
    password    tinytext    not null,
    email       tinytext    not null,

    primary key(id)
) default character set utf8 collate utf8_general_ci;

create table bookmarks (
    id          bigint(20)   auto_increment not null,
    category    int          not null, 
    position    int          default 0,
    url         tinytext     not null,
    name        varchar(80)  collate utf8_general_ci,
    clicked     bigint(20)   default 0,
    note        varchar(100) collate utf8_general_ci,
    favicon     tinytext     collate utf8_general_ci,

    index `category`,
    primary key(id)
) default character set utf8 collate utf8_general_ci;

create table categories (
    id          bigint(20)   auto_increment not null,
    dashboard   bigint(20)   not null,
    position    int          default 0,
    name        varchar(80)  collate utf8_general_ci,
    hidden      tinyint(1)   default 0,
    side        varchar(100) collate utf8_general_ci,
    color       varchar(30)  collate utf8_general_ci,

    index `dashboard`,
    primary key(id)
) default character set utf8 collate utf8_general_ci;

create table categories (
    id          bigint(20)   auto_increment not null,
    `user`      bigint(20)   not null,
    position    int          default 0,
    name        varchar(80)  collate utf8_general_ci,

    index `user`,
    primary key(id)
) default character set utf8 collate utf8_general_ci;

