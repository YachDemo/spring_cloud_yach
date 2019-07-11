CREATE TABLE `y_user_info` (
`id`  varchar(32) CHARACTER SET utf16 COLLATE utf16_general_ci NOT NULL DEFAULT '' COMMENT '主键id' ,
`user_name`  varchar(64) CHARACTER SET utf16 COLLATE utf16_general_ci NOT NULL COMMENT '用户名' ,
`password`  varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`token`  varchar(64) CHARACTER SET utf16 COLLATE utf16_general_ci NOT NULL COMMENT 'token' ,
`create_time`  datetime NOT NULL ,
`update_time`  datetime NOT NULL ,
`is_delete`  int(1) NOT NULL COMMENT '删除标识 0-删除 1-未删除' ,
PRIMARY KEY (`id`)
)