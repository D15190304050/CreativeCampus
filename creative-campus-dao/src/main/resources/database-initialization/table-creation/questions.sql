CREATE TABLE `questions`
(
    `id`                       BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `source_type_id`           INT                                            NOT NULL COMMENT 'Source type of the question, 0-reprint, 1-original',
    `question_type_id`         BIGINT                                         NOT NULL COMMENT 'ID of the question type.',
    `difficulty_type_id`       BIGINT                                         NOT NULL COMMENT 'ID of the difficulty of the question',
    `question_body_url`        VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the question body.',
    `discipline_id`            BIGINT                                         NOT NULL COMMENT 'ID of the discipline that the question belongs to.',
    `answer_body_url`          VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the answer body of the question.',
    `estimated_time_to_finish` INT                                            NOT NULL COMMENT 'Estimated time to finish the question, unit: seconds.',
    `tag`                      VARCHAR(500) CHARSET utf8mb4 COLLATE  utf8mb4_bin          DEFAULT NULL COMMENT 'Other information of this question.',
    `creator_id`               BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`            DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id`       BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`              DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_creator_id` (`creator_id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_difficulty_type_id` (`difficulty_type_id`),
    KEY `idx_question_type_id` (`question_type_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of questions.';