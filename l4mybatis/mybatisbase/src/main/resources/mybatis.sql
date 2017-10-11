SET FOREIGN_KEY_CHECKS=0;

create database if not EXISTS 'mybatis';


-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', 'test');

CREATE TABLE `t_user` (
  `id` varchar(45) NOT NULL,
  `accountID` varchar(45) DEFAULT NULL,
  `userName` varchar(45) DEFAULT NULL,
  `statusDef` varchar(45) DEFAULT NULL,
  `statusOrdinal` varchar(45) DEFAULT NULL,
  `statusCustom` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';