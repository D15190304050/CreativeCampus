CREATE TABLE `labels`
(
    `id`              BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(100) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Name of the label.',
    `recent_frequency_id` BIGINT NOT NULL COMMENT 'Frequency of occurrence of the label in recent.',
    `creator_id`           BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`        DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`   BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`          DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of labels.';