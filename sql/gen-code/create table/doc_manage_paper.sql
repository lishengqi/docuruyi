/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : ry

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2019-07-07 14:28:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `doc_manage_paper`
-- ----------------------------
DROP TABLE IF EXISTS `doc_manage_paper`;
CREATE TABLE `doc_manage_paper` (
  `paper_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '论文Id',
  `paper_kind` int(11) NOT NULL COMMENT '论文类别',
  `paper_title` varchar(255) NOT NULL COMMENT '论文题目',
  `author1_id` int(11) NOT NULL COMMENT '作者id-备用',
  `author1_name` varchar(255) NOT NULL DEFAULT '' COMMENT '一作名字',
  `author1_major_id` int(11) NOT NULL COMMENT '一作专业',
  `author2_name` varchar(255) NOT NULL DEFAULT '' COMMENT '二作名字',
  `author2_major_id` int(11) NOT NULL COMMENT '二作专业',
  `author_name_other` varchar(255) NOT NULL DEFAULT '' COMMENT '其他作者名字',
  `journal_name` varchar(255) NOT NULL DEFAULT '' COMMENT '期刊名字',
  `journal_number` varchar(255) NOT NULL DEFAULT '' COMMENT '刊号',
  `journal_search_number` varchar(255) NOT NULL DEFAULT '' COMMENT '期刊检索号',
  `publish_date` date NOT NULL COMMENT '出版时间',
  `reel_number` varchar(255) NOT NULL DEFAULT '' COMMENT '卷号',
  `page_start` int(11) NOT NULL COMMENT '起始页码',
  `page_end` int(11) NOT NULL COMMENT '终止页码',
  `funds` text COMMENT '基金',
  `level_id_ccec` int(11) NOT NULL COMMENT '校内认定级别',
  `attach_file` varchar(255) NOT NULL COMMENT '附件',
  `notes` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`paper_id`)
) ENGINE=InnoDB auto_increment=1 comment = '作证管理-论文表';

-- ----------------------------
-- Records of doc_manage_paper
-- ----------------------------
