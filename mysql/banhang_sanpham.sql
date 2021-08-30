-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: banhang
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `sanPhamID` int NOT NULL AUTO_INCREMENT,
  `loaiSanPhamIS` int NOT NULL,
  `kyHieuSanPham` varchar(45) DEFAULT NULL,
  `tenSanPham` varchar(45) DEFAULT NULL,
  `moTa` varchar(45) DEFAULT NULL,
  `nhaSanXuat` varchar(45) DEFAULT NULL,
  `ngayDang` date DEFAULT NULL,
  `giaBan` double DEFAULT NULL,
  `laSanPhamMoi` int DEFAULT NULL,
  PRIMARY KEY (`sanPhamID`),
  KEY `fk_sanpham_loaisanpham_idx` (`loaiSanPhamIS`),
  CONSTRAINT `fk_sanpham_loaisanpham` FOREIGN KEY (`loaiSanPhamIS`) REFERENCES `loaisanpham` (`loaiSanPhamID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1,1,'ksa','ban hoc tap','tot','viet nam','2021-04-01',678000,1),(2,1,'gha','ghe sofa','tot','trung quoc','2021-04-02',4500000,1),(3,2,'gv1','nuoc nam','ngon','viet nam',NULL,20000,1),(4,2,'gv2','bot canh hai chau','ngon','viet nam','2021-04-02',10000,1),(5,3,'bk1','banh gao','gion','han quoc','2021-04-10',60000,1),(6,3,'bk2','keo lac','ngon','viet nam','2021-04-03',150000,1);
/*!40000 ALTER TABLE `sanpham` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-09 23:51:05
