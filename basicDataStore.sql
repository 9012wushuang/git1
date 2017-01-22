/*==============================================================*/
/* DBMS name: MySQL 5.0 */
/* Created on: 2017/1/22 11:54:09 */
/*==============================================================*/

drop table if exists asset_basic_data;
/*==============================================================*/
/* Table: asset_basic_data */
/*==============================================================*/
create table asset_basic_data
(
id bigint(20) not null auto_increment,
asset_status varchar(500) comment '�ʲ�״̬(�˻���ʹ�á����С����á����á��˿�1��:�������ͽ�ע��:�˿�1:С��date��',
asset_source varchar(500) comment '�ʲ���Դ(���������:�������ͽ��)',
asset_other varchar(500) comment '���ʲ� ȫ�����������˿�2 :�������ͽ�ע��:�˿�2 :date���������ڣ�',
company_id bigint(20) comment '��˾id',
root_company_id bigint(20) comment 'root��˾id',
date timestamp comment 'ͳ������(��ʽ��yyyy-MM-dd)',
month_begin_hand_end int comment '�³�or����or��ĩ(0 �³� 1�¹����� 2��ĩ)',
cdate datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
mdate datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
primary key (id)
);
alter table asset_basic_data comment 'ͳ�ƻ������ݴ洢';
