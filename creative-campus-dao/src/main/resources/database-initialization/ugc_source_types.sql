CREATE TABLE ugc_source_types
(
    `id`   BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name` VARCHAR(100) CHARSET utf8_mb4 COLLATE utf8_bin NOT NULL COMMENT 'Name of the ugc source type, actually only 2 types are needed, reprint and original.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8_mb4
    COLLATE utf8_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of ugc source types.';