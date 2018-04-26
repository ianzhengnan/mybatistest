/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : mybatistest

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-04-26 19:29:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_lecture`;
CREATE TABLE `t_lecture` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lecture_name` varchar(60) NOT NULL COMMENT '课程名称',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_lecture
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL,
  `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', 'testName', '2018-04-24 19:09:57', 'testNote');
INSERT INTO `t_role` VALUES ('2', 'administrator', '2018-04-24 19:09:57', 'admin data');
INSERT INTO `t_role` VALUES ('3', 'kaka', '2018-04-24 19:09:57', 'this is kaka');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(60) NOT NULL COMMENT '姓名',
  `sex` tinyint(4) NOT NULL COMMENT '性别',
  `selfcard_no` int(20) NOT NULL COMMENT '学生证编号',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------

-- ----------------------------
-- Table structure for t_student_health_female
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_female`;
CREATE TABLE `t_student_health_female` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `check_date` datetime NOT NULL COMMENT '检查日期',
  `heart` varchar(60) NOT NULL COMMENT '心',
  `liver` varchar(60) NOT NULL COMMENT '肝',
  `spleen` varchar(60) NOT NULL COMMENT '脾',
  `lung` varchar(60) NOT NULL COMMENT '肺',
  `kidney` varchar(60) NOT NULL COMMENT '肾',
  `uterus` varchar(60) NOT NULL COMMENT '子宫',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_health_female
-- ----------------------------

-- ----------------------------
-- Table structure for t_student_health_male
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_male`;
CREATE TABLE `t_student_health_male` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `check_date` datetime NOT NULL COMMENT '检查日期',
  `heart` varchar(60) NOT NULL COMMENT '心',
  `liver` varchar(60) NOT NULL COMMENT '肝',
  `spleen` varchar(60) NOT NULL COMMENT '脾',
  `lung` varchar(60) NOT NULL COMMENT '肺',
  `kidney` varchar(60) NOT NULL COMMENT '肾',
  `prostate` varchar(60) NOT NULL COMMENT '前列腺',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_health_male
-- ----------------------------

-- ----------------------------
-- Table structure for t_student_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_student_lecture`;
CREATE TABLE `t_student_lecture` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `lecture_id` int(20) NOT NULL COMMENT '课程编号',
  `grade` decimal(16,2) NOT NULL COMMENT '评分',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_lecture
-- ----------------------------

-- ----------------------------
-- Table structure for t_student_selfcard
-- ----------------------------
DROP TABLE IF EXISTS `t_student_selfcard`;
CREATE TABLE `t_student_selfcard` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `native` varchar(60) NOT NULL COMMENT '籍贯',
  `issue_date` date NOT NULL COMMENT '发证日期',
  `end_date` date NOT NULL COMMENT '结束日期',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_selfcard
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(60) NOT NULL,
  `birthday` date NOT NULL,
  `sex` varchar(2) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `email` varchar(60) DEFAULT NULL,
  `note` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
