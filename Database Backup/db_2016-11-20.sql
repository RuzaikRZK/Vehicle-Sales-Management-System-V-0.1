-- MySQL dump 10.10
--
-- Host: localhost    Database: sad_viva
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `sad_viva`
--

/*!40000 DROP DATABASE IF EXISTS `sad_viva`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `sad_viva` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sad_viva`;

--
-- Table structure for table `add_brand`
--

DROP TABLE IF EXISTS `add_brand`;
CREATE TABLE `add_brand` (
  `brand_id` int(20) NOT NULL auto_increment,
  `brand_name` varchar(20) default NULL,
  PRIMARY KEY  (`brand_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `add_brand`
--


/*!40000 ALTER TABLE `add_brand` DISABLE KEYS */;
LOCK TABLES `add_brand` WRITE;
INSERT INTO `add_brand` VALUES (4,'Alfa Romeo'),(6,'Toyota'),(7,'Lambogini'),(8,'Audi'),(9,'Mitshubishi'),(10,'suzuki'),(11,'Micro'),(12,'wueqwueo'),(13,'qwe'),(14,'ruzaik'),(15,'e'),(16,'pakaya'),(17,'hutta'),(18,'ponnaya'),(19,'kariya'),(20,'t'),(21,'y'),(22,'z'),(23,'ws'),(24,'gfgfghf'),(25,'12'),(26,'56'),(27,'077'),(28,'1'),(29,'soma'),(30,'Bawa'),(31,'roya;l');
UNLOCK TABLES;
/*!40000 ALTER TABLE `add_brand` ENABLE KEYS */;

--
-- Table structure for table `add_model`
--

DROP TABLE IF EXISTS `add_model`;
CREATE TABLE `add_model` (
  `model_id` int(20) NOT NULL auto_increment,
  `brand_name` varchar(20) default NULL,
  `model_name` varchar(20) default NULL,
  PRIMARY KEY  (`model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `add_model`
--


/*!40000 ALTER TABLE `add_model` DISABLE KEYS */;
LOCK TABLES `add_model` WRITE;
INSERT INTO `add_model` VALUES (2,'Toyota','Aqua S grade'),(3,'Toyota','Aqua S grade'),(4,'Lambogini','Galardo'),(5,'Audi','A8'),(6,'Alfa Romeo','Alfa Rmeo a6');
UNLOCK TABLES;
/*!40000 ALTER TABLE `add_model` ENABLE KEYS */;

--
-- Table structure for table `business_summery`
--

DROP TABLE IF EXISTS `business_summery`;
CREATE TABLE `business_summery` (
  `sum_id` int(11) NOT NULL,
  `vehicle_selling_id` varchar(45) NOT NULL,
  `price` double default NULL,
  `selling_price` double default NULL,
  `description` varchar(45) default NULL,
  `selling_date` varchar(45) default NULL,
  PRIMARY KEY  (`sum_id`),
  KEY `fk_business_summery_vehicles_selling1_idx` (`vehicle_selling_id`),
  CONSTRAINT `fk_business_summery_vehicles_selling1` FOREIGN KEY (`vehicle_selling_id`) REFERENCES `vehicles_selling` (`vehicle_selling_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `business_summery`
--


/*!40000 ALTER TABLE `business_summery` DISABLE KEYS */;
LOCK TABLES `business_summery` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `business_summery` ENABLE KEYS */;

--
-- Table structure for table `diary`
--

DROP TABLE IF EXISTS `diary`;
CREATE TABLE `diary` (
  `id` int(100) NOT NULL auto_increment,
  `description` varchar(450) default NULL,
  `date` varchar(45) default NULL,
  `time` varchar(45) default '',
  `saved_date` varchar(45) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `diary`
--


/*!40000 ALTER TABLE `diary` DISABLE KEYS */;
LOCK TABLES `diary` WRITE;
INSERT INTO `diary` VALUES (29,'Ada VIva Trail eka Bng ','Nov 12, 2016','09:51:49 AM','2016-11-01'),(30,'Aye 7 wenida Viva Eka BNG','Nov 12, 2016','09:53:41 AM','2016-11-12'),(31,'Heta Class Na','Nov 8, 2016','09:54:03 AM','2016-11-12'),(32,'Ai Gemada','Nov 1, 2016','10:03:08 AM','2016-11-12'),(33,'heta class','Nov 8, 2016','11:23:31 AM','2016-11-12'),(34,'Hutta','Nov 20, 2016','10:54:50 AM','2016-11-19'),(35,'heta Niwadu','Nov 20, 2016','11:15:06 AM','2016-11-20'),(36,'hgdghfhf','Nov 20, 2016','11:16:57 AM','2016-11-20'),(37,'','','01:15:21 PM','2016-11-20'),(38,'','','01:15:21 PM','2016-11-20'),(39,'hetgsdhghsagd','Nov 22, 2016','10:53:36 AM','2016-11-21');
UNLOCK TABLES;
/*!40000 ALTER TABLE `diary` ENABLE KEYS */;

--
-- Table structure for table `exhange`
--

DROP TABLE IF EXISTS `exhange`;
CREATE TABLE `exhange` (
  `exchangevehicle_id` int(100) NOT NULL auto_increment,
  `vehicle_type` varchar(100) default NULL,
  `registerd_number` varchar(100) default NULL,
  `chassis_number` varchar(100) default NULL,
  `brand_name` varchar(100) default NULL,
  `model` varchar(100) default NULL,
  `model_year` varchar(100) default NULL,
  `condition` varchar(100) default NULL,
  `engine_type` varchar(100) default NULL,
  `transmission` varchar(100) default NULL,
  `price` double(100,0) default NULL,
  `millage` double(100,0) default NULL,
  `vehicle_type_c` varchar(100) default NULL,
  `registerd_number_c` varchar(100) default NULL,
  `chassis_number_c` varchar(100) default NULL,
  `brand_name_c` varchar(100) default NULL,
  `model_c` varchar(100) default NULL,
  `model_year_c` varchar(100) default NULL,
  `condition_c` varchar(100) default NULL,
  `engine_type_c` varchar(100) default NULL,
  `transmission_c` varchar(100) default NULL,
  `price_c` double(100,0) default NULL,
  `millage_c` double(100,0) default NULL,
  `image2` longtext,
  PRIMARY KEY  (`exchangevehicle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `exhange`
--


/*!40000 ALTER TABLE `exhange` DISABLE KEYS */;
LOCK TABLES `exhange` WRITE;
INSERT INTO `exhange` VALUES (5,'Van','5','7','Mazda','Bongo','Oct 5, 2016','Used','Hybrid','Manual',120000,124545,'Car','546','456456','Toyota','Aqua S grade','Nov 7, 2016','Used','Electrical','Manual',54645,56456,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/51.jpg');
UNLOCK TABLES;
/*!40000 ALTER TABLE `exhange` ENABLE KEYS */;

--
-- Table structure for table `imported_vehicles`
--

DROP TABLE IF EXISTS `imported_vehicles`;
CREATE TABLE `imported_vehicles` (
  `imp_chassis_number` varchar(50) NOT NULL,
  `vehicle_type` longtext,
  `brand` varchar(50) default NULL,
  `model` varchar(50) default NULL,
  `model_year` longtext,
  `condition` varchar(45) default NULL,
  `engine_type` varchar(45) default NULL,
  `transmission` varchar(45) default NULL,
  `price` double default NULL,
  `millage` int(11) default NULL,
  `image` varchar(450) default NULL,
  PRIMARY KEY  (`imp_chassis_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `imported_vehicles`
--


/*!40000 ALTER TABLE `imported_vehicles` DISABLE KEYS */;
LOCK TABLES `imported_vehicles` WRITE;
INSERT INTO `imported_vehicles` VALUES ('1','Bus','Lambogini','Galardo','Nov 14, 2016','Reconditioned','Electrical','Manual',3123,123123,''),('2','Bus','Lambogini','Galardo','Nov 14, 2016','Reconditioned','Electrical','Manual',3123,123123,'C:/Users/Inspiron 15/Pictures/my photos/2015-12-27-09-20-54-219.jpg'),('5435','Car','Toyota','Aqua S grade','Nov 7, 2016','Brand New','Electrical','Manual',345435,43535,''),('544565656','Heavy-Duty Vehicles','Lambogini','Galardo','Nov 14, 2016','Used','Hybrid','Manual',4234,234234,''),('5675676','Van','Toyota','Aqua S grade','Nov 15, 2016','Select Condition','Hybrid','Manual',43535,345345,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/184.jpg');
UNLOCK TABLES;
/*!40000 ALTER TABLE `imported_vehicles` ENABLE KEYS */;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `user_id` int(45) NOT NULL auto_increment,
  `user_type` longtext,
  `user_name` varchar(30) default NULL,
  `password` longtext,
  `email` longtext,
  `mobile_number` varchar(50) default NULL,
  `nic_number` varchar(50) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--


/*!40000 ALTER TABLE `login` DISABLE KEYS */;
LOCK TABLES `login` WRITE;
INSERT INTO `login` VALUES (1,'Admin','ruzaik','123','mohomadruzaik@gmail.com','0770685491','963200790V');
UNLOCK TABLES;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;

--
-- Table structure for table `registerd_vehicles`
--

DROP TABLE IF EXISTS `registerd_vehicles`;
CREATE TABLE `registerd_vehicles` (
  `vehicle_type` varchar(50) default NULL,
  `reg_registerd_number` varchar(45) NOT NULL,
  `reg_chassis_number` varchar(45) default NULL,
  `brand` varchar(45) default NULL,
  `model` varchar(45) default NULL,
  `model_year` varchar(45) default NULL,
  `condition` varchar(45) default NULL,
  `engine_type` varchar(45) default NULL,
  `transmission` varchar(45) default NULL,
  `price` double default NULL,
  `millage` int(11) default NULL,
  `image` varchar(450) default NULL,
  PRIMARY KEY  (`reg_registerd_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `registerd_vehicles`
--


/*!40000 ALTER TABLE `registerd_vehicles` DISABLE KEYS */;
LOCK TABLES `registerd_vehicles` WRITE;
INSERT INTO `registerd_vehicles` VALUES ('Bus','10','133','Micro','Micro big ','Oct 3, 2016','Brand New','Hybrid','Manual',12,12,''),('Car','12567V','121313v','Audi','A8','Oct 10, 2016','Brand New','Hybrid','Manual',1000000,1000,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/HD Wallpaper Pack [101] [Exclusive]/[CooL GuY] {{a2zRG}} (4).jpg'),('Car','3424234','234234','Audi','A8','Oct 10, 2016','Brand New','Select Engine Type','Automatic',234234,2342344,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/HD Wallpaper Pack [101] [Exclusive]/[CooL GuY] {{a2zRG}} (4).jpg'),('Van','5','7','Mazda','Bongo','Oct 5, 2016','Used','Hybrid','Manual',120000,124545,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/2.jpg'),('Car','546456','64564','Ford','Mustan GT','Oct 4, 2016','Brand New','Hybrid','Manual',2342,23424,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/5.jpg'),('Van','67567','567567','Toyota','Super GL L 200','Oct 4, 2016','Brand New','Electrical','Manual',435345,345345,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/23.jpg'),('Van','asd','dasdasd','Toyota','Super GL L 200','Oct 2, 2016','Used','Hybrid','Manual',535,435345,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/HD Wallpapers/[CooL GuY] {{a2zRG}} (8).jpg');
UNLOCK TABLES;
/*!40000 ALTER TABLE `registerd_vehicles` ENABLE KEYS */;

--
-- Table structure for table `unregisterd_vehicles`
--

DROP TABLE IF EXISTS `unregisterd_vehicles`;
CREATE TABLE `unregisterd_vehicles` (
  `vehicle_type` varchar(255) default NULL,
  `un_chassis_number` varchar(45) NOT NULL,
  `brand` varchar(45) default NULL,
  `model` varchar(45) default NULL,
  `model_year` varchar(45) default NULL,
  `condition` varchar(45) default NULL,
  `engine_type` varchar(45) default NULL,
  `transmission` varchar(45) default NULL,
  `price` double(20,0) default NULL,
  `millage` int(20) default NULL,
  `image` varchar(450) default NULL,
  PRIMARY KEY  (`un_chassis_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `unregisterd_vehicles`
--


/*!40000 ALTER TABLE `unregisterd_vehicles` DISABLE KEYS */;
LOCK TABLES `unregisterd_vehicles` WRITE;
INSERT INTO `unregisterd_vehicles` VALUES ('Van','1000','Mazda','Bongo','Oct 27, 2016','Used','Hybrid','Manual',1000,100,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/22.jpg'),('Bus','103','Isuzu','Isuzu tr','Oct 27, 2016','Used','Hybrid','Manual',103,14,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/58.jpg'),('Heavy-Duty Vehicles','13','Isuzu','Isuzu Canter','Oct 4, 2016','Used','Hybrid','Manual',13,14,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/63.jpg'),('Van','4234324','Toyota','Super GL L 200','Oct 11, 2016','Used','Hybrid','Manual',4234324,234324,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/47.jpg'),('Bus','5345','Toyota','Aqua S grade','Nov 15, 2016','Used','Hybrid','Manual',5345345,35345345,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/Sport Cars Wallpapers/60.jpg'),('Select Vehicle Type','64646','Toyota','Aqua S grade','Nov 14, 2016','Brand New','Hybrid','Automatic',456456,45645,'C:/Users/Inspiron 15/Pictures/HD computer wall papers/HD Wallpapers/[CooL GuY] {{a2zRG}} (10).jpg'),('Bus','wwe','Toyota','Aqua S grade','Nov 15, 2016','Used','Electrical','Manual',43534,345345,'');
UNLOCK TABLES;
/*!40000 ALTER TABLE `unregisterd_vehicles` ENABLE KEYS */;

--
-- Table structure for table `vehicles_selling`
--

DROP TABLE IF EXISTS `vehicles_selling`;
CREATE TABLE `vehicles_selling` (
  `vehicle_selling_id` varchar(45) NOT NULL default '',
  `chassi_number` varchar(45) default NULL,
  `register_number` varchar(45) default NULL,
  `vehicle_type` varchar(45) default NULL,
  `brand_name` double default NULL,
  `model` double default NULL,
  `model_year` varchar(45) default NULL,
  `condition` varchar(45) default NULL,
  `engine_type` varchar(450) default NULL,
  `transemission` varchar(10) default NULL,
  `price` double(100,0) default NULL,
  `millage` double(100,0) default NULL,
  `selling_price` double(100,0) default NULL,
  `month` varchar(100) default NULL,
  `date` varchar(100) default NULL,
  `year` varchar(100) default NULL,
  `cou_nic` varchar(100) default NULL,
  `cou_name` varchar(100) default NULL,
  PRIMARY KEY  (`vehicle_selling_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vehicles_selling`
--


/*!40000 ALTER TABLE `vehicles_selling` DISABLE KEYS */;
LOCK TABLES `vehicles_selling` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `vehicles_selling` ENABLE KEYS */;

--
-- Table structure for table `web`
--

DROP TABLE IF EXISTS `web`;
CREATE TABLE `web` (
  `web_id` int(100) NOT NULL auto_increment,
  `web_name` longtext,
  `web_url` longtext,
  PRIMARY KEY  (`web_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `web`
--


/*!40000 ALTER TABLE `web` DISABLE KEYS */;
LOCK TABLES `web` WRITE;
INSERT INTO `web` VALUES (2,'facebook','www.facebook.com');
UNLOCK TABLES;
/*!40000 ALTER TABLE `web` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

