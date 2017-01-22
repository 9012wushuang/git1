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
asset_status varchar(500) comment '资产状态(退还、使用、空闲、领用、借用、退库1）:存数量和金额（注释:退库1:小于date）',
asset_source varchar(500) comment '资产来源(购买和租赁:存数量和金额)',
asset_other varchar(500) comment '存资产 全部、新增、退库2 :存数量和金额（注释:退库2 :date当日区间内）',
company_id bigint(20) comment '公司id',
root_company_id bigint(20) comment 'root公司id',
date timestamp comment '统计日期(格式：yyyy-MM-dd)',
month_begin_hand_end int comment '月初or月中or月末(0 月初 1月过程中 2月末)',
cdate datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
mdate datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
primary key (id)
);
alter table asset_basic_data comment '统计基础数据存储';
