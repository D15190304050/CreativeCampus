CREATE TABLE `homework`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Name of the homework.',
    `description`        VARCHAR(100) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Description of the homework.',
    `discipline_id`      BIGINT                                         NOT NULL COMMENT 'ID of the discipline that the homework belongs to',
    `homework_body_url`  VARCHAR(200) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'URL of the homework body.',
    `creator_id`         BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_discipline_id` (`discipline_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of homework.';