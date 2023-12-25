/*
 Navicat Premium Data Transfer

 Source Server         : 192.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 19/12/2023 08:38:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for booklib
-- ----------------------------
DROP TABLE IF EXISTS `booklib`;
CREATE TABLE `booklib`  (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_price` double(10, 2) NULL DEFAULT NULL,
  `b_del` int(255) NULL DEFAULT NULL COMMENT 'del = 0 未删除 1 已删除',
  `b_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `b_lite` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`b_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of booklib
-- ----------------------------
INSERT INTO `booklib` VALUES (1, '查理九世', 9.00, 0, '科幻', NULL);
INSERT INTO `booklib` VALUES (2, '三体', 15.00, 0, '科幻', NULL);
INSERT INTO `booklib` VALUES (3, '童话故事', 11.00, 0, '科幻', NULL);
INSERT INTO `booklib` VALUES (4, '管子哥的传奇故事', 99.00, 0, '科幻', NULL);
INSERT INTO `booklib` VALUES (5, '管子哥真贱', 1.00, 0, '写实', NULL);
INSERT INTO `booklib` VALUES (6, '京东卡', 200.00, 0, '卡', NULL);

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, '一班');
INSERT INTO `class` VALUES (2, '二班');
INSERT INTO `class` VALUES (3, '三班');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `d_no` int(11) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `des` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`d_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '开发部', NULL);
INSERT INTO `dept` VALUES (2, '美工部', NULL);
INSERT INTO `dept` VALUES (3, '实施部', NULL);

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `e_id` int(11) NOT NULL AUTO_INCREMENT,
  `e_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sal` double NULL DEFAULT NULL,
  `job` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_no` int(11) NULL DEFAULT NULL,
  `del` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`e_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, '张三', '男', 4000, '开发', 1, '1');
INSERT INTO `emp` VALUES (2, '张三', '男', 4000, '开发', 1, '1');
INSERT INTO `emp` VALUES (3, '张三', '男', 4000, '开发', 2, '1');
INSERT INTO `emp` VALUES (4, '张三', '男', 4000, '开发', 2, '0');
INSERT INTO `emp` VALUES (5, '张三', '男', 4000, '开发', 2, '0');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `u_age` int(255) NOT NULL,
  `del` int(2) NULL DEFAULT NULL,
  `u_cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '管', '男', 0, 1, 1);
INSERT INTO `student` VALUES (2, '李四', '男', 18, 1, 2);
INSERT INTO `student` VALUES (3, '管子哥', '男', 20, 1, 1);
INSERT INTO `student` VALUES (4, 'tenger', '男', 19, 0, 2);
INSERT INTO `student` VALUES (5, '小明', NULL, 16, 0, 3);
INSERT INTO `student` VALUES (6, '小明', NULL, 16, 0, 1);
INSERT INTO `student` VALUES (7, '小明是南通', NULL, 16, 0, 3);
INSERT INTO `student` VALUES (8, '小明是南通', NULL, 16, 0, 2);
INSERT INTO `student` VALUES (9, '小明是南通', NULL, 16, 0, 3);
INSERT INTO `student` VALUES (10, 'tenger', '男', 19, 0, 1);
INSERT INTO `student` VALUES (11, '管子哥', '男', 18, 0, 3);
INSERT INTO `student` VALUES (12, '管子割真贱', '男', 20, 0, 2);

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `menu_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` bigint(20) NULL DEFAULT NULL COMMENT '父菜单ID，一级菜单为0',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '跳转地址',
  `link` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `perms` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '菜单管理' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, 0, '系统管理', NULL, '/sys', 'sys:schedule:admin', 0, 'system', 0);
INSERT INTO `sys_menu` VALUES (2, 1, '角色管理', 'sys/role', '/role', '', 1, 'role', 1);
INSERT INTO `sys_menu` VALUES (3, 1, '菜单管理', 'sys/menu', '/menu', NULL, 1, 'menu', 2);
INSERT INTO `sys_menu` VALUES (4, 1, '管理员列表', 'sys/user', '/user', NULL, 1, 'admin', 3);
INSERT INTO `sys_menu` VALUES (5, 2, '添加角色', '', NULL, 'sys:user:admin', 2, NULL, 1);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `rid` int(11) NOT NULL,
  `r_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `permission` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`rid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'admin', 'admin:user');
INSERT INTO `sys_role` VALUES (2, 'user', 'role:list');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_id` int(11) NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `pwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `userID` int(10) NOT NULL,
  `status` tinyint(4) NULL DEFAULT NULL COMMENT '账户状态  0.正常  1.锁定',
  `rid` bigint(20) NULL DEFAULT NULL COMMENT '角色编号',
  `rname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `deleted` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '删除状态（0：未删除 1:已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, '张三', '7174f64b13022acd3c56e2781e098a5f', 0, 0, 1, '管理员', '2023-02-14 12:18:55', '2023-02-14 12:19:10', '0');
INSERT INTO `sys_user` VALUES (2, '李四', '7174f64b13022acd3c56e2781e098a5f', 0, 0, 2, '职员', '2023-02-14 12:19:08', '2023-02-14 12:19:13', '0');
INSERT INTO `sys_user` VALUES (3, 'zhangsan', '4297f44b13955235245b2497399d7a93', 10086, 0, NULL, NULL, NULL, NULL, '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role`  (
  `rid` int(11) NULL DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES (1, 1, 1);
INSERT INTO `sys_user_role` VALUES (2, 2, 2);

-- ----------------------------
-- Table structure for test1
-- ----------------------------
DROP TABLE IF EXISTS `test1`;
CREATE TABLE `test1`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `A0141` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作日期',
  `A0123` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '社会年龄',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test1
-- ----------------------------
INSERT INTO `test1` VALUES (1, 23, '张三', '1234', '3');
INSERT INTO `test1` VALUES (2, 35, '李四', '732', '2');

SET FOREIGN_KEY_CHECKS = 1;
