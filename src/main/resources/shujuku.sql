create database shujuku;
use shujuku;
create table biao(
XueHao int(20) not null primary key,
MiMa int(20) not null,
XingMing varchar(20) character set utf8 collate utf8_general_ci,
DengJi int(20),
XueLiang int(20),
GongJi int(20),
FangYu int(20),
SuDu int(20),
JinQian int(20),
JingYan int(20),
ShiFou int(20),
XueLiangMax int(20),
JingYanMax int(20));
create trigger biaochufaqi1 before insert on biao for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare mima varchar(20) character set utf8 collate utf8_general_ci;
declare xingming varchar(20) character set utf8 collate utf8_general_ci;
declare dengji varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
declare jinqian varchar(20) character set utf8 collate utf8_general_ci;
declare jingyan varchar(20) character set utf8 collate utf8_general_ci;
declare shifou varchar(20) character set utf8 collate utf8_general_ci;
declare xueliangmax varchar(20) character set utf8 collate utf8_general_ci;
declare jingyanmax varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if new.MiMa<=0 then 
set mima="MiMa>0?,";
set String=concat(String,mima);
end if;  
if length(new.XingMing)=char_length(new.XingMing) then 
set xingming="XingMing=hanzi?,";
set String=concat(String,xingming);
end if; 
if new.DengJi<=0 then
set dengji="DengJi>0?,";
set String=concat(String,dengji);
end if; 
if new.XueLiang<=0 then
set xueliang="XueLiang>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJi<=0 then 
set gongji="GongJi>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYu<=0 then 
set fangyu="FangYu>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDu<=0 then 
set sudu="SuDu>0?,";
set String=concat(String,sudu);
end if;     
if new.JinQian<0 then 
set jinqian="JinQian>=0?,";
set String=concat(String,jinqian);
end if; 
if new.JingYan<0 then 
set jingyan="JingYan>=0?,";
set String=concat(String,jingyan);
end if;
if !(new.ShiFou=0 or new.ShiFou=1 or new.ShiFou=2) then 
set shifou="ShiFou=0,1,2?,";
set String=concat(String,shifou);
end if; 
if new.XueLiangMax<=0 then 
set xueliangmax="XueLiangMax>0?,";
set String=concat(String,xueliangmax);
end if;
if new.JingYanMax<0 then 
set jingyanmax="JingYanMax>=0?,";
set String=concat(String,jingyanmax);
end if;
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create trigger biaochufaqi2 before update on biao for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare mima varchar(20) character set utf8 collate utf8_general_ci;
declare xingming varchar(20) character set utf8 collate utf8_general_ci;
declare dengji varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
declare jinqian varchar(20) character set utf8 collate utf8_general_ci;
declare jingyan varchar(20) character set utf8 collate utf8_general_ci;
declare shifou varchar(20) character set utf8 collate utf8_general_ci;
declare xueliangmax varchar(20) character set utf8 collate utf8_general_ci;
declare jingyanmax varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if new.MiMa<=0 then 
set mima="MiMa>0?,";
set String=concat(String,mima);
end if;  
if length(new.XingMing)=char_length(new.XingMing) then 
set xingming="XingMing=hanzi?,";
set String=concat(String,xingming);
end if; 
if new.DengJi<=0 then
set dengji="DengJi>0?,";
set String=concat(String,dengji);
end if; 
if new.XueLiang<=0 then
set xueliang="XueLiang>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJi<=0 then 
set gongji="GongJi>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYu<=0 then 
set fangyu="FangYu>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDu<=0 then 
set sudu="SuDu>0?,";
set String=concat(String,sudu);
end if;     
if new.JinQian<0 then 
set jinqian="JinQian>=0?,";
set String=concat(String,jinqian);
end if; 
if new.JingYan<0 then 
set jingyan="JingYan>=0?,";
set String=concat(String,jingyan);
end if; 
if !(new.ShiFou=0 or new.ShiFou=1 or new.ShiFou=2) then 
set shifou="ShiFou=0,1,2?,";
set String=concat(String,shifou);
end if; 
if new.XueLiangMax<=0 then 
set xueliangmax="XueLiangMax>0?,";
set String=concat(String,xueliangmax);
end if;
if new.JingYanMax<0 then 
set jingyanmax="JingYanMax>=0?,";
set String=concat(String,jingyanmax);
end if;
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
insert into biao(XueHao,MiMa,ShiFou)
values('1925123522','123456','0');
insert into biao(XueHao,MiMa,ShiFou)
values('1925123516','123456','0');
create table guaiwubiao(
ID int(20) not null primary key,
XingMing varchar(20) character set utf8 collate utf8_general_ci not null,
XueLiang int(20) not null,
GongJi int(20) not null,
FangYu int(20) not null,
SuDu int(20) not null,
JinQian int(20) not null,
JingYan int(20) not null);
create trigger guaiwubiaochufaqi1 before insert on guaiwubiao for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare id varchar(20) character set utf8 collate utf8_general_ci;
declare xingming varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
declare jinqian varchar(20) character set utf8 collate utf8_general_ci;
declare jingyan varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.ID<=0 then
set id="ID>0?,";
set String=concat(String,id);
end if;  
if length(new.XingMing)=char_length(new.XingMing) then 
set xingming="XingMing=hanzi?,";
set String=concat(String,xingming);
end if; 
if new.XueLiang<=0 then
set xueliang="XueLiang>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJi<=0 then 
set gongji="GongJi>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYu<=0 then 
set fangyu="FangYu>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDu<=0 then 
set sudu="SuDu>0?,";
set String=concat(String,sudu);
end if;     
if new.JinQian<=0 then 
set jinqian="JinQian>0?,";
set String=concat(String,jinqian);
end if; 
if new.JingYan<=0 then 
set jingyan="JingYan>0?,";
set String=concat(String,jingyan);
end if; 
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create trigger guaiwubiaochufaqi2 before update on guaiwubiao for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare id varchar(20) character set utf8 collate utf8_general_ci;
declare xingming varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
declare jinqian varchar(20) character set utf8 collate utf8_general_ci;
declare jingyan varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.ID<=0 then
set id="ID>0?,";
set String=concat(String,id);
end if;  
if length(new.XingMing)=char_length(new.XingMing) then 
set xingming="XingMing=hanzi?,";
set String=concat(String,xingming);
end if; 
if new.XueLiang<=0 then 
set xueliang="XueLiang>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJi<=0 then 
set gongji="GongJi>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYu<=0 then 
set fangyu="FangYu>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDu<=0 then 
set sudu="SuDu>0?,";
set String=concat(String,sudu);
end if;     
if new.JinQian<=0 then 
set jinqian="JinQian>0?,";
set String=concat(String,jinqian);
end if; 
if new.JingYan<=0 then 
set jingyan="JingYan>0?,";
set String=concat(String,jingyan);
end if; 
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('1','哥布林','50','7','3','5','8','3');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('2','史莱姆','30','5','1','2','4','1');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('3','巨人','70','9','4','1','10','10');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('4','弓箭野猪','45','6','5','5','8','9');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('5','宝箱怪','10','1','25','1','30','30');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('6','骑士','65','10','8','8','12','15');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('7','猎手','55','7','4','7','8','3');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('8','小魔物','44','7','3','2','5','3');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('9','魔法师','20','20','1','1','10','10');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('10','帕奇','100','20','15','1','20','20');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('11','魔王的小兵','40','6','7','9','8','13');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('12','嘿嘿怪','77','7','7','7','7','7');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('13','闯荡者','150','20','10','10','40','40');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('14','蜥蜴王','200','30','20','4','80','80');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('15','黑商','250','50','36','1','130','130');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('16','象精','300','70','40','4','200','200');
insert into guaiwubiao(ID,XingMing,XueLiang,GongJi,FangYu,SuDu,JinQian,JingYan)
values('17','魔王','1000','100','100','100','1000','1000');
create table shuxingzuida(
XueHao int(20) not null primary key,
XueLiangMax int(20),
GongJiMax int(20),
FangYuMax int(20),
SuDuMax int(20));
create trigger shuxingzuidachufaqi1 before insert on shuxingzuida for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if new.XueLiangMax<=0 then
set xueliang="XueLiangMax>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJiMax<=0 then 
set gongji="GongJiMax>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYuMax<=0 then 
set fangyu="FangYuMax>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDuMax<=0 then 
set sudu="SuDuMax>0?,";
set String=concat(String,sudu);
end if;     
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create trigger shuxingzuidachufaqi2 before update on shuxingzuida for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare xueliang varchar(20) character set utf8 collate utf8_general_ci;
declare gongji varchar(20) character set utf8 collate utf8_general_ci;
declare fangyu varchar(20) character set utf8 collate utf8_general_ci;
declare sudu varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if new.XueLiangMax<=0 then
set xueliang="XueLiangMax>0?,";
set String=concat(String,xueliang);
end if; 
if new.GongJiMax<=0 then 
set gongji="GongJiMax>0?,";
set String=concat(String,gongji);
end if;   
if new.FangYuMax<=0 then 
set fangyu="FangYuMax>0?,";
set String=concat(String,fangyu);
end if; 
if new.SuDuMax<=0 then 
set sudu="SuDuMax>0?,";
set String=concat(String,sudu);
end if;     
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create table daozhuang(
XueHao int(20) not null primary key,
DaoJu varchar(255) character set utf8 collate utf8_general_ci,
ZhuangBei varchar(255) character set utf8 collate utf8_general_ci,
MiWuSenLin varchar(255) character set utf8 collate utf8_general_ci,
DaCaoYuan varchar(255) character set utf8 collate utf8_general_ci,
MoWangChengBao varchar(255) character set utf8 collate utf8_general_ci,
WuQi varchar(255) character set utf8 collate utf8_general_ci,
FangJu varchar(255) character set utf8 collate utf8_general_ci);
create trigger daozhuangchufaqi1 before insert on daozhuang for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare daoju varchar(20) character set utf8 collate utf8_general_ci;
declare zhuangbei varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if length(new.DaoJu)=char_length(new.DaoJu) then 
set daoju="DaoJu=hanzi?,";
set String=concat(String,daoju);
end if; 
if length(new.ZhuangBei)=char_length(new.ZhuangBei) then 
set zhuangbei="ZhuangBei=hanzi?,";
set String=concat(String,zhuangbei);
end if; 
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create trigger daozhuangchufaqi2 before update on daozhuang for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
declare daoju varchar(20) character set utf8 collate utf8_general_ci;
declare zhuangbei varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if length(new.DaoJu)=char_length(new.DaoJu) then 
set daoju="DaoJu=hanzi?,";
set String=concat(String,daoju);
end if; 
if length(new.ZhuangBei)=char_length(new.ZhuangBei) then 
set zhuangbei="ZhuangBei=hanzi?,";
set String=concat(String,zhuangbei);
end if; 
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create table luren(
XueHao int(20) not null primary key,
MiWuSenLin varchar(255) character set utf8 collate utf8_general_ci,
DaCaoYuan varchar(255) character set utf8 collate utf8_general_ci,
MoWangChengBao varchar(255) character set utf8 collate utf8_general_ci);
create trigger lurenchufaqi1 before insert on luren for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create trigger lurenchufaqi2 before update on luren for each row
begin
declare String varchar(255) character set utf8 collate utf8_general_ci;
declare xuehao varchar(20) character set utf8 collate utf8_general_ci;
set String="";
if new.XueHao<=0 then
set xuehao="XueHao>0?,";
set String=concat(String,xuehao);
end if;  
if String!="" then
set String=left(String,char_length(String)-1);
signal sqlstate 'HY000' set mysql_errno = 22, message_text = String;
end if;
end;
create table caozuo(
XueHao int(20) not null primary key,
LiWan varchar(255) character set utf8 collate utf8_general_ci,
FangTeJi varchar(255) character set utf8 collate utf8_general_ci);
create table cuntu(
XueHao int(20) not null primary key,
TuYi varchar(255) character set utf8 collate utf8_general_ci, 
TuEr varchar(255) character set utf8 collate utf8_general_ci);