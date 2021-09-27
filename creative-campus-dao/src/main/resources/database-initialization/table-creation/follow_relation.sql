CREATE TABLE `follow_relation`
(
    `id`                     BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `source_account_id`      BIGINT   NOT NULL COMMENT 'Source account id.',
    `destination_account_id` BIGINT   NOT NULL COMMENT 'Destination account id.',
    `start_time`             DATETIME NOT NULL DEFAULT NOW() COMMENT 'Start time of the follow relation.',
    PRIMARY KEY (`id`),
    KEY `idx_source_account_id` (`source_account_id`),
    KEY `idx_destination_account_id` (`destination_account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of table_name.';