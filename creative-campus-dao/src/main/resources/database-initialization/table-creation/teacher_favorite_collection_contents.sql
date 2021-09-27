CREATE TABLE `teacher_favorite_collection_contents`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `collection_id` BIGINT   NOT NULL COMMENT 'ID of the favorite collection.',
    `content_id`    BIGINT   NOT NULL COMMENT 'ID of the content in the collection.',
    `creation_time` DATETIME NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`   DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_collection_id` (`collection_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of favorite collection contents of teachers.';