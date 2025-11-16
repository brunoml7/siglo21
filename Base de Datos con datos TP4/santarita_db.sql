-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: santarita_db
-- ------------------------------------------------------
-- Server version	8.0.42

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `codCliente` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `domicilio` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `fechaNac` varchar(255) NOT NULL,
  `dni` varchar(255) NOT NULL,
  PRIMARY KEY (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=326 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (12,'Ana','Gomez','Av. Central 45','ana.gomez@gmail.com','15/05/1990','35123456'),(13,'Roberto','Diaz','Calle Falsa 123','r.diaz@hotmail.com','20/11/1985','28987654'),(14,'Sofia','Molina','Las Flores 789','sofia.m@gmail.com','02/01/2001','40567890'),(16,'Lei','Nuñez','Pasaje Sur 22','laura.n@gmail.com','25/01/1999','38234567'),(323,'Pedro','Lopez','Catamarca','plopez@gmail.com','20/09/1989','36150123'),(324,'Daniel','Caro','Santa Fe 12','dani.c@gmail.com','25/01/1991','33569785'),(325,'Agustin','Pavon','Cassafousth 166','agu@hotmail.com','13/05/1997','38987654');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallepedido`
--

DROP TABLE IF EXISTS `detallepedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepedido` (
  `codPedido` int NOT NULL,
  `codProducto` int NOT NULL,
  `monto` double NOT NULL,
  `Cantidad` int NOT NULL,
  PRIMARY KEY (`codPedido`,`codProducto`),
  KEY `detallepedido_ibfk_2` (`codProducto`),
  CONSTRAINT `detallepedido_ibfk_1` FOREIGN KEY (`codPedido`) REFERENCES `pedidocliente` (`codPedido`),
  CONSTRAINT `detallepedido_ibfk_2` FOREIGN KEY (`codProducto`) REFERENCES `producto` (`codProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedido`
--

LOCK TABLES `detallepedido` WRITE;
/*!40000 ALTER TABLE `detallepedido` DISABLE KEYS */;
INSERT INTO `detallepedido` VALUES (5683,135,32.75,1),(5689,811,100,1),(5690,811,100,1),(5690,812,300,2),(5691,811,100,1);
/*!40000 ALTER TABLE `detallepedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedidocliente`
--

DROP TABLE IF EXISTS `pedidocliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedidocliente` (
  `codPedido` int NOT NULL AUTO_INCREMENT,
  `codCliente` int NOT NULL,
  `monto` double NOT NULL,
  `fecha` varchar(255) NOT NULL,
  PRIMARY KEY (`codPedido`),
  KEY `pedidocliente_ibfk_1` (`codCliente`),
  CONSTRAINT `pedidocliente_ibfk_1` FOREIGN KEY (`codCliente`) REFERENCES `cliente` (`codCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5692 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedidocliente`
--

LOCK TABLES `pedidocliente` WRITE;
/*!40000 ALTER TABLE `pedidocliente` DISABLE KEYS */;
INSERT INTO `pedidocliente` VALUES (5683,323,32.75,'01/10/2025'),(5686,12,100,'2025-10-16'),(5687,12,100,'2025-10-16'),(5688,12,100,'2025-10-16'),(5689,12,100,'2025-10-16'),(5690,12,700,'2025-10-16'),(5691,12,100,'2025-10-16');
/*!40000 ALTER TABLE `pedidocliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `codProducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `precio` double NOT NULL,
  `strock` int NOT NULL,
  `codRubro` int NOT NULL,
  PRIMARY KEY (`codProducto`),
  KEY `codRubro` (`codRubro`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codRubro`) REFERENCES `rubro` (`codRubro`)
) ENGINE=InnoDB AUTO_INCREMENT=815 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (135,'Lavandina','Lavandina Ayudin',2500,15,12),(250,'Limpia Piso','Limpia Piso Poet',1250,20,12),(805,'Perfume Baño','Perfume Baño Poet',4600,10,12),(809,'detergente','deter',10,10,12),(811,'Esponja ','Esponja de Cocina Ciff',100,10,12),(812,'Esponja AntiBaterial','Esponja de Cocina Antibacterial',300,10,13),(813,'Esponja Acero','Esponja de Acero para cocina',500,15,13),(814,'Liquido Anti grasa','Liquido antigrasa de 1lt',4000,20,13);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rubro`
--

DROP TABLE IF EXISTS `rubro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rubro` (
  `codRubro` int NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`codRubro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rubro`
--

LOCK TABLES `rubro` WRITE;
/*!40000 ALTER TABLE `rubro` DISABLE KEYS */;
INSERT INTO `rubro` VALUES (4,'Oficina'),(12,'Limpieza'),(13,'cocina'),(14,'baño');
/*!40000 ALTER TABLE `rubro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `nombreUsuario` varchar(50) NOT NULL,
  `contrasenia` varchar(255) NOT NULL,
  `nombreapellido` varchar(255) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  PRIMARY KEY (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('admin','1234','Luis Perez','Gerente'),('admin2','1234','Pedro Lopez','Empleado'),('emp01','1234','Maximiliano Leon','Empleado');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-11-16 14:21:11
