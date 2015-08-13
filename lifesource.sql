-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.25


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema life_source
--

CREATE DATABASE IF NOT EXISTS life_source;
USE life_source;

--
-- Definition of table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `abid` int(10) unsigned NOT NULL,
  `adid` int(10) unsigned NOT NULL,
  `dbloodgroup` varchar(45) DEFAULT NULL,
  `date` date NOT NULL,
  `status` tinyint(1) NOT NULL,
  KEY `bibd` (`abid`) USING BTREE,
  KEY `dibd` (`adid`) USING BTREE,
  CONSTRAINT `abid` FOREIGN KEY (`abid`) REFERENCES `bloodbank` (`bid`),
  CONSTRAINT `adid` FOREIGN KEY (`adid`) REFERENCES `donor` (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='details of appointements by doner';

--
-- Dumping data for table `appointment`
--

/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;


--
-- Definition of table `bloodbank`
--

DROP TABLE IF EXISTS `bloodbank`;
CREATE TABLE `bloodbank` (
  `bid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `bname` varchar(45) NOT NULL,
  `bpwd` varchar(45) NOT NULL,
  `blocationx` double NOT NULL,
  `blocationy` double NOT NULL,
  `bcontact` char(10) NOT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodbank`
--

/*!40000 ALTER TABLE `bloodbank` DISABLE KEYS */;
/*!40000 ALTER TABLE `bloodbank` ENABLE KEYS */;


--
-- Definition of table `bloodstock`
--

DROP TABLE IF EXISTS `bloodstock`;
CREATE TABLE `bloodstock` (
  `bloodgroup` varchar(40) NOT NULL,
  `units` int(10) unsigned NOT NULL,
  `bid` int(10) unsigned NOT NULL,
  `did` int(10) unsigned NOT NULL,
  PRIMARY KEY (`bid`,`did`),
  KEY `did` (`did`),
  CONSTRAINT `bid` FOREIGN KEY (`bid`) REFERENCES `bloodbank` (`bid`),
  CONSTRAINT `did` FOREIGN KEY (`did`) REFERENCES `donor` (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='details of blood doneted at bloodbank';

--
-- Dumping data for table `bloodstock`
--

/*!40000 ALTER TABLE `bloodstock` DISABLE KEYS */;
/*!40000 ALTER TABLE `bloodstock` ENABLE KEYS */;


--
-- Definition of table `donor`
--

DROP TABLE IF EXISTS `donor`;
CREATE TABLE `donor` (
  `did` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `dname` varchar(45) NOT NULL,
  `dpwd` varchar(45) NOT NULL,
  `dlocationx` double NOT NULL,
  `dlocationy` double NOT NULL,
  `dbloodgroup` varchar(10) NOT NULL,
  `dage` int(10) unsigned NOT NULL,
  `dcontact` char(10) NOT NULL,
  `dgender` varchar(6) NOT NULL,
  `lastdonate` double DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `donor`
--

/*!40000 ALTER TABLE `donor` DISABLE KEYS */;
INSERT INTO `donor` (`did`,`dname`,`dpwd`,`dlocationx`,`dlocationy`,`dbloodgroup`,`dage`,`dcontact`,`dgender`,`lastdonate`) VALUES 
 (1,'abhinav','life',9632,9382,'B+',65,'9876543221','Male',NULL);
/*!40000 ALTER TABLE `donor` ENABLE KEYS */;


--
-- Definition of table `needy`
--

DROP TABLE IF EXISTS `needy`;
CREATE TABLE `needy` (
  `nid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nname` varchar(45) NOT NULL,
  `npwd` varchar(45) NOT NULL,
  `nlocationx` double NOT NULL,
  `nlocationy` double NOT NULL,
  `nbloodgroup` varchar(45) NOT NULL,
  `nage` int(10) unsigned NOT NULL,
  `ncontact` char(10) NOT NULL,
  `ngender` varchar(6) NOT NULL,
  PRIMARY KEY (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `needy`
--

/*!40000 ALTER TABLE `needy` DISABLE KEYS */;
/*!40000 ALTER TABLE `needy` ENABLE KEYS */;


--
-- Definition of table `request`
--

DROP TABLE IF EXISTS `request`;
CREATE TABLE `request` (
  `rid` int(10) unsigned NOT NULL,
  `nid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nbloodgroup` varchar(45) NOT NULL,
  `units` int(10) unsigned NOT NULL,
  `status` tinyint(1) NOT NULL,
  `nlocationx` double NOT NULL,
  `nlocationy` double NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `nid` (`nid`),
  CONSTRAINT `nid` FOREIGN KEY (`nid`) REFERENCES `needy` (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request`
--

/*!40000 ALTER TABLE `request` DISABLE KEYS */;
/*!40000 ALTER TABLE `request` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
