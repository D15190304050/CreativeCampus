CREATE TABLE `administrators`
(
    `id`         BIGINT AUTO_INCREMENT COMMENT 'ID of the administrator.',
    `account_id` BIGINT NOT NULL COMMENT 'ID of the associated account.',
    PRIMARY KEY (`id`),
    UNIQUE KEY (`account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of administrators.';