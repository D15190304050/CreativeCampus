CREATE TABLE `teacher_favorite_collections`
(
    `id`               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`       BIGINT                                         NOT NULL COMMENT 'ID of the teacher.',
    `favorite_type_id` BIGINT                                         NOT NULL COMMENT 'ID of type of favorites.',
    `name`             VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `creation_time`    DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`      DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_favorite_type_id` (`favorite_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of favorite collections of teachers.';