CREATE TABLE `test_binlog_inno` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  `money` decimal(10,3) DEFAULT NULL,
  `ct` datetime DEFAULT CURRENT_TIMESTAMP,
  `ut` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4