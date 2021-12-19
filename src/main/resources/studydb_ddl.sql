drop table ACCOUNT;
create table ACCOUNT (
    USER_ID         varchar(50)     not null
,   PASSWORD        varchar(256)    not null
,   USER_NAME       varchar(200)    not null
,   ACCOUNT_TYPE    char(2)         not null
,   INS_DATE        date            not null
,   INS_USER        varchar(50)
,   UPD_DATE        date            not null
,   UPD_USER        varchar(50)
,   primary key     (USER_ID)
);

drop table ITEM;
create table ITEM (
    ITEM_CODE       varchar(10)     not null
,   ITEM_NAME       varchar(256)    not null
,   NOTE            text
,   ITEM_TYPE       char(2)         not null
,   LOT_MNG         char(1)         not null
,   VALID_FLG       char(1)         not null
,   INS_DATE        date            not null
,   INS_USER        varchar(50)
,   UPD_DATE        date            not null
,   UPD_USER        varchar(50)
,   primary key     (ITEM_CODE)
);

