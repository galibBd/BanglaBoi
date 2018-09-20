create database actors;
use actors;

DROP TABLE IF EXISTS `actor`;

CREATE TABLE `actor` (
  `id` int(11) NOT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `birth_date` varchar(255) DEFAULT NULL,
  `birth_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;




LOCK TABLES `actor` WRITE;

INSERT INTO `actor` VALUES 
(1,1,'October 12, 1968','Hugh Michael Jackman','hughjackman@mail.com','https://stocklandmartelblog.files.wordpress.com/2013/07/nino-muncc83oz_hugh-jackman_page_3.jpg','Hugh Jackson'),
(2,1,'October 12, 1968','Jennifer Lawrence','jennifer@mail.com','http://media1.popsugar-assets.com/files/2013/01/01/5/192/1922398/e0bd827287eb8c5f_145351598.xxxlarge_2.jpg','Jennifer Lawrence');

UNLOCK TABLES;
