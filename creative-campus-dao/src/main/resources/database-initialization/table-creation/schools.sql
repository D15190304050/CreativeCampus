CREATE TABLE `schools`
(
    `id`   BIGINT AUTO_INCREMENT COMMENT 'ID of the school.',
    `name` VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the school.',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_name` (`name`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of schools.';