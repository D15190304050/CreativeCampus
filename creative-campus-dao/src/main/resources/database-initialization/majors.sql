CREATE TABLE `majors`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'ID of the major.',
    `name`          VARCHAR(200) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Name of the major',
    `discipline_id` BIGINT                                         NOT NULL COMMENT 'ID of the discipline that the major belongs to.',
    `description`   VARCHAR(500) CHARSET utf8_mb4 COLLATE utf8_bin COMMENT 'Description of the major',
    PRIMARY KEY (`id`),
    UNIQUE KEY `idx_name` (`name`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of majors.';