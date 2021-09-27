CREATE TABLE difficulty_types
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the difficulty type.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Description of the table_name.',

    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of difficulty types.';