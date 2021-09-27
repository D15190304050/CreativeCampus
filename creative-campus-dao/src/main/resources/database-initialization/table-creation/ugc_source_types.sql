CREATE TABLE ugc_source_types
(
    `id`          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`        VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the ugc source type.',
    `description` VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of ugc source types, actually only 2 types are needed, reprint and original.';