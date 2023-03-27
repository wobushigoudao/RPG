/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.7.28-log : Database - shujuku
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`shujuku` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `shujuku`;

/*Table structure for table `biao` */

DROP TABLE IF EXISTS `biao`;

CREATE TABLE `biao` (
  `XueHao` int(20) NOT NULL,
  `MiMa` int(20) NOT NULL,
  `XingMing` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `DengJi` int(20) DEFAULT NULL,
  `XueLiang` int(20) DEFAULT NULL,
  `GongJi` int(20) DEFAULT NULL,
  `FangYu` int(20) DEFAULT NULL,
  `SuDu` int(20) DEFAULT NULL,
  `JinQian` int(20) DEFAULT NULL,
  `JingYan` int(20) DEFAULT NULL,
  `ShiFou` int(20) DEFAULT NULL,
  `XueLiangMax` int(20) DEFAULT NULL,
  `JingYanMax` int(20) DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `biao` */

insert  into `biao`(`XueHao`,`MiMa`,`XingMing`,`DengJi`,`XueLiang`,`GongJi`,`FangYu`,`SuDu`,`JinQian`,`JingYan`,`ShiFou`,`XueLiangMax`,`JingYanMax`) values 
(33,33,'张三',1,8,7,12,6,0,0,1,84,100),
(55,55,'张三',1,99,12,12,1,0,0,1,99,200),
(1925123516,123456,'换行',1,95,1300,6,3,16,14,2,95,200),
(1925123522,123456,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL);

/*Table structure for table `caozuo` */

DROP TABLE IF EXISTS `caozuo`;

CREATE TABLE `caozuo` (
  `XueHao` int(20) NOT NULL,
  `LiWan` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `FangTeJi` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `caozuo` */

insert  into `caozuo`(`XueHao`,`LiWan`,`FangTeJi`) values 
(33,'2','2'),
(55,'2','2'),
(1925123516,'2','2');

/*Table structure for table `cuntu` */

DROP TABLE IF EXISTS `cuntu`;

CREATE TABLE `cuntu` (
  `XueHao` int(20) NOT NULL,
  `TuYi` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `TuEr` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cuntu` */

insert  into `cuntu`(`XueHao`,`TuYi`,`TuEr`) values 
(33,'yingxiong','dacaoyuan/帕奇'),
(55,'yingxiong','miwusenlin/弓箭野猪'),
(1925123516,'yingxiong','miwusenlin/巨人');

/*Table structure for table `daozhuang` */

DROP TABLE IF EXISTS `daozhuang`;

CREATE TABLE `daozhuang` (
  `XueHao` int(20) NOT NULL,
  `DaoJu` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `ZhuangBei` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MiWuSenLin` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `DaCaoYuan` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MoWangChengBao` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `WuQi` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `FangJu` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `daozhuang` */

insert  into `daozhuang`(`XueHao`,`DaoJu`,`ZhuangBei`,`MiWuSenLin`,`DaCaoYuan`,`MoWangChengBao`,`WuQi`,`FangJu`) values 
(33,NULL,NULL,'0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，',NULL,NULL),
(55,NULL,NULL,'0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，',NULL,NULL),
(1925123516,NULL,NULL,'0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，','0，0，0，0，0，0，0，0，0，0，',NULL,NULL);

/*Table structure for table `guaiwubiao` */

DROP TABLE IF EXISTS `guaiwubiao`;

CREATE TABLE `guaiwubiao` (
  `ID` int(20) NOT NULL,
  `XingMing` varchar(20) CHARACTER SET utf8 NOT NULL,
  `XueLiang` int(20) NOT NULL,
  `GongJi` int(20) NOT NULL,
  `FangYu` int(20) NOT NULL,
  `SuDu` int(20) NOT NULL,
  `JinQian` int(20) NOT NULL,
  `JingYan` int(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `guaiwubiao` */

insert  into `guaiwubiao`(`ID`,`XingMing`,`XueLiang`,`GongJi`,`FangYu`,`SuDu`,`JinQian`,`JingYan`) values 
(1,'哥布林',50,7,3,5,8,3),
(2,'史莱姆',30,5,1,2,4,1),
(3,'巨人',70,9,4,1,10,10),
(4,'弓箭野猪',45,6,5,5,8,9),
(5,'宝箱怪',10,1,25,1,30,30),
(6,'骑士',65,10,8,8,12,15),
(7,'猎手',55,7,4,7,8,3),
(8,'小魔物',44,7,3,2,5,3),
(9,'魔法师',20,20,1,1,10,10),
(10,'帕奇',100,20,15,1,20,20),
(11,'魔王的小兵',40,6,7,9,8,13),
(12,'嘿嘿怪',77,7,7,7,7,7),
(13,'闯荡者',150,20,10,10,40,40),
(14,'蜥蜴王',200,30,20,4,80,80),
(15,'黑商',250,50,36,1,130,130),
(16,'象精',300,70,40,4,200,200),
(17,'魔王',1000,100,100,100,1000,1000),
(333,'和',1,1,1,1,1,1),
(444,'乳房',1,1,1,1,1,1),
(3333,'得到',1,1,1,1,1,1);

/*Table structure for table `luren` */

DROP TABLE IF EXISTS `luren`;

CREATE TABLE `luren` (
  `XueHao` int(20) NOT NULL,
  `MiWuSenLin` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `DaCaoYuan` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `MoWangChengBao` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `luren` */

insert  into `luren`(`XueHao`,`MiWuSenLin`,`DaCaoYuan`,`MoWangChengBao`) values 
(33,NULL,NULL,NULL),
(55,NULL,NULL,NULL),
(1925123516,NULL,NULL,NULL);

/*Table structure for table `shuxingzuida` */

DROP TABLE IF EXISTS `shuxingzuida`;

CREATE TABLE `shuxingzuida` (
  `XueHao` int(20) NOT NULL,
  `XueLiangMax` int(20) DEFAULT NULL,
  `GongJiMax` int(20) DEFAULT NULL,
  `FangYuMax` int(20) DEFAULT NULL,
  `SuDuMax` int(20) DEFAULT NULL,
  PRIMARY KEY (`XueHao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `shuxingzuida` */

insert  into `shuxingzuida`(`XueHao`,`XueLiangMax`,`GongJiMax`,`FangYuMax`,`SuDuMax`) values 
(33,84,7,12,6),
(55,99,12,12,1),
(1925123516,95,13,6,3);

/* Trigger structure for table `biao` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `biaochufaqi1` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `biaochufaqi1` BEFORE INSERT ON `biao` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `biao` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `biaochufaqi2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `biaochufaqi2` BEFORE UPDATE ON `biao` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `daozhuang` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `daozhuangchufaqi1` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `daozhuangchufaqi1` BEFORE INSERT ON `daozhuang` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `daozhuang` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `daozhuangchufaqi2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `daozhuangchufaqi2` BEFORE UPDATE ON `daozhuang` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `guaiwubiao` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `guaiwubiaochufaqi1` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `guaiwubiaochufaqi1` BEFORE INSERT ON `guaiwubiao` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `guaiwubiao` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `guaiwubiaochufaqi2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `guaiwubiaochufaqi2` BEFORE UPDATE ON `guaiwubiao` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `luren` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `lurenchufaqi1` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `lurenchufaqi1` BEFORE INSERT ON `luren` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `luren` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `lurenchufaqi2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `lurenchufaqi2` BEFORE UPDATE ON `luren` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `shuxingzuida` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `shuxingzuidachufaqi1` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `shuxingzuidachufaqi1` BEFORE INSERT ON `shuxingzuida` FOR EACH ROW 
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
end */$$


DELIMITER ;

/* Trigger structure for table `shuxingzuida` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `shuxingzuidachufaqi2` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `shuxingzuidachufaqi2` BEFORE UPDATE ON `shuxingzuida` FOR EACH ROW 
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
end */$$


DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
