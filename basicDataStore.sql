/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/1/22 11:54:09                           */
/*==============================================================*/


drop table if exists asset_basic_data;

/*==============================================================*/
/* Table: asset_basic_data                                      */
/*==============================================================*/
create table asset_basic_data
(
   id                   bigint(20) not null auto_increment,
   lall                 varchar(100) comment '全部(存json,数量和金额)',
   ladd                 varchar(100) comment '新增(存json,数量和金额)',
   lreturn              varchar(100) comment '退还(存json,数量和金额)',
   luse                 varchar(100) comment '使用(存json,数量和金额)',
   free                 varchar(100) comment '空闲(存json,数量和金额)',
   buy                  varchar(100) comment '购买(存json,数量和金额)',
   lease                varchar(100) comment '租赁(存json,数量和金额)',
   receive_use          varchar(100) comment '领用(存json,数量和金额)',
   borrow               varchar(100) comment '借用(存json,数量和金额)',
   company_id           varchar(100) comment '公司id',
   root_company_id      varchar(100) comment 'root公司id',
   date                 timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP comment '统计日期(格式：yyyy-MM-dd)',
   month_begin_hand_end int comment '月初or月中or月末(0 月初 1月过程中 2月末)',
   cdate                datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
   mdate                datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

alter table asset_basic_data comment '统计基础数据存储';

