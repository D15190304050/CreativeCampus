CREATE TABLE `answers_of_questions`
(
    `id`                   BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `student_id`           BIGINT   NOT NULL COMMENT 'ID of the student.',
    `question_set_id`      BIGINT COMMENT 'ID of the question set (if exists).',
    `question_id`          BIGINT   NOT NULL COMMENT 'ID of the question.',
    -- TODO: Correct english here.
    `question_type_number` INT COMMENT 'Number of question type.',                    -- (第几大题)
    `question_number`      INT COMMENT 'Number of the question in the question set.', -- (第几小题)
    `answer_text`          VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Answer of the question (only for answers of non-rich text).',
    `rich_text_answer_url` VARCHAR(100) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Url of answer of the question (only for answers of rich text).',
    `score`                DECIMAL  NOT NULL DEFAULT 0.0 ON UPDATE total_score * normalized_score COMMENT 'A student''s score on a question.',
    `total_score`          DECIMAL  NOT NULL DEFAULT 0.0 ON UPDATE score / normalized_score COMMENT 'Total score of the question.',
    `normalized_score`     DECIMAL  NOT NULL DEFAULT 0.0 ON UPDATE score / total_score COMMENT 'Normalized score (= score / total_score).',
    `creation_time`        DATETIME NOT NULL DEFAULT NOW() COMMENT 'Submit time of the answer.',
    `update_time`          DATETIME NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_student_id` (`student_id`),
    KEY `idx_question_id` (`question_id`),
    KEY `idx_question_set_id` (`question_set_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of answers of questions.';
-- Sharding by: student_id, question_id