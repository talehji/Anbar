-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.13


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema anbar
--

CREATE DATABASE IF NOT EXISTS anbar;
USE anbar;

--
-- Definition of table `debitor`
--

DROP TABLE IF EXISTS `debitor`;
CREATE TABLE `debitor` (
  `idDebitor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idMembers` int(10) unsigned NOT NULL,
  `idKassa` int(10) unsigned NOT NULL,
  `idMembersAlan` int(10) unsigned NOT NULL,
  `DaxiliSenedNo` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `idMembersSenedYigan` int(10) unsigned NOT NULL,
  `idMembersTesdiqEden` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idDebitor`),
  KEY `FK_Debitor_1` (`idMembers`),
  KEY `FK_Debitor_2` (`idKassa`),
  KEY `FK_Debitor_3` (`idMembersAlan`),
  KEY `FK_Debitor_4` (`idMembersSenedYigan`),
  KEY `FK_Debitor_5` (`idMembersTesdiqEden`),
  CONSTRAINT `FK_Debitor_1` FOREIGN KEY (`idMembers`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_Debitor_2` FOREIGN KEY (`idKassa`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_Debitor_3` FOREIGN KEY (`idMembersAlan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_Debitor_4` FOREIGN KEY (`idMembersSenedYigan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_Debitor_5` FOREIGN KEY (`idMembersTesdiqEden`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `debitor`
--

/*!40000 ALTER TABLE `debitor` DISABLE KEYS */;
/*!40000 ALTER TABLE `debitor` ENABLE KEYS */;


--
-- Definition of table `kassa`
--

DROP TABLE IF EXISTS `kassa`;
CREATE TABLE `kassa` (
  `idKassa` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `Medaxil` double NOT NULL,
  `Mexaric` double NOT NULL,
  `PairentId` varchar(45) NOT NULL,
  `InsertId` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  PRIMARY KEY (`idKassa`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kassa`
--

/*!40000 ALTER TABLE `kassa` DISABLE KEYS */;
INSERT INTO `kassa` (`idKassa`,`Tarix`,`Medaxil`,`Mexaric`,`PairentId`,`InsertId`,`Qeyd`) VALUES 
 (1,'2016-11-21 16:09:23',0,10,'1','2','1'),
 (2,'2016-11-21 16:10:52',0,10,'1','2','1'),
 (3,'2016-11-21 16:09:23',0,10,'1','2','2'),
 (4,'2016-11-21 16:11:34',0,10,'1','3','1'),
 (5,'2016-11-21 16:11:34',0,10,'1','3','2'),
 (6,'2016-11-21 16:12:16',0,10,'1','1','1'),
 (7,'2016-11-21 16:12:16',0,10,'1','1','2');
/*!40000 ALTER TABLE `kassa` ENABLE KEYS */;


--
-- Definition of table `kreditor`
--

DROP TABLE IF EXISTS `kreditor`;
CREATE TABLE `kreditor` (
  `idKreditor` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idFirma` int(10) unsigned NOT NULL,
  `idKassa` int(10) unsigned NOT NULL,
  `idMembersOdeyen` int(10) unsigned NOT NULL,
  `DaxiliSenedNo` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `idMembersSenedYigan` int(10) unsigned NOT NULL,
  `idMembersTesdiqEden` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idKreditor`),
  KEY `FK_Kreditor_1` (`idFirma`),
  KEY `FK_Kreditor_2` (`idKassa`),
  KEY `FK_Kreditor_3` (`idMembersOdeyen`),
  KEY `FK_Kreditor_4` (`idMembersSenedYigan`),
  KEY `FK_Kreditor_5` (`idMembersTesdiqEden`),
  CONSTRAINT `FK_Kreditor_1` FOREIGN KEY (`idFirma`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_Kreditor_2` FOREIGN KEY (`idKassa`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_Kreditor_3` FOREIGN KEY (`idMembersOdeyen`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_Kreditor_4` FOREIGN KEY (`idMembersSenedYigan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_Kreditor_5` FOREIGN KEY (`idMembersTesdiqEden`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kreditor`
--

/*!40000 ALTER TABLE `kreditor` DISABLE KEYS */;
/*!40000 ALTER TABLE `kreditor` ENABLE KEYS */;


--
-- Definition of table `maganfir`
--

DROP TABLE IF EXISTS `maganfir`;
CREATE TABLE `maganfir` (
  `idMagAnFir` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Adi` varchar(45) NOT NULL,
  `Unvan` varchar(45) NOT NULL,
  `Telefon` varchar(45) NOT NULL,
  `idMembers` int(10) unsigned NOT NULL,
  `PairentId` varchar(45) NOT NULL,
  PRIMARY KEY (`idMagAnFir`) USING BTREE,
  KEY `FK_Anbar_1` (`idMembers`),
  CONSTRAINT `FK_maganfir_1` FOREIGN KEY (`idMembers`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `maganfir`
--

/*!40000 ALTER TABLE `maganfir` DISABLE KEYS */;
INSERT INTO `maganfir` (`idMagAnFir`,`Adi`,`Unvan`,`Telefon`,`idMembers`,`PairentId`) VALUES 
 (1,'sdfgvb','dfdgdfg','(012)-444-22-55',1,'2'),
 (2,'gfbfgb','Yasamal','(123)-123-12-31',1,'2'),
 (3,'gnvbnv','bnvbnvbn','(123)-123-12-31',1,'2'),
 (4,'dsxvxcv','xvcxv','(123)-123-12-31',1,'1'),
 (5,'sdfsdfsdf','ghjghjghj','(454)-545-45-45',1,'1'),
 (6,'sdfsd','fsdfsdfsdfs','(123)-123-12-31',1,'1'),
 (7,'Cahan','Gəncə','(024)-656-56-54',1,'2'),
 (8,'Cahan Holding','Gəncə','(024)-568-79-84',1,'3');
/*!40000 ALTER TABLE `maganfir` ENABLE KEYS */;


--
-- Definition of table `magazamubadile`
--

DROP TABLE IF EXISTS `magazamubadile`;
CREATE TABLE `magazamubadile` (
  `idMagazaMubadile` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idMallar` int(10) unsigned NOT NULL,
  `idMagazaVeren` int(10) unsigned NOT NULL,
  `idMagazaAlan` int(10) unsigned NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `Miqdari` varchar(45) NOT NULL,
  `idMembersVeren` int(10) unsigned NOT NULL,
  `idMembersAlan` int(10) unsigned NOT NULL,
  `DaxiliSenedNo` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `idMembersSenedYigan` int(10) unsigned NOT NULL,
  `idMembersTesdiqEden` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idMagazaMubadile`),
  KEY `FK_MagazaMubadile_1` (`idMallar`),
  KEY `FK_MagazaMubadile_2` (`idMagazaVeren`),
  KEY `FK_MagazaMubadile_3` (`idMagazaAlan`),
  KEY `FK_MagazaMubadile_4` (`idProperties`),
  KEY `FK_MagazaMubadile_5` (`idMembersVeren`),
  KEY `FK_MagazaMubadile_6` (`idMembersAlan`),
  KEY `FK_MagazaMubadile_7` (`idMembersSenedYigan`),
  KEY `FK_MagazaMubadile_8` (`idMembersTesdiqEden`),
  CONSTRAINT `FK_MagazaMubadile_1` FOREIGN KEY (`idMallar`) REFERENCES `mallar` (`idMallar`),
  CONSTRAINT `FK_MagazaMubadile_2` FOREIGN KEY (`idMagazaVeren`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_MagazaMubadile_3` FOREIGN KEY (`idMagazaAlan`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_MagazaMubadile_4` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`),
  CONSTRAINT `FK_MagazaMubadile_5` FOREIGN KEY (`idMembersVeren`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_MagazaMubadile_6` FOREIGN KEY (`idMembersAlan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_MagazaMubadile_7` FOREIGN KEY (`idMembersSenedYigan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_MagazaMubadile_8` FOREIGN KEY (`idMembersTesdiqEden`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `magazamubadile`
--

/*!40000 ALTER TABLE `magazamubadile` DISABLE KEYS */;
/*!40000 ALTER TABLE `magazamubadile` ENABLE KEYS */;


--
-- Definition of table `mainproperties`
--

DROP TABLE IF EXISTS `mainproperties`;
CREATE TABLE `mainproperties` (
  `idMainProperties` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idMainProperties`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mainproperties`
--

/*!40000 ALTER TABLE `mainproperties` DISABLE KEYS */;
INSERT INTO `mainproperties` (`idMainProperties`,`Name`) VALUES 
 (1,'Işçilər'),
 (2,'Kutlə'),
 (3,'Uzunluq'),
 (4,'Diametr');
/*!40000 ALTER TABLE `mainproperties` ENABLE KEYS */;


--
-- Definition of table `malalisqeyiqayt`
--

DROP TABLE IF EXISTS `malalisqeyiqayt`;
CREATE TABLE `malalisqeyiqayt` (
  `idMalAlisQeyiQayt` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idFirma` int(10) unsigned NOT NULL,
  `idMallar` int(10) unsigned NOT NULL,
  `idAnbar` int(10) unsigned NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `Miqdari` varchar(45) NOT NULL,
  `AlisQiymeti` double NOT NULL,
  `EDV` double NOT NULL,
  `idKassaAlisQIyCem` int(10) unsigned NOT NULL,
  `idKassaCemEDV` int(10) unsigned NOT NULL,
  `idMembersQebul` int(10) unsigned NOT NULL,
  `InvoysNo` varchar(45) NOT NULL,
  `idMembersSenedYigan` int(10) unsigned NOT NULL,
  `idMembersTesdiqEden` int(10) unsigned NOT NULL,
  `Pairentid` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idMalAlisQeyiQayt`) USING BTREE,
  KEY `FK_malalis_1` (`idFirma`),
  KEY `FK_malalis_2` (`idMallar`),
  KEY `FK_malalis_3` (`idAnbar`),
  KEY `FK_malalis_4` (`idProperties`),
  KEY `FK_malalis_5` (`idKassaAlisQIyCem`),
  KEY `FK_malalis_6` (`idKassaCemEDV`),
  KEY `FK_malalis_7` (`idMembersQebul`),
  KEY `FK_malalis_8` (`idMembersSenedYigan`),
  KEY `FK_malalis_9` (`idMembersTesdiqEden`),
  CONSTRAINT `FK_malalisqeyiqayt_1` FOREIGN KEY (`idFirma`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_malalisqeyiqayt_2` FOREIGN KEY (`idMallar`) REFERENCES `mallar` (`idMallar`),
  CONSTRAINT `FK_malalisqeyiqayt_3` FOREIGN KEY (`idAnbar`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_malalisqeyiqayt_4` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`),
  CONSTRAINT `FK_malalisqeyiqayt_5` FOREIGN KEY (`idKassaAlisQIyCem`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_malalisqeyiqayt_6` FOREIGN KEY (`idKassaCemEDV`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_malalisqeyiqayt_7` FOREIGN KEY (`idMembersQebul`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_malalisqeyiqayt_8` FOREIGN KEY (`idMembersSenedYigan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_malalisqeyiqayt_9` FOREIGN KEY (`idMembersTesdiqEden`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `malalisqeyiqayt`
--

/*!40000 ALTER TABLE `malalisqeyiqayt` DISABLE KEYS */;
INSERT INTO `malalisqeyiqayt` (`idMalAlisQeyiQayt`,`Tarix`,`idFirma`,`idMallar`,`idAnbar`,`idProperties`,`Miqdari`,`AlisQiymeti`,`EDV`,`idKassaAlisQIyCem`,`idKassaCemEDV`,`idMembersQebul`,`InvoysNo`,`idMembersSenedYigan`,`idMembersTesdiqEden`,`Pairentid`) VALUES 
 (1,'2016-11-21 16:12:16',8,1,4,4,'10',10,10,6,7,1,'10',1,1,1);
/*!40000 ALTER TABLE `malalisqeyiqayt` ENABLE KEYS */;


--
-- Definition of table `mallar`
--

DROP TABLE IF EXISTS `mallar`;
CREATE TABLE `mallar` (
  `idMallar` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Adi` varchar(45) NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `StrixKod` varchar(45) NOT NULL,
  `idMalNovu` int(10) unsigned NOT NULL,
  `Miqdari` varchar(45) NOT NULL,
  PRIMARY KEY (`idMallar`),
  KEY `FK_mallar_1` (`idMalNovu`),
  KEY `FK_mallar_2` (`idProperties`),
  CONSTRAINT `FK_mallar_1` FOREIGN KEY (`idMalNovu`) REFERENCES `malnovu` (`idMalNovu`),
  CONSTRAINT `FK_mallar_2` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mallar`
--

/*!40000 ALTER TABLE `mallar` DISABLE KEYS */;
INSERT INTO `mallar` (`idMallar`,`Adi`,`idProperties`,`StrixKod`,`idMalNovu`,`Miqdari`) VALUES 
 (1,'Unitaz',9,'123456789',5,'0.70'),
 (2,'Lampa',1,'1434753783',2,'30'),
 (3,'',9,'',2,'');
/*!40000 ALTER TABLE `mallar` ENABLE KEYS */;


--
-- Definition of table `malnovu`
--

DROP TABLE IF EXISTS `malnovu`;
CREATE TABLE `malnovu` (
  `idMalNovu` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idMalQrupu` int(10) unsigned NOT NULL,
  `Adi` varchar(45) NOT NULL,
  PRIMARY KEY (`idMalNovu`),
  KEY `FK_MalNovu_1` (`idMalQrupu`),
  CONSTRAINT `FK_MalNovu_1` FOREIGN KEY (`idMalQrupu`) REFERENCES `malqrupu` (`idMalQrupu`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `malnovu`
--

/*!40000 ALTER TABLE `malnovu` DISABLE KEYS */;
INSERT INTO `malnovu` (`idMalNovu`,`idMalQrupu`,`Adi`) VALUES 
 (1,3,'Ayak'),
 (2,1,'Goknur'),
 (3,3,'Firat'),
 (4,3,'Metas'),
 (5,5,'Şüşə');
/*!40000 ALTER TABLE `malnovu` ENABLE KEYS */;


--
-- Definition of table `malqrupu`
--

DROP TABLE IF EXISTS `malqrupu`;
CREATE TABLE `malqrupu` (
  `idMalQrupu` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `idMalSinfi` int(10) unsigned NOT NULL,
  `Adi` varchar(45) NOT NULL,
  PRIMARY KEY (`idMalQrupu`),
  KEY `FK_malqrupu_1` (`idMalSinfi`),
  CONSTRAINT `FK_malqrupu_1` FOREIGN KEY (`idMalSinfi`) REFERENCES `malsinfi` (`idMalSinfi`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `malqrupu`
--

/*!40000 ALTER TABLE `malqrupu` DISABLE KEYS */;
INSERT INTO `malqrupu` (`idMalQrupu`,`idMalSinfi`,`Adi`) VALUES 
 (1,1,'Naqillər'),
 (2,1,'Kabellər'),
 (3,2,'Borular'),
 (4,3,'Kombi'),
 (5,2,'Unitaz');
/*!40000 ALTER TABLE `malqrupu` ENABLE KEYS */;


--
-- Definition of table `malsatisgeriqay`
--

DROP TABLE IF EXISTS `malsatisgeriqay`;
CREATE TABLE `malsatisgeriqay` (
  `idMalSatisGeriQay` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idMagaza` int(10) unsigned NOT NULL,
  `idMallar` int(10) unsigned NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `Miqdari` varchar(45) NOT NULL,
  `SatisQiymeti` varchar(45) NOT NULL,
  `EDV` varchar(45) NOT NULL,
  `IdKassaSatis` int(10) unsigned NOT NULL,
  `idKassaEDV` int(10) unsigned NOT NULL,
  `idMembersSatanAlan` int(10) unsigned NOT NULL,
  `QaimeNo` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `IdMembesSenedYigan` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idMalSatisGeriQay`),
  KEY `FK_malsatisgeriqay_1` (`idMagaza`),
  KEY `FK_malsatisgeriqay_2` (`idMallar`),
  KEY `FK_malsatisgeriqay_3` (`idProperties`),
  KEY `FK_malsatisgeriqay_4` (`IdKassaSatis`),
  KEY `FK_malsatisgeriqay_5` (`idKassaEDV`),
  KEY `FK_malsatisgeriqay_6` (`idMembersSatanAlan`),
  KEY `FK_malsatisgeriqay_7` (`IdMembesSenedYigan`),
  CONSTRAINT `FK_malsatisgeriqay_1` FOREIGN KEY (`idMagaza`) REFERENCES `maganfir` (`idMagAnFir`),
  CONSTRAINT `FK_malsatisgeriqay_2` FOREIGN KEY (`idMallar`) REFERENCES `mallar` (`idMallar`),
  CONSTRAINT `FK_malsatisgeriqay_3` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`),
  CONSTRAINT `FK_malsatisgeriqay_4` FOREIGN KEY (`IdKassaSatis`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_malsatisgeriqay_5` FOREIGN KEY (`idKassaEDV`) REFERENCES `kassa` (`idKassa`),
  CONSTRAINT `FK_malsatisgeriqay_6` FOREIGN KEY (`idMembersSatanAlan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_malsatisgeriqay_7` FOREIGN KEY (`IdMembesSenedYigan`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `malsatisgeriqay`
--

/*!40000 ALTER TABLE `malsatisgeriqay` DISABLE KEYS */;
/*!40000 ALTER TABLE `malsatisgeriqay` ENABLE KEYS */;


--
-- Definition of table `malsinfi`
--

DROP TABLE IF EXISTS `malsinfi`;
CREATE TABLE `malsinfi` (
  `idMalSinfi` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Adi` varchar(45) NOT NULL,
  PRIMARY KEY (`idMalSinfi`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `malsinfi`
--

/*!40000 ALTER TABLE `malsinfi` DISABLE KEYS */;
INSERT INTO `malsinfi` (`idMalSinfi`,`Adi`) VALUES 
 (1,'Elektrik Mallar'),
 (2,'Santexnika Malları'),
 (3,'Avadanlıqlar');
/*!40000 ALTER TABLE `malsinfi` ENABLE KEYS */;


--
-- Definition of table `members`
--

DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `idMembers` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Adi` varchar(45) NOT NULL,
  `Soyadi` varchar(45) NOT NULL,
  `SexsNo` varchar(45) NOT NULL,
  `Telefon` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `isActive` varchar(45) NOT NULL,
  `Tarix` datetime NOT NULL,
  PRIMARY KEY (`idMembers`),
  KEY `FK_Members_1` (`idProperties`),
  CONSTRAINT `FK_Members_1` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `members`
--

/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` (`idMembers`,`Adi`,`Soyadi`,`SexsNo`,`Telefon`,`Qeyd`,`idProperties`,`isActive`,`Tarix`) VALUES 
 (1,'Taleh','Rzayev','07541254','(051)-356-32-76','Müdir',1,'1','2016-11-16 12:53:06'),
 (2,'sadc','asdsad','sdcsdcsdc','(123)-123-12-31','fgbfgb',5,'1','2016-11-17 22:54:27'),
 (3,'sdcss','sdcsdcsdc','sdcsdcsdc','(123)-123-12-31','',1,'1','2016-11-16 15:24:55');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;


--
-- Definition of table `properties`
--

DROP TABLE IF EXISTS `properties`;
CREATE TABLE `properties` (
  `idProperties` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Adi` varchar(45) NOT NULL,
  `PairentId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idProperties`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `properties`
--

/*!40000 ALTER TABLE `properties` DISABLE KEYS */;
INSERT INTO `properties` (`idProperties`,`Adi`,`PairentId`) VALUES 
 (1,'Administrator',1),
 (2,'Mühasib',1),
 (3,'Satıcı',1),
 (4,'Kq',2),
 (5,'İşçilər',1),
 (6,'Mühasib',1),
 (7,'Qr',2),
 (8,'Ton',2),
 (9,'m',2),
 (10,'km',2),
 (11,'kub metr',2);
/*!40000 ALTER TABLE `properties` ENABLE KEYS */;


--
-- Definition of table `zayitmis`
--

DROP TABLE IF EXISTS `zayitmis`;
CREATE TABLE `zayitmis` (
  `idZayItmis` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Tarix` datetime NOT NULL,
  `idMallar` int(10) unsigned NOT NULL,
  `idProperties` int(10) unsigned NOT NULL,
  `Miqdari` varchar(45) NOT NULL,
  `DaxiliSenedNo` varchar(45) NOT NULL,
  `Qeyd` varchar(45) NOT NULL,
  `idMembersSenedYigan` int(10) unsigned NOT NULL,
  `idMembersTesdiqEden` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idZayItmis`),
  KEY `FK_ZayItmis_1` (`idMallar`),
  KEY `FK_ZayItmis_2` (`idProperties`),
  KEY `FK_ZayItmis_3` (`idMembersSenedYigan`),
  KEY `FK_ZayItmis_4` (`idMembersTesdiqEden`),
  CONSTRAINT `FK_ZayItmis_1` FOREIGN KEY (`idMallar`) REFERENCES `mallar` (`idMallar`),
  CONSTRAINT `FK_ZayItmis_2` FOREIGN KEY (`idProperties`) REFERENCES `properties` (`idProperties`),
  CONSTRAINT `FK_ZayItmis_3` FOREIGN KEY (`idMembersSenedYigan`) REFERENCES `members` (`idMembers`),
  CONSTRAINT `FK_ZayItmis_4` FOREIGN KEY (`idMembersTesdiqEden`) REFERENCES `members` (`idMembers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `zayitmis`
--

/*!40000 ALTER TABLE `zayitmis` DISABLE KEYS */;
/*!40000 ALTER TABLE `zayitmis` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
