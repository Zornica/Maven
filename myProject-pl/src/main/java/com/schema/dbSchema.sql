create database if not exists mydb;

use testdb;


student | CREATE TABLE `student` (
  `name` varchar(50) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `idNumber` int(5) NOT NULL,
  `year` int(4) DEFAULT NULL,
  `isPaid` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`idNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1