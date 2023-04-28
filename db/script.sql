create table canteen_caidan
(
    caidan_no      varchar(30)   not null
        primary key,
    caidan_zhucai  varchar(50)   null,
    caidan_peicai1 varchar(50)   null,
    caidan_peicai2 varchar(50)   null,
    caidan_peicai3 varchar(50)   null,
    caidan_price   decimal(8, 2) null,
    caidan_fenshu  char(20)      null,
    caidan_beizhu  varchar(50)   null
);

create table canteen_order
(
    order_no           varchar(30) default '' not null
        primary key,
    order_customer     varchar(30)            not null,
    order_mobile       char(11)               not null,
    order_address      varchar(200)           null,
    order_price        decimal(8, 2)          null,
    order_combo_number tinyint                null,
    order_postscript   varchar(200)           null,
    create_time        datetime               null,
    modify_time        datetime               null
);


