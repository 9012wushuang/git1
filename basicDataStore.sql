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
   lall                 varchar(100) comment 'ȫ��(��json,�����ͽ��)',
   ladd                 varchar(100) comment '����(��json,�����ͽ��)',
   lreturn              varchar(100) comment '�˻�(��json,�����ͽ��)',
   luse                 varchar(100) comment 'ʹ��(��json,�����ͽ��)',
   free                 varchar(100) comment '����(��json,�����ͽ��)',
   buy                  varchar(100) comment '����(��json,�����ͽ��)',
   lease                varchar(100) comment '����(��json,�����ͽ��)',
   receive_use          varchar(100) comment '����(��json,�����ͽ��)',
   borrow               varchar(100) comment '����(��json,�����ͽ��)',
   company_id           varchar(100) comment '��˾id',
   root_company_id      varchar(100) comment 'root��˾id',
   date                 timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP comment 'ͳ������(��ʽ��yyyy-MM-dd)',
   month_begin_hand_end int comment '�³�or����or��ĩ(0 �³� 1�¹����� 2��ĩ)',
   cdate                datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
   mdate                datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   primary key (id)
);

alter table asset_basic_data comment 'ͳ�ƻ������ݴ洢';

