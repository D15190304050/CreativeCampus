CREATE TABLE `teacher_recent_activities`
(
    `id`               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`       BIGINT                                         NOT NULL COMMENT 'ID of the teacher.',
    `activity_type_id` BIGINT                                         NOT NULL COMMENT 'ID of the type of activity.',
    `activity_detail`  VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the table_name.',
    `time`             DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Time of occurrence.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_activity_type_id` (`activity_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of recent activities of teachers.';