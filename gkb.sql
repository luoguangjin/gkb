/*
 Navicat Premium Data Transfer

 Source Server         : LGJ
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : gkb

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 24/02/2022 22:46:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_admin
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin`;
CREATE TABLE `sys_admin`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `phone` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `address` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否启用',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `userFace` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_admin
-- ----------------------------
INSERT INTO `sys_admin` VALUES (1, '系统管理员', '18776361398', '香港特别行政区强县长寿柳州路p座123', 1, 'admin', '$2a$10$ogvUqZZAxrBwrmVI/e7.SuFYyx8my8d.9zJ6bs9lPKWvbD9eefyCe', 'http://192.168.10.100:8888/group1/M00/00/00/wKgKZF6oHzuAXnw9AABaLsrkrQQ148.jpg', 'http://192.168.10.100:8888/group1/M00/00/00/wKgKZF6oHzuAXnw9AABaLsrkrQQ148.jpg');
INSERT INTO `sys_admin` VALUES (2, '何淑华', '18875971675', '香港特别行政区强县长寿柳州路p座123', 1, 'taomeng', '$2a$10$ogvUqZZAxrBwrmVI/e7.SuFYyx8my8d.9zJ6bs9lPKWvbD9eefyCe', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830947922&di=60b35821fb9112d0aad6915efe982c8d&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201703%2F26%2F20170326161532_aGteC.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830947922&di=60b35821fb9112d0aad6915efe982c8d&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201703%2F26%2F20170326161532_aGteC.jpeg');
INSERT INTO `sys_admin` VALUES (3, '安淑华123', '14588110811', '香港特别行政区强县长寿柳州路p座123', 1, 'naqiao', '$2a$10$ogvUqZZAxrBwrmVI/e7.SuFYyx8my8d.9zJ6bs9lPKWvbD9eefyCe', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1517070040185&di=be0375e0c3db6c311b837b28c208f318&imgtype=0&src=http%3A%2F%2Fimg2.soyoung.com%2Fpost%2F20150213%2F6%2F20150213141918532.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1517070040185&di=be0375e0c3db6c311b837b28c208f318&imgtype=0&src=http%3A%2F%2Fimg2.soyoung.com%2Fpost%2F20150213%2F6%2F20150213141918532.jpg');
INSERT INTO `sys_admin` VALUES (4, '林宇', '15761248727', '香港特别行政区强县长寿柳州路p座123', 0, 'leisu', '$2a$10$ogvUqZZAxrBwrmVI/e7.SuFYyx8my8d.9zJ6bs9lPKWvbD9eefyCe', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830829995&di=0fc5f8313a734b401d20a57bc9bdd421&imgtype=0&src=http%3A%2F%2Fpic4.zhimg.com%2F50%2Fv2-7fece9a613445edb78271216c8c20c6d_hd.jpg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830829995&di=0fc5f8313a734b401d20a57bc9bdd421&imgtype=0&src=http%3A%2F%2Fpic4.zhimg.com%2F50%2Fv2-7fece9a613445edb78271216c8c20c6d_hd.jpg');
INSERT INTO `sys_admin` VALUES (5, '武军', '18030710396', '香港特别行政区强县长寿柳州路p座123', 0, '0hanli', '$2a$10$ogvUqZZAxrBwrmVI/e7.SuFYyx8my8d.9zJ6bs9lPKWvbD9eefyCe', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830877372&di=9ae7236e73ff24c756ac30722b6e84b1&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201704%2F10%2F20170410095843_SEvMy.thumb.700_0.jpeg', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1585830877372&di=9ae7236e73ff24c756ac30722b6e84b1&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201704%2F10%2F20170410095843_SEvMy.thumb.700_0.jpeg');

-- ----------------------------
-- Table structure for sys_admin_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_admin_role`;
CREATE TABLE `sys_admin_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `adminId` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `rid` int(11) NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 71 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_admin_role
-- ----------------------------
INSERT INTO `sys_admin_role` VALUES (5, 4, 3);
INSERT INTO `sys_admin_role` VALUES (6, 4, 2);
INSERT INTO `sys_admin_role` VALUES (7, 4, 4);
INSERT INTO `sys_admin_role` VALUES (8, 4, 5);
INSERT INTO `sys_admin_role` VALUES (16, 1, 6);
INSERT INTO `sys_admin_role` VALUES (55, 3, 3);
INSERT INTO `sys_admin_role` VALUES (56, 3, 4);
INSERT INTO `sys_admin_role` VALUES (67, 2, 3);
INSERT INTO `sys_admin_role` VALUES (68, 5, 1);
INSERT INTO `sys_admin_role` VALUES (69, 5, 2);
INSERT INTO `sys_admin_role` VALUES (70, 5, 6);

-- ----------------------------
-- Table structure for sys_city
-- ----------------------------
DROP TABLE IF EXISTS `sys_city`;
CREATE TABLE `sys_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '城市名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_city
-- ----------------------------
INSERT INTO `sys_city` VALUES (1, '老北京');
INSERT INTO `sys_city` VALUES (2, '上海');
INSERT INTO `sys_city` VALUES (3, '广州');
INSERT INTO `sys_city` VALUES (4, '深圳');
INSERT INTO `sys_city` VALUES (5, '杭州');
INSERT INTO `sys_city` VALUES (6, '');

-- ----------------------------
-- Table structure for sys_col_major
-- ----------------------------
DROP TABLE IF EXISTS `sys_col_major`;
CREATE TABLE `sys_col_major`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mid` int(11) NULL DEFAULT NULL COMMENT '专业id',
  `cid` int(11) NULL DEFAULT NULL COMMENT '学校id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_col_major
-- ----------------------------

-- ----------------------------
-- Table structure for sys_college
-- ----------------------------
DROP TABLE IF EXISTS `sys_college`;
CREATE TABLE `sys_college`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学院代码',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学院名称',
  `city_id` int(11) NULL DEFAULT NULL COMMENT '城市id',
  `college_chatics` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '院校特色（211、985）',
  `college_subje` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '院校隶属（教育部）',
  `isDualClass` int(11) NULL DEFAULT NULL COMMENT '是否双一流',
  `eduLevel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '高校性质(普通本科|本科|高职|其他)',
  `college_property` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院资质(公办|民办|中外合作办学)',
  `major_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '开设专业',
  `ranking` int(11) NULL DEFAULT NULL COMMENT '全国排名',
  `web_site` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院官网',
  `number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招生电话',
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院LOGO',
  `intro` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '简介',
  `college_date` datetime(0) NULL DEFAULT NULL COMMENT '学院创办时间',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_college
-- ----------------------------
INSERT INTO `sys_college` VALUES (1, '10001', '北京大学', 1, '211— —985', '教育部', 0, '本科', '公办', '1', 1, 'www.beijingdaxue.com', '0778-2234045', 'bjdx@163.com', '北京地区', 'http://localhost:9999/files/00958d7e1834435ba7f5ed1ff10f8a96', '<p>123123213123</p>', '1958-01-01 00:00:00', NULL, NULL);
INSERT INTO `sys_college` VALUES (2, '10002', '清华大学', 1, '985—211', '教育部', 0, '本科', '公办', NULL, 2, 'qinghua.edu', '0778-2234045', '123@qq.com', '北京北京', 'http://localhost:9999/files/832654cec950492d82a7ea6de0f0b80c', '<p>这是广西大学</p>', '2021-12-22 00:00:00', NULL, NULL);
INSERT INTO `sys_college` VALUES (5, '10003', '上海同济大学', 7, '211-985', '教育部', 0, '本科', '公办', NULL, 20, 'www.tongji.edu', '0778-2345827', '123@163.com', '上海', 'http://localhost:9999/files/e631e0fbd12340108a97f74dbf0c2e77', '<p>这是广西大学</p>', '1952-03-04 00:00:00', NULL, NULL);
INSERT INTO `sys_college` VALUES (6, '10008', '广西大学', 2, '一本', '教育部', 0, '本科', '公办', NULL, 88, 'www.gxdx.com', '0778-2348734', 'guangxidaxue@163.com', '广西南宁西乡塘', 'http://localhost:9999/files/4a5bcfa460c34ec1a50eb141c6ba358a', '<p>这是广西大学</p>', '1952-03-25 00:00:00', NULL, NULL);
INSERT INTO `sys_college` VALUES (7, '1005', 'gaungxikeji', 1, '1', 's是的', 0, '112', 'sd', NULL, 202, 'www.qcom', '077-2224546', '163@163.com', 'sd', 'http://localhost:9999/files/e6a0c6abc2f84504822580fe0b09a07e', '<p>asd&nbsp;</p>', '2021-12-04 00:00:00', NULL, NULL);

-- ----------------------------
-- Table structure for sys_column
-- ----------------------------
DROP TABLE IF EXISTS `sys_column`;
CREATE TABLE `sys_column`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `parentId` int(11) NULL DEFAULT NULL COMMENT '父id',
  `depPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '路径',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否启用',
  `isParent` tinyint(1) NULL DEFAULT 0 COMMENT '是否上级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_column
-- ----------------------------
INSERT INTO `sys_column` VALUES (1, '所有分类', -1, '.1', 1, 1);
INSERT INTO `sys_column` VALUES (2, '上海高考', 1, '1.2', 1, 1);
INSERT INTO `sys_column` VALUES (3, '山东高考', 1, '1.3', 1, 1);
INSERT INTO `sys_column` VALUES (4, '广西高考', 1, '.1.4', 1, 1);
INSERT INTO `sys_column` VALUES (5, '玉林考生', 4, '.1.4.5', 1, 0);
INSERT INTO `sys_column` VALUES (8, '南宁高考', 2, '1.2.8', 1, 0);

-- ----------------------------
-- Table structure for sys_major
-- ----------------------------
DROP TABLE IF EXISTS `sys_major`;
CREATE TABLE `sys_major`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '专业名称',
  `parentId` int(11) NULL DEFAULT NULL COMMENT '父id',
  `depPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '路径',
  `des` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '专业描述',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否启用',
  `isParent` tinyint(1) NULL DEFAULT 0 COMMENT '是否上级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_major
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `url` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'url',
  `path` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'path',
  `component` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组件',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单名',
  `iconCls` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图标',
  `keepAlive` tinyint(1) NULL DEFAULT NULL COMMENT '是否保持激活',
  `requireAuth` tinyint(1) NULL DEFAULT NULL COMMENT '是否要求权限',
  `parentId` int(11) NULL DEFAULT NULL COMMENT '父id',
  `enabled` tinyint(1) NULL DEFAULT 1 COMMENT '是否启用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, '/', NULL, NULL, '所有', NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_menu` VALUES (2, '/', '/home', 'Home', '员工资料', 'fa fa-user-circle-o', NULL, 1, 1, 1);
INSERT INTO `sys_menu` VALUES (3, '/', '/home', 'Home', '人事管理', 'fa fa-address-card-o', NULL, 1, 1, 1);
INSERT INTO `sys_menu` VALUES (4, '/', '/home', 'Home', '薪资管理', 'fa fa-money', NULL, 1, 1, 1);
INSERT INTO `sys_menu` VALUES (5, '/', '/home', 'Home', '统计管理', 'fa fa-bar-chart', NULL, 1, 1, 1);
INSERT INTO `sys_menu` VALUES (6, '/', '/home', 'Home', '系统管理', 'fa fa-windows', NULL, 1, 1, 1);
INSERT INTO `sys_menu` VALUES (7, '/employee/basic/**', '/emp/basic', 'EmpBasic', '基本资料', NULL, NULL, 1, 2, 1);
INSERT INTO `sys_menu` VALUES (8, '/employee/advanced/**', '/emp/adv', 'EmpAdv', '高级资料', NULL, NULL, 1, 2, 1);
INSERT INTO `sys_menu` VALUES (9, '/personnel/emp/**', '/per/emp', 'PerEmp', '员工资料', NULL, NULL, 1, 3, 1);
INSERT INTO `sys_menu` VALUES (10, '/personnel/ec/**', '/per/ec', 'PerEc', '员工奖惩', NULL, NULL, 1, 3, 1);
INSERT INTO `sys_menu` VALUES (11, '/personnel/train/**', '/per/train', 'PerTrain', '员工培训', NULL, NULL, 1, 3, 1);
INSERT INTO `sys_menu` VALUES (12, '/personnel/salary/**', '/per/salary', 'PerSalary', '员工调薪', NULL, NULL, 1, 3, 1);
INSERT INTO `sys_menu` VALUES (13, '/personnel/remove/**', '/per/mv', 'PerMv', '员工调动', NULL, NULL, 1, 3, 1);
INSERT INTO `sys_menu` VALUES (14, '/salary/sob/**', '/sal/sob', 'SalSob', '工资账套管理', NULL, NULL, 1, 4, 1);
INSERT INTO `sys_menu` VALUES (15, '/salary/sobcfg/**', '/sal/sobcfg', 'SalSobCfg', '员工账套设置', NULL, NULL, 1, 4, 1);
INSERT INTO `sys_menu` VALUES (16, '/salary/table/**', '/sal/table', 'SalTable', '工资表管理', NULL, NULL, 1, 4, 1);
INSERT INTO `sys_menu` VALUES (17, '/salary/month/**', '/sal/month', 'SalMonth', '月末处理', NULL, NULL, 1, 4, 1);
INSERT INTO `sys_menu` VALUES (18, '/salary/search/**', '/sal/search', 'SalSearch', '工资表查询', NULL, NULL, 1, 4, 1);
INSERT INTO `sys_menu` VALUES (19, '/statistics/all/**', '/sta/all', 'StaAll', '综合信息统计', NULL, NULL, 1, 5, 1);
INSERT INTO `sys_menu` VALUES (20, '/statistics/score/**', '/sta/score', 'StaScore', '员工积分统计', NULL, NULL, 1, 5, 1);
INSERT INTO `sys_menu` VALUES (21, '/statistics/personnel/**', '/sta/pers', 'StaPers', '人事信息统计', NULL, NULL, 1, 5, 1);
INSERT INTO `sys_menu` VALUES (22, '/statistics/recored/**', '/sta/record', 'StaRecord', '人事记录统计', NULL, NULL, 1, 5, 1);
INSERT INTO `sys_menu` VALUES (23, '/system/basic/**', '/sys/basic', 'SysBasic', '基础信息设置', NULL, NULL, 1, 6, 1);
INSERT INTO `sys_menu` VALUES (24, '/system/cfg/**', '/sys/cfg', 'SysCfg', '系统管理', NULL, NULL, 1, 6, 1);
INSERT INTO `sys_menu` VALUES (25, '/system/log/**', '/sys/log', 'SysLog', '操作日志管理', NULL, NULL, 1, 6, 1);
INSERT INTO `sys_menu` VALUES (26, '/system/admin/**', '/sys/admin', 'SysAdmin', '操作员管理', NULL, NULL, 1, 6, 1);
INSERT INTO `sys_menu` VALUES (27, '/system/data/**', '/sys/data', 'SysData', '备份恢复数据库', NULL, NULL, 1, 6, 1);
INSERT INTO `sys_menu` VALUES (28, '/system/init/**', '/sys/init', 'SysInit', '初始化数据库', NULL, NULL, 1, 6, 1);

-- ----------------------------
-- Table structure for sys_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu_role`;
CREATE TABLE `sys_menu_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `mid` int(11) NULL DEFAULT NULL COMMENT '菜单id',
  `rid` int(11) NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 356 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_menu_role
-- ----------------------------
INSERT INTO `sys_menu_role` VALUES (2, 7, 6);
INSERT INTO `sys_menu_role` VALUES (3, 9, 6);
INSERT INTO `sys_menu_role` VALUES (4, 10, 6);
INSERT INTO `sys_menu_role` VALUES (5, 11, 6);
INSERT INTO `sys_menu_role` VALUES (6, 12, 6);
INSERT INTO `sys_menu_role` VALUES (7, 13, 6);
INSERT INTO `sys_menu_role` VALUES (8, 14, 6);
INSERT INTO `sys_menu_role` VALUES (9, 15, 6);
INSERT INTO `sys_menu_role` VALUES (10, 16, 6);
INSERT INTO `sys_menu_role` VALUES (11, 17, 6);
INSERT INTO `sys_menu_role` VALUES (12, 18, 6);
INSERT INTO `sys_menu_role` VALUES (13, 19, 6);
INSERT INTO `sys_menu_role` VALUES (14, 20, 6);
INSERT INTO `sys_menu_role` VALUES (15, 21, 6);
INSERT INTO `sys_menu_role` VALUES (16, 22, 6);
INSERT INTO `sys_menu_role` VALUES (17, 23, 6);
INSERT INTO `sys_menu_role` VALUES (18, 25, 6);
INSERT INTO `sys_menu_role` VALUES (19, 26, 6);
INSERT INTO `sys_menu_role` VALUES (20, 27, 6);
INSERT INTO `sys_menu_role` VALUES (21, 28, 6);
INSERT INTO `sys_menu_role` VALUES (22, 24, 6);
INSERT INTO `sys_menu_role` VALUES (26, 7, 2);
INSERT INTO `sys_menu_role` VALUES (27, 8, 2);
INSERT INTO `sys_menu_role` VALUES (28, 9, 2);
INSERT INTO `sys_menu_role` VALUES (29, 10, 2);
INSERT INTO `sys_menu_role` VALUES (30, 12, 2);
INSERT INTO `sys_menu_role` VALUES (31, 13, 2);
INSERT INTO `sys_menu_role` VALUES (32, 7, 1);
INSERT INTO `sys_menu_role` VALUES (33, 8, 1);
INSERT INTO `sys_menu_role` VALUES (34, 9, 1);
INSERT INTO `sys_menu_role` VALUES (35, 10, 1);
INSERT INTO `sys_menu_role` VALUES (36, 11, 1);
INSERT INTO `sys_menu_role` VALUES (37, 12, 1);
INSERT INTO `sys_menu_role` VALUES (38, 13, 1);
INSERT INTO `sys_menu_role` VALUES (39, 14, 1);
INSERT INTO `sys_menu_role` VALUES (40, 15, 1);
INSERT INTO `sys_menu_role` VALUES (41, 16, 1);
INSERT INTO `sys_menu_role` VALUES (42, 17, 1);
INSERT INTO `sys_menu_role` VALUES (43, 18, 1);
INSERT INTO `sys_menu_role` VALUES (44, 19, 1);
INSERT INTO `sys_menu_role` VALUES (45, 20, 1);
INSERT INTO `sys_menu_role` VALUES (46, 21, 1);
INSERT INTO `sys_menu_role` VALUES (47, 22, 1);
INSERT INTO `sys_menu_role` VALUES (48, 23, 1);
INSERT INTO `sys_menu_role` VALUES (49, 24, 1);
INSERT INTO `sys_menu_role` VALUES (50, 25, 1);
INSERT INTO `sys_menu_role` VALUES (51, 26, 1);
INSERT INTO `sys_menu_role` VALUES (52, 27, 1);
INSERT INTO `sys_menu_role` VALUES (53, 28, 1);
INSERT INTO `sys_menu_role` VALUES (346, 11, 4);
INSERT INTO `sys_menu_role` VALUES (347, 8, 4);
INSERT INTO `sys_menu_role` VALUES (348, 7, 4);
INSERT INTO `sys_menu_role` VALUES (349, 6, 3);
INSERT INTO `sys_menu_role` VALUES (350, 2, 6);
INSERT INTO `sys_menu_role` VALUES (351, 3, 6);
INSERT INTO `sys_menu_role` VALUES (352, 4, 6);
INSERT INTO `sys_menu_role` VALUES (353, 5, 6);
INSERT INTO `sys_menu_role` VALUES (354, 6, 6);

-- ----------------------------
-- Table structure for sys_news
-- ----------------------------
DROP TABLE IF EXISTS `sys_news`;
CREATE TABLE `sys_news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '新闻主图',
  `intro` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '新闻简介',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '作者',
  `column_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属栏目编号',
  `keyword` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关键字',
  `count` int(11) NULL DEFAULT NULL COMMENT '浏览次数',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_news
-- ----------------------------
INSERT INTO `sys_news` VALUES (6, 'success', 'http://localhost:9999/files/c7db59b5930940698244a8f46f01ee7b', '这是成功的第一条数据', '<p><img src=\"http://localhost:9999/files/7645f17f6dfc4cf5818152f64000aa66\" style=\"max-width:100%;\" contenteditable=\"false\"/>111111111</p>', 'ces', '1', '1', NULL, '2021-12-17 09:45:00', NULL);
INSERT INTO `sys_news` VALUES (7, '测试', 'http://localhost:9999/files/be0660dbf96e4487989a62a06e766cc1', '这是一条新的新闻动态', '<p>高考高考高考动态<img src=\"http://localhost:9999/files/1c8405e8383d475d97431c64ee1bd104\" contenteditable=\"false\" style=\"font-size: 14px; color: var(--el-text-color-regular); max-width: 100%;\"/></p>', 'ces', '2', '高考', NULL, '2021-12-19 22:46:09', NULL);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `nameZh` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'ROLE_manager', '部门经理');
INSERT INTO `sys_role` VALUES (2, 'ROLE_personnel', '人事专员');
INSERT INTO `sys_role` VALUES (3, 'ROLE_recruiter', '招聘主管');
INSERT INTO `sys_role` VALUES (4, 'ROLE_train', '培训主管');
INSERT INTO `sys_role` VALUES (5, 'ROLE_performance', '薪酬绩效主管');
INSERT INTO `sys_role` VALUES (6, 'ROLE_admin', '系统管理员');
INSERT INTO `sys_role` VALUES (8, 'ROLE_test', '测试角色');
INSERT INTO `sys_role` VALUES (9, 'tes1', '测试的');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT 'gkb123456' COMMENT '密码',
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `gender` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------

-- ----------------------------
-- Procedure structure for addCol
-- ----------------------------
DROP PROCEDURE IF EXISTS `addCol`;
delimiter ;;
CREATE PROCEDURE `addCol`(in colName varchar(30),in parentId int,in enabled boolean,out result int,out result2 int)
begin
	declare did int;
	declare pDepPath varchar(64);
	insert into sys_column set name=colName,parentId=parentId,enabled=enabled;
	select row_count() into result;
	select last_insert_id() into did;
	set result2=did;
	select depPath into pDepPath from sys_column where id=parentId;
	update sys_column set depPath=concat(pDepPath,'.',did) where id=did;
	update sys_column set isParent=true where id=parentId;
end
;;
delimiter ;

-- ----------------------------
-- Procedure structure for deleteCol
-- ----------------------------
DROP PROCEDURE IF EXISTS `deleteCol`;
delimiter ;;
CREATE PROCEDURE `deleteCol`(in did int,out result int)
begin
	declare ncount int;
	declare pid int;
	declare pcount int;
	declare a int;
	select count(*) into a from sys_column where id=did and isParent=false;
	if a=0 then set result=-2;
	else
	select count(*) into ncount from sys_news where column_id=did;
	if ncount>0 then set result=-1;
	else
	select parentId into pid from sys_column where id=did;
	delete from sys_column where id=did and isParent=false;
	select row_count() into result;
	select count(*) into pcount from sys_column where parentId=pid;
	if pcount=0 then update sys_column set isParent=false where id=pid;
	end if;
	end if;
	end if;
end
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
