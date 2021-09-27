CREATE TABLE `recent_visits`
(
    `id`                BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `teacher_id`        BIGINT   NOT NULL COMMENT 'ID of the teacher.',
    `visit_type_id`     BIGINT   NOT NULL COMMENT 'ID of type of the visit.',
    `visited_object_id` BIGINT   NOT NULL COMMENT 'ID of the object that is visited.',
    `time`              DATETIME NOT NULL DEFAULT NOW() COMMENT 'Time of occurrence.',
    PRIMARY KEY (`id`),
    KEY `idx_teacher_id` (`teacher_id`),
    KEY `idx_visit_type_id` (`visit_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of recent visits.';