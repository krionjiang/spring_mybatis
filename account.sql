/*
 Navicat Premium Data Transfer

 Source Server         : localhostconn
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : springdb

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 17/10/2020 11:36:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `money` float NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, 'aaa', 18598);
INSERT INTO `account` VALUES (2, 'bbb', 2500);
INSERT INTO `account` VALUES (3, 'ccc', 6000);
INSERT INTO `account` VALUES (5, 'ddd', 8888);
INSERT INTO `account` VALUES (6, 'eee', 10000);
INSERT INTO `account` VALUES (7, 'eee', 10000);
INSERT INTO `account` VALUES (9, 'fff', 9000);

SET FOREIGN_KEY_CHECKS = 1;
