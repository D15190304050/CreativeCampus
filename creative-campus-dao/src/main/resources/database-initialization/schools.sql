CREATE TABLE `schools`
(
    `id`   BIGINT AUTO_INCREMENT COMMENT 'ID of the school.',
    `name` VARCHAR(200) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Name of the school.',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_name` (`name`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of schools.';