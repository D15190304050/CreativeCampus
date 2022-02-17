CREATE TABLE `answers_of_questions`
(
    `id`            BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `student_id`    BIGINT   NOT NULL COMMENT 'ID of the student.',
    `question_id`   BIGINT   NOT NULL COMMENT 'ID of the question.',
    `answer_text`   VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Answer of the question (only for questions of non-analysis types).',
    `creation_time` DATETIME NOT NULL DEFAULT NOW() COMMENT 'Submit time of the answer.',
    `update_time`   DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_student_id` (`student_id`),
    KEY `idx_question_id` (`question_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of answers of questions.';
-- Sharding by: student_id, question_id