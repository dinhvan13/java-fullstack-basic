CREATE DATABASE  IF NOT EXISTS `dondathang` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dondathang`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dondathang
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `chitietdondathang`
--

DROP TABLE IF EXISTS `chitietdondathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietdondathang` (
  `ChiTietDonDatHangID` int NOT NULL AUTO_INCREMENT,
  `DonDatHangID` int NOT NULL,
  `SanPhamID` int NOT NULL,
  `SoLuong` int NOT NULL,
  PRIMARY KEY (`ChiTietDonDatHangID`),
  KEY `fk_chitiet_sanpham_idx` (`SanPhamID`),
  KEY `fk_chitiet_donhang_idx` (`DonDatHangID`),
  CONSTRAINT `fk_chitiet_donhang` FOREIGN KEY (`DonDatHangID`) REFERENCES `dondathang` (`DonDatHangID`),
  CONSTRAINT `fk_chitiet_sanpham` FOREIGN KEY (`SanPhamID`) REFERENCES `sanpham` (`SanPhamID`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietdondathang`
--

LOCK TABLES `chitietdondathang` WRITE;
/*!40000 ALTER TABLE `chitietdondathang` DISABLE KEYS */;
INSERT INTO `chitietdondathang` VALUES (1,1,1,12),(2,1,3,11),(3,1,15,1),(4,1,26,4),(5,1,33,5),(6,2,2,3),(7,2,6,33),(8,2,14,23),(9,2,8,1),(10,2,9,7),(11,3,12,4),(12,3,15,23),(13,3,33,4),(14,3,40,3),(15,3,1,12),(16,4,15,34),(17,4,16,5),(18,4,25,6),(19,4,34,3),(20,4,40,23),(21,5,25,4),(22,5,26,8),(23,5,27,9),(24,5,22,5),(25,5,19,1),(26,6,7,11),(27,6,10,13),(28,6,20,4),(29,6,30,5),(30,6,40,3),(31,7,5,7),(32,7,9,4),(33,7,16,22),(34,7,14,12),(35,7,11,4),(36,8,29,6),(37,8,30,4),(38,8,34,88),(39,8,33,12),(40,8,41,3),(41,9,1,5),(42,9,4,7),(43,9,9,3),(44,9,14,35),(45,9,17,95),(46,10,2,33),(47,10,5,2),(48,10,26,4),(49,10,27,2),(50,10,19,12),(51,11,3,45),(52,11,17,3),(53,11,27,6),(54,11,37,3),(55,11,39,2),(56,12,4,9),(57,12,25,7),(58,12,34,4),(59,12,32,2),(60,12,11,4),(61,13,5,5),(62,13,15,2),(63,13,25,4),(64,13,35,3),(65,13,41,5),(66,14,6,7),(67,14,16,78),(68,14,26,5),(69,14,36,3),(70,14,12,4),(71,15,7,23),(72,15,17,4),(73,15,27,7),(74,15,37,2),(75,15,16,7),(76,16,8,89),(77,16,18,4),(78,16,28,2),(79,16,38,45),(80,16,5,3),(81,17,9,23),(82,17,19,56),(83,17,29,3),(84,17,39,2),(85,17,4,6),(86,18,10,32),(87,18,20,54),(88,18,30,32),(89,18,31,4),(90,18,32,2),(91,19,12,23),(92,19,35,5),(93,19,32,7),(94,19,19,3),(95,19,33,6),(96,20,5,76),(97,20,9,4),(98,20,17,3),(99,20,40,2),(100,20,34,56);
/*!40000 ALTER TABLE `chitietdondathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dondathang`
--

DROP TABLE IF EXISTS `dondathang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dondathang` (
  `DonDatHangID` int NOT NULL AUTO_INCREMENT,
  `KhachHangID` int DEFAULT NULL,
  `SoHieuDon` varchar(45) DEFAULT NULL,
  `NgayDat` date DEFAULT NULL,
  `NgayGioTraThucTe` datetime DEFAULT NULL,
  `GhiChu` varchar(45) DEFAULT NULL,
  `TinhTrang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`DonDatHangID`),
  KEY `fk_ddh_khachhang_idx` (`KhachHangID`),
  CONSTRAINT `fk_ddh_khachhang` FOREIGN KEY (`KhachHangID`) REFERENCES `khachhang` (`KhachHangID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dondathang`
--

LOCK TABLES `dondathang` WRITE;
/*!40000 ALTER TABLE `dondathang` DISABLE KEYS */;
INSERT INTO `dondathang` VALUES (1,1,'DDH01','2020-05-25','2020-05-26 00:00:00','OK','Đã giao hàng'),(2,1,'DDH02','2019-05-03','2019-05-04 00:00:00','OK','Đã giao hàng'),(3,1,'DDH03','2019-06-04','2019-06-05 00:00:00','OK','Đã giao hàng'),(4,1,'DDH04','2019-12-31','2020-01-01 00:00:00','OK','Đã giao hàng'),(5,2,'DDH05','2020-05-25','2020-05-26 00:00:00','OK','Đã giao hàng'),(6,2,'DDH06','2019-01-03','2019-01-04 00:00:00','OK','Đã giao hàng'),(7,3,'DDH07','2019-02-05','2019-02-06 00:00:00','OK','Đã giao hàng'),(8,3,'DDH08','2020-06-09',NULL,'Không liên hệ được khách hàng','Đang chờ'),(9,4,'DDH09','2019-03-06','2019-03-07 00:00:00','OK','Đã giao hàng'),(10,4,'DDH10','2020-05-25','2020-05-26 00:00:00','OK','Đã giao hàng'),(11,4,'DDH11','2019-04-19','2019-04-20 00:00:00','OK','Đã giao hàng'),(12,5,'DDH12','2019-07-12','2019-07-13 00:00:00','OK','Đã giao hàng'),(13,6,'DDH13','2019-08-24','2019-08-25 00:00:00','OK','Đã giao hàng'),(14,7,'DDH14','2020-06-09','2020-06-10 00:00:00','OK','Đã giao hàng'),(15,8,'DDH15','2019-09-30','2019-10-01 00:00:00','OK','Đã giao hàng'),(16,8,'DDH16','2020-05-25','2020-05-26 00:00:00','OK','Đã giao hàng'),(17,8,'DDH17','2020-06-09','2020-06-10 00:00:00','OK','Đã giao hàng'),(18,8,'DDH18','2019-10-12','2019-10-13 00:00:00','OK','Đã giao hàng'),(19,9,'DDH19','2019-11-22','2019-11-23 00:00:00','OK','Đã giao hàng'),(20,9,'DDH20','2020-06-09','2020-06-10 00:00:00','OK','Đã giao hàng');
/*!40000 ALTER TABLE `dondathang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khachhang`
--

DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `KhachHangID` int NOT NULL AUTO_INCREMENT,
  `HoTen` varchar(45) DEFAULT NULL,
  `DiaChi` varchar(45) DEFAULT NULL,
  `SDT` varchar(45) DEFAULT NULL,
  `GhiChu` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`KhachHangID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
INSERT INTO `khachhang` VALUES (1,'Hoàng Văn Chiến','Hà Nội','0987876765',NULL,'hvc@gmail.com'),(2,'Mai Thị Nga','Thái Bình','0897898987','Khách hàng tiềm năng','NgaMai98@gmail.com'),(3,'Đoàn Thị Trang','Nam Định','0576857890','Khách hàng thân thiết','TrangDT@gmail.com'),(4,'Nguyễn Thị Hằng','Bắc Ninh','0998978765','VIP','HangNT@gmail.com'),(5,'Phạm Văn Hồng','Hà Nội',NULL,NULL,NULL),(6,'Chu Thị Nụ','Hà Nội','0876765678','VIP','CTNu@gmail.com'),(7,'Hoàng Mạnh Cương','Hà Nội','0876756436',NULL,'CuongHoang@gmail.com'),(8,'Nguyễn Ngọc Hoàng','Hà Nội','0576857465','Khach hàng thân thiết','minh@yahoo.com'),(9,'Khổng Minh Mạnh','Bắc Giang','0456327875',NULL,NULL);
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaisanpham`
--

DROP TABLE IF EXISTS `loaisanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaisanpham` (
  `LoaiSanPhamID` int NOT NULL AUTO_INCREMENT,
  `TenLoai` varchar(45) DEFAULT NULL,
  `GhiChu` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`LoaiSanPhamID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaisanpham`
--

LOCK TABLES `loaisanpham` WRITE;
/*!40000 ALTER TABLE `loaisanpham` DISABLE KEYS */;
INSERT INTO `loaisanpham` VALUES (1,'Đồ ăn','H - 1'),(2,'Đồ uống','H - 2'),(3,'Hàng tiêu dùng','H - 3'),(4,'Đồ điện tử','H - 4'),(5,'Đồ gia dụng','H - 5'),(6,'Trang sức','H - 6'),(7,'Quần áo','H - 7'),(8,'Đồ chơi','H - 8');
/*!40000 ALTER TABLE `loaisanpham` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanpham`
--

DROP TABLE IF EXISTS `sanpham`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanpham` (
  `SanPhamID` int NOT NULL AUTO_INCREMENT,
  `LoaiSanPhamID` int DEFAULT NULL,
  `KyHieu` varchar(45) DEFAULT NULL,
  `TenSanPham` varchar(45) DEFAULT NULL,
  `MoTa` varchar(45) DEFAULT NULL,
  `NhaSanXuat` varchar(45) DEFAULT NULL,
  `NgayDang` date DEFAULT NULL,
  `GiaBan` int DEFAULT NULL,
  `LaSanPhamMoi` bit(1) DEFAULT NULL,
  PRIMARY KEY (`SanPhamID`),
  KEY `fk_sanpham_loaisanpham_idx` (`LoaiSanPhamID`),
  CONSTRAINT `fk_sanpham_loaisanpham` FOREIGN KEY (`LoaiSanPhamID`) REFERENCES `loaisanpham` (`LoaiSanPhamID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanpham`
--

LOCK TABLES `sanpham` WRITE;
/*!40000 ALTER TABLE `sanpham` DISABLE KEYS */;
INSERT INTO `sanpham` VALUES (1,1,'SP01','Bánh xốp',NULL,'Việt Nam','2020-05-25',15000,_binary ''),(2,1,'SP02','Khô bò',NULL,'Trung Quốc','2019-05-06',25000,_binary ''),(3,1,'SP03','Khô gà',NULL,'Anh','2020-05-25',55000,_binary ''),(4,1,'SP04','Cá hồi hộp',NULL,'Pháp','2020-03-05',455000,_binary ''),(5,1,'SP05','Snack',NULL,'Việt Nam','2020-05-25',15000,_binary ''),(6,1,'SP06','Trâu gác bếp',NULL,'Trung Quốc','2019-05-06',850000,_binary ''),(7,1,'SP07','Chocolate',NULL,'Trung Quốc','2020-05-25',25000,_binary '\0'),(8,2,'SP08','Nước cam',NULL,'Việt Nam','2018-04-01',55000,_binary '\0'),(9,2,'SP09','Bò húc',NULL,'Pháp','2019-05-06',13000,_binary ''),(10,2,'SP10','Sting',NULL,'Nhật Bản','2020-03-05',15000,_binary '\0'),(11,2,'SP11','Nước dừa',NULL,'Trung Quốc','2018-04-01',43000,_binary ''),(12,2,'SP12','Trà Thái',NULL,'Việt Nam','2019-05-06',55000,_binary ''),(13,2,'SP13','Cocacola',NULL,'Mỹ','2018-04-01',10000,_binary ''),(14,2,'SP14','Sữa',NULL,'Pháp','2020-05-25',16000,_binary ''),(15,3,'SP15','Bột giặt',NULL,'Trung Quốc','2020-03-05',15000,_binary ''),(16,3,'SP16','Nước xả vải',NULL,'Mỹ','2019-05-06',34000,_binary ''),(17,3,'SP17','Phong bì',NULL,'Việt Nam','2019-02-03',25000,_binary '\0'),(18,3,'SP18','Notebook',NULL,'Nhật Bản','2020-03-05',55000,_binary '\0'),(19,3,'SP19','Ổ khóa',NULL,'Trung Quốc','2018-04-01',45000,_binary '\0'),(20,3,'SP20','Dầu gội',NULL,'Pháp','2019-05-06',15000,_binary ''),(21,4,'SP21','Bình nóng lạnh',NULL,'Việt Nam','2020-05-25',5500000,_binary ''),(22,4,'SP22','Điều hòa',NULL,'Anh','2019-02-03',2500000,_binary '\0'),(23,4,'SP23','Đầu đĩa',NULL,'Hàn Quốc','2019-05-06',250000,_binary '\0'),(24,4,'SP24','Ti vi',NULL,'Việt Nam','2018-04-01',1500000,_binary '\0'),(25,4,'SP25','Quạt',NULL,'Hàn Quốc','2020-03-05',150000,_binary '\0'),(26,4,'SP26','Nồi cơm điện',NULL,'Trung Quốc','2018-04-05',25000,_binary '\0'),(27,5,'SP27','Dao',NULL,'Mỹ','2019-02-03',14000,_binary '\0'),(28,5,'SP28','Xoong inox',NULL,'Việt Nam','2020-05-25',55000,_binary ''),(29,5,'SP29','Bát chống nóng',NULL,'Anh','2019-02-03',15000,_binary ''),(30,5,'SP30','Chảo chống dính',NULL,'Nhật Bản','2020-03-05',25000,_binary ''),(31,5,'SP31','Móc treo quần áo',NULL,'Hàn Quốc','2019-05-06',35000,_binary '\0'),(32,6,'SP32','Bông tai',NULL,'Việt Nam','2019-02-03',15000,_binary ''),(33,6,'SP33','Dây chuyền',NULL,'Anh','2020-05-25',55000,_binary ''),(34,6,'SP34','Nhẫn',NULL,'Hàn Quốc','2019-05-06',25000,_binary ''),(35,6,'SP35','Vòng tay',NULL,'Pháp','2019-02-03',350000,_binary '\0'),(36,7,'SP36','Áo thun',NULL,'Việt Nam','2020-03-05',55000,_binary '\0'),(37,7,'SP37','Quần lửng',NULL,'Nhật Bản','2019-05-06',15000,_binary ''),(38,7,'SP38','Sơ mi',NULL,'Trung Quốc','2019-02-03',25000,_binary ''),(39,7,'SP39','Quần Jean',NULL,'Nhật Bản','2020-05-25',150000,_binary '\0'),(40,8,'SP40','Rubik',NULL,'Việt Nam','2019-05-06',25000,_binary '\0'),(41,8,'SP41','Búp bê',NULL,'Nhật Bản','2020-03-05',15000,_binary '\0');
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

-- Dump completed on 2020-09-17 17:04:16
