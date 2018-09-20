-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bangla_boi
--

CREATE DATABASE IF NOT EXISTS bangla_boi;
USE bangla_boi;

--
-- Definition of table `books`
--

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `writer` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  `size` varchar(45) NOT NULL,
  `length` varchar(45) NOT NULL,
  `file_type` varchar(45) NOT NULL,
  `description` varchar(500) NOT NULL,
  `media_fire_link` varchar(250) NOT NULL,
  `google_drive_link` varchar(250) NOT NULL,
  `img_link` varchar(250) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` (`id`,`name`,`writer`,`category`,`size`,`length`,`file_type`,`description`,`media_fire_link`,`google_drive_link`,`img_link`) VALUES 
 (1,'Basanta Bilap','Humayun Ahmed','Novel',' 4.33 MB','98 pages','Portable Document Format (PDF) file','Basanta Bilap written by Humayun Ahmed is a popular Bangla Novel. All books available on this site are totally free. So stay connected, download and read your favorite one from www.amarbanglaboi.com.','http://www.mediafire.com/file/wxhadvu2630malz/Amanush_-_Humayun_Ahmed.pdf','https://drive.google.com/open?id=0B_jZspe-joFfbUd0aXYzVTZrWkk','image/Basanta-Bilap-Humayun-Ahmed.jpg'),
 (2,'A Passage to India (Bharat Pothey)','Hiron Kumar Sanyal','History','7.17 MB','111 pages','Portable Document Format (PDF) file','A Passage to India (Bharat Pothey) written by Hiron Kumar Sanyal is a popular Bangla book. All books available on this site are totally free. So stay connected, download and read your favorite one from www.amarbanglaboi.com.','http://www.mediafire.com/file/cgk7674d9eq33b1/A_Passage_to_India_%28Bharat_Pothey%29_-_Edward_Morgan_Forster.pdf','https://drive.google.com/open?id=1AmJQ6RRq4lJrrG1FRh-eg8GpvXcsXpeM','image/A-Passage-to-India-Bharat-Pothey.png'),
 (3,'Bhetore Baire','A. K. Khandakar','History','19.2 MB','230 pages','Portable Document Format (PDF) file','1971 Bhetore Baire written by A. K. Khandakar is a popular Bangla Historical Book. All books available on this site are totally free. So stay connected, download and read your favorite one from www.amarbanglaboi.com.','http://www.mediafire.com/file/8dvfbk46e7ty23d/1971_Bhetore_Baire_-_A_K_Khandakar.pdf','https://drive.google.com/open?id=1tDDjafj6Yckp6g_ze27JvO2QoabeiWp1','image/Bhetore-Baire-A-K-Khandakar.png'),
 (4,'Ak-E Barir Lok','Vasili Ardamatski','Short Story','7.56 MB','134 Pages','Portable Document Format (PDF) file',' Bengali writer’s popular books, Translated books, Magazines, Novel, Short stories, epic, History, Autobiography, Religious books are available in this website. Books of this website are free from watermark, clear text and high resolution. All books are totally free to download and read.','http://www.mediafire.com/file/wg9ctiusxmktwbk/Ak-E+Barir+Lok+-+Vasili+Ardamatski.pdf','null','image/Ak-E-Barir-Lok-Vasili-Ardamatski.png'),
 (5,'Mein Kampf','Adolf Hitler','Autobiography','11.2 MB','238 Pages','Portable Document Format (PDF) file','Although Hitler originally wrote Mein Kampf mostly for the followers of National Socialism, it grew in popularity after he rose to power.','http://www.mediafire.com/file/bxmo25pm1hzaixc/Amar_Songram_%28Mein_Kampf%29_-_Adolf_Hitler.pdf','null','image/Mein-Kampf-Adolf-Hitler.png');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
