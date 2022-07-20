-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: 0106271836servicios
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `casa`
--

DROP TABLE IF EXISTS `casa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `casa` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `area` int NOT NULL,
  `codigo` varchar(60) NOT NULL,
  `propietario` varchar(60) NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `totalp` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casa`
--

LOCK TABLES `casa` WRITE;
/*!40000 ALTER TABLE `casa` DISABLE KEYS */;
INSERT INTO `casa` VALUES (1,12,'ISTA_2220','Juan Matute','Rural',960),(3,96,'2022','Victor','Urbano',7680),(11,12,'CA_001','Luis Paz','Rural',960),(12,149,'GH-2022','Juanka','Urbano',11920);
/*!40000 ALTER TABLE `casa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `equipos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `chip` int NOT NULL,
  `costo` int NOT NULL,
  `equipo` varchar(60) NOT NULL,
  `imei` int NOT NULL,
  `observacion` varchar(60) NOT NULL,
  `serie` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (3,464646,500,'Juanka2022',121055155,'Excelente 10 de 10','ghg25'),(6,990035738,100,'12345diego',868683021,'Equipo Tracker en buen funcionamiento','TK-103');
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pantalones`
--

DROP TABLE IF EXISTS `pantalones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pantalones` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `costo` int NOT NULL,
  `fabricante` varchar(60) NOT NULL,
  `marca` varchar(60) NOT NULL,
  `modelo` varchar(60) NOT NULL,
  `origen` varchar(60) NOT NULL,
  `totalp` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pantalones`
--

LOCK TABLES `pantalones` WRITE;
/*!40000 ALTER TABLE `pantalones` DISABLE KEYS */;
INSERT INTO `pantalones` VALUES (1,3,15,'Juanka','Jean','Deportivo','Americano',45),(5,20,80,'MarcJean','Jean','Casual','Americano',1600),(7,8,12,'Chinito','China','Deportivo','Nacional',96),(8,5,32,'Martha','Colombiana','Deportivo','Nacional',160);
/*!40000 ALTER TABLE `pantalones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zapatos`
--

DROP TABLE IF EXISTS `zapatos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `zapatos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `codigo` varchar(60) NOT NULL,
  `costo` int NOT NULL,
  `marca` varchar(60) NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `totalp` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zapatos`
--

LOCK TABLES `zapatos` WRITE;
/*!40000 ALTER TABLE `zapatos` DISABLE KEYS */;
INSERT INTO `zapatos` VALUES (2,2,'200',150,'Vans','Deportivos',300),(6,1,'zp_001',40,'Bata','Casual',40),(7,8,'nic-20',115,'Nike','Deportivo',920),(8,5,'ca_021',68,'Nike Bla','Deportivo',340),(9,3,'vn_222',98,'Venus','Deportivo',294);
/*!40000 ALTER TABLE `zapatos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-06  8:56:20
