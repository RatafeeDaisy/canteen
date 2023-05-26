-- 数据库canteen创建语句
drop database if exists canteen;
create database canteen
    default character set utf8mb4 collate utf8mb4_general_ci;

use canteen;

-- 创建相对应的数据库表
drop table if exists canteen_customer;
create table if not exists canteen_customer
(
    customer_id         varchar(11) not null comment '餐厅顾客号'
        primary key,
    customer_name       varchar(20) null comment '顾客姓名',
    customer_mobile     char(11)    null comment '顾客手机号',
    customer_address    varchar(50) null comment '顾客地址',
    customer_postscript varchar(30) null comment '备注',
    create_time         datetime    null comment '创建时间',
    update_time         datetime    null comment '修改时间'
)
    comment '餐厅顾客';

drop table if exists canteen_dish;
create table if not exists canteen_dish
(
    dish_id        varchar(11)  not null comment '菜品号'
        primary key,
    dish_name      varchar(20)  null comment '菜品名称',
    dish_category  varchar(10)  null comment '菜品类别',
    dish_detail    varchar(100) null comment '菜品详情',
    dish_image_url varchar(50)  null comment '菜品图片',
    create_time    datetime     null comment '创建时间',
    update_time    datetime     null comment '修改时间'
)
    comment '餐厅菜品';

drop table if exists canteen_menu;
create table if not exists canteen_menu
(
    menu_id     varchar(11) not null comment '菜单号'
        primary key,
    menu_name   varchar(20) null comment '菜单名称',
    create_time datetime    null comment '创建时间',
    update_time datetime    null comment '修改时间'
);

drop table if exists canteen_order;
create table if not exists canteen_order
(
    order_id         varchar(18)      not null comment '订单号'
        primary key,
    customer_id      varchar(11)      null comment '顾客号',
    order_mobile  char(11)         null comment '订单手机号',
    order_address varchar(50)      null comment '订单地址',
    order_price      decimal(8, 2)    null comment '订单总价',
    combo_quantity   tinyint unsigned null comment '订单套餐数',
    order_postscript varchar(30)      null comment '订单备注',
    create_time      datetime         null comment '订单创建时间',
    update_time      datetime         null comment '订单修改时间'
)
    comment '餐厅订单表';

drop table if exists combo_dish;
create table if not exists combo_dish
(
    combo_dish_id int auto_increment comment '套餐菜品关系'
        primary key,
    combo_id      int         null comment '套餐号',
    dish_id       varchar(11) null comment '菜品号',
    create_time   datetime    null comment '创建时间',
    update_time   datetime    null comment '修改时间'
)
    comment '套餐菜品关系';

drop table if exists menu_dish;
create table if not exists menu_dish
(
    menu_dish_id int auto_increment
        primary key,
    menu_id      varchar(11) null comment '菜单号',
    dish_id      varchar(11) null comment '菜品号',
    create_time  datetime    null comment '创建时间',
    update_time  datetime    null comment '修改时间'
)
    comment '菜单菜品关系';

drop table if exists order_combo;
create table if not exists order_combo
(
    combo_id         int auto_increment comment '套餐号,自增'
        primary key,
    order_id         varchar(18)      null comment '订单号',
    combo_postscript varchar(30)      null comment '套餐备注',
    combo_quantity   tinyint unsigned null comment '套餐份数',
    combo_price      decimal(8, 2)    null comment '套餐价格',
    create_time      datetime         null comment '创建时间',
    update_time      datetime         null comment '修改时间'
)
    comment '订单套餐';

drop table if exists today_menu;
create table if not exists today_menu
(
    today_menu_id int auto_increment comment '今日菜单编号'
        primary key,
    menu_id       varchar(11) null comment '菜单号',
    menu_date     date        null comment '菜单显示日期',
    create_time   datetime    null comment '创建时间',
    update_time   datetime    null comment '修改时间'
)
    comment '今日菜单';


