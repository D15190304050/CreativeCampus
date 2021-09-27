CREATE TABLE `question_comments`
(
    `id`                          BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `question_id`                 BIGINT   NOT NULL COMMENT 'ID of the question of the comment.',
    `pre_question_comment_id`     BIGINT   NOT NULL COMMENT 'ID of the pre question comment.',
    `question_comment_content_id` BIGINT   NOT NULL COMMENT 'ID of the comment content.',
    `account_id`                  BIGINT   NOT NULL COMMENT 'ID of the account that provides the comment.',
    `publish_time`                DATETIME NOT NULL COMMENT 'Time of the publish of the comment.',
    `is_deleted`                  BOOLEAN  NOT NULL COMMENT 'A flag indicating if the comment is deleted.',
    PRIMARY KEY (`id`),
    KEY `idx_question_id` (`question_id`),
    KEY `idx_account_id` (`account_id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of question comments.';